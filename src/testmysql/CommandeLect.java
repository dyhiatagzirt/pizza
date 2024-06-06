package testmysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CommandeLect {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/pizza";
        String login = "root"; 
        String passwd = ""; 

        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");

            
            cn = DriverManager.getConnection(url, login, passwd);

            
            st = cn.createStatement();

            
            String sql = "SELECT * FROM commande";

            
            rs = st.executeQuery(sql);

            
            while (rs.next()) {
                System.out.println("Numéro de commande: " + rs.getString("NroCmde") +
                        ", Date: " + rs.getString("DateCmde") +
                        ", Heure: " + rs.getString("HeureCmde") +
                        ", Numéro de client: " + rs.getString("NroClieCmde") +
                        ", Numéro de livraison: " + rs.getString("NroLivrCmde"));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
