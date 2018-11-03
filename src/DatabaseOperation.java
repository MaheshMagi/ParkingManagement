import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.logging.Logger;

public class DatabaseOperation {
    public static Connection c = null;
    public static Statement stmt = null;
    public static ResultSet rs = null;
    public static ArrayList<CarDetails> DbArray = new ArrayList();
    public static void updateQuery(String query) {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/Db1",
                            "postgres", "postgres");
            stmt = c.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
        }
    }

    public static void insertDb(CarDetails carDetails) {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/Db1",
                            "postgres", "postgres");
            stmt = c.createStatement();
            String sql = "INSERT INTO Parkingdb VALUES ('" + carDetails.Username + "','" + carDetails.CarModel + "',TIMESTAMP '" + carDetails.StartDate + "',TIMESTAMP '" + carDetails.EndDate + "');";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }
    }

    public static ResultSet selectQuery (String query){
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/Db1",
                            "postgres", "postgres");
            stmt = c.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            Logger.getLogger("Error while getting ResultSet");
        }
        return rs;
    }
}
