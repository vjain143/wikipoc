import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExecutor {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java -jar SQLExecutor.jar <jdbc_url> <sql_file>");
            return;
        }

        String jdbcUrl = args[0];
        String sqlFile = args[1];

        try {
            // Load JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establish JDBC connection
            Connection connection = DriverManager.getConnection(jdbcUrl);

            // Execute SQL statements from the file
            executeSqlFromFile(connection, sqlFile);

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeSqlFromFile(Connection connection, String sqlFile) throws SQLException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sqlFile))) {
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
