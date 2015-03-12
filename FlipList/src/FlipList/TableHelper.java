package FlipList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class TableHelper {

    public void fillTable(JTable table){
        Connection c;
        Statement st;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:fliplist.db");
            c.setAutoCommit(false);
            st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from lists");
            //To remove previously added rows
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(rs.getRow() - 1, row);
            }

            rs.close();
            st.close();
            c.close();
        } catch (SQLException e) {
            // next to code, show error to user
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TableHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
