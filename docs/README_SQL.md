Creating a complete Java JAR program from scratch in this format is beyond the scope of a single response. However, I can provide you with a basic outline and code snippets to get you started on developing a JAR program that executes SQL files against a JDBC connection.

Step 1: Set up your project and dependencies
First, make sure you have a Java development environment set up and a build tool like Maven or Gradle. You'll also need the JDBC driver for your database (e.g., MySQL, PostgreSQL, etc.). Include the JDBC driver as a dependency in your build tool configuration.

Step 2: Create the main class
Create a Java class that serves as the entry point for your JAR program. In this example, let's call it `SQLExecutor`.

```java
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
```

Step 3: Build your JAR
Using your build tool (e.g., Maven or Gradle), package your project into a JAR file. The process varies depending on the build tool you're using.

Step 4: Execute the JAR
Now, you can execute the JAR program from the command line, providing the JDBC URL and SQL file as command-line arguments.

```bash
java -jar SQLExecutor.jar jdbc:mysql://localhost:3306/mydatabase db_script.sql
```

Remember to replace `jdbc:mysql://localhost:3306/mydatabase` with your actual JDBC URL and `db_script.sql` with the name of your SQL file.

Note: This is a basic implementation, and there are many improvements you can make, such as handling errors more gracefully, supporting different database types, using connection pooling, etc. Additionally, keep in mind that executing SQL scripts directly from files can be a security risk if not handled properly, so use caution when implementing this in a production environment.
