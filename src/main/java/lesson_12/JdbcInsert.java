package lesson_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcInsert {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb?" +
                "useSSl=false?" +
                "useUnicode=true&" +
                "useJDBCCompliantTimezoneShift=true&" +
                "useLegacyDatetimeCode=false&" +
                "serverTimezone=UTC";
        String user = "root";
        String password = "metr0Md@";

        int id = 2;
        String userName = "Martin";
        String userEmail = "martneb@aol.com";
        String sql = "INSERT INTO User(Id, Name, Email) VALUES(?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, id);
            pst.setString(2, userName);
            pst.setString(3, userEmail);
            pst.executeUpdate();

            System.out.println("A new user has been inserted");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JdbcInsert.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }
}
