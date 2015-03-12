package FlipList;
import java.sql.*;

public class Database {
    
    public void createTable(String query){
        Connection con;
        Statement st;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:fliplist.db");
            st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String insert(String query){
        Connection con;
        Statement st;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:fliplist.db");
            con.setAutoCommit(false);
            st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            con.commit();
            con.close();
            return "true";
        } catch (ClassNotFoundException | SQLException e) {
            String msg = e.getMessage();
            return msg;
        }
    }
}
