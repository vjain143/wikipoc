import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParallelSQLFileExecutor {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ParallelSQLFileExecutor <jdbc_url> <sql_file_path>");
            return;
        }

        String jdbcUrl = args[0];
        String sqlFilePath = args[1];

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        try {
            // Load JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Create a JDBC connection for parallel use
            Connection connection = DriverManager.getConnection(jdbcUrl);

            // Read SQL statements from the file
            List<String> sqlStatements = readSqlStatementsFromFile(sqlFilePath);

            // Execute SQL statements in parallel
            for (String sqlStatement : sqlStatements) {
                executor.execute(() -> executeSqlStatement(connection, sqlStatement));
            }

            // Shut down the executor and wait for all tasks to complete
            executor.shutdown();
            executor.awaitTermination(10, TimeUnit.MINUTES); // Adjust the timeout as per your requirements

            // Close the JDBC connection
            connection.close();
        } catch (ClassNotFoundException | SQLException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readSqlStatementsFromFile(String filePath) {
        List<String> sqlStatements = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder statementBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                statementBuilder.append(line).append(" ");
                if (line.trim().endsWith(";")) {
                    sqlStatements.add(statementBuilder.toString());
                    statementBuilder.setLength(0); // Reset the statement builder
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlStatements;
    }

    private static void executeSqlStatement(Connection connection, String sqlStatement) {
        try (Statement statement = connection.createStatement()) {
            statement.execute(sqlStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
