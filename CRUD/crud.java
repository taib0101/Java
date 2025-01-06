
/**
 * run this command to execute this file
 * $ java -classpath ./postgresql-42.7.4.jar ./crud.java
 * $ psql -U taib -W -h localhost -p 5432 -d taibDatabase;
 */
import java.sql.*;
import java.util.Scanner;

class DatabaseConnections {

    private Connection connection;
    private Statement statement;

    // Define connection string, username, and password
    private String url = "jdbc:postgresql://localhost:5432/taibDatabase";
    private String user = "taib";
    private String password = "1234";

    public DatabaseConnections() {
        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish connection
            this.connection = DriverManager.getConnection(this.url, this.user, this.password);

            // Create statement
            this.statement = connection.createStatement();

            System.out.println("Connected to PostgreSQL!");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public void create(String sql) {
        try {
            // String sql = "INSERT INTO employee (id, firstname, salary) VALUES (1, 'Taib', 15000)";
            this.statement.executeUpdate(sql);
            System.out.println("Inserted Successfully");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public void read(String sql) {
        try {
            // String sql = "SELECT * FROM employee";
            ResultSet result = this.statement.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("id");
                String firstname = result.getString("firstname");
                int salary = result.getInt("salary");

                System.out.printf("id: %d, firstname: %s, salary: %d\n", id, firstname, salary);
            }
            System.out.println("Readed successfully");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public void update(String sql) {
        try {
            // String sql = "UPDATE employee SET firstname='murtaza' WHERE id=1 ";
            this.statement.executeUpdate(sql);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        System.out.println("Updated successfully");
    }

    public void delete(String sql) {
        try {
            // String sql = "Delete FROM employee WHERE id=1";
            this.statement.executeUpdate(sql);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        System.out.println("Delete successfully");
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}

public class crud {

    public static void main(String[] args) {
        DatabaseConnections connections = new DatabaseConnections();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int inputNumber = scanner.nextInt();
            scanner.nextLine();

            String sql = scanner.nextLine();
            System.out.printf("sql = %s\n", sql);
            
            if (inputNumber == 0) {
                connections.closeConnection();
                break;
            } else if (inputNumber == 1) {
                connections.create(sql);
            } else if (inputNumber == 2) {
                connections.read(sql);
            } else if (inputNumber == 3) {
                connections.update(sql);
            } else if (inputNumber == 4) {
                connections.delete(sql);
            }
        }
    }
}
