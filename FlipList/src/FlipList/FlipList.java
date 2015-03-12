package FlipList;

public class FlipList extends javax.swing.JFrame{
    public static void main(String[] args){

        //Theme 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        Database db = new Database();
//        db.createTable("CREATE TABLE user ( fullname TEXT, username TEXT UNIQUE, password TEXT, email    TEXT UNIQUE, PRIMARY KEY ( username ) )");
//        db.createTable("CREATE DATABASE fliplist");
        
        
        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeForm().setVisible(true);
            }
        });
     
        // Theme ends
        
//        WelcomeForm mainForm = new WelcomeForm();
//        mainForm.setVisible(true);
        
//        Page mainPage = new Page();
//        mainPage.setVisible(true);
        
    }
}
