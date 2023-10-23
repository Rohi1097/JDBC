import java.sql.*;

public class JDBC {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "Rohith@10");
            Statement stmt = con.createStatement();
            
            System.out.println("Inserting records");

            String deleteSQL = "DELETE FROM employees WHERE person_id = 1";
            stmt.executeUpdate(deleteSQL);
            System.out.println("Record deleted successfully.");
            
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
