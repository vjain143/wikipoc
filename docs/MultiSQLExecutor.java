import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MultiSQLExecutor {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java -jar MultiSQLExecutor.jar <jdbc_url> <folder_path>");
            return;
        }

        String jdbcUrl = args[0];
        String folderPath = args[1];

        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            System.out.println("The specified path is not a folder.");
            return;
        }

        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".sql"));

        if (files != null && files.length > 0) {
            try {
                // Load JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                // Establish JDBC connection
                Connection connection = DriverManager.getConnection(jdbcUrl);

                // Execute SQL statements from each file in the folder
                for (File file : files) {
                    executeSqlFromFile(connection, file);
                }

                // Close the connection
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No SQL files found in the specified folder.");
        }
    }

    private static void executeSqlFromFile(Connection connection, File file) throws SQLException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuilder statementBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                // Assuming each SQL statement ends with a semicolon
                if (line.trim().endsWith(";")) {
                    statementBuilder.append(line);
                    String sqlStatement = statementBuilder.toString().trim();
                    executeSqlStatement(connection, sqlStatement);
                    statementBuilder.setLength(0); // Reset the statement builder
                } else {
                    statementBuilder.append(line).append("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void executeSqlStatement(Connection connection, String sqlStatement) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute(sqlStatement);
        }
    }
}
