package testmysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
 
// import jdbcMysqlPizza.Pizza;
 
public class javamysql {
 
  public static void main(String[] args) {
 
    String url = "jdbc:mysql://localhost/pizza";
 
    String login = "root";
    String passwd = "";
 
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
 
    try {
      // Etape 1 : Chargement du driver
      Class.forName("com.mysql.cj.jdbc.Driver");
 
      // Etape 2 : récupération de la connexion
      cn = DriverManager.getConnection(url, login, passwd);
 
      // Etape 3 : Création d'un statement
      st = cn.createStatement();
 
      String sql = "SELECT * FROM pizza  ";
 
      // Etape 4 : exécution requête
      rs = st.executeQuery(sql);
 
      while (rs.next()) {
    	  System.out.println(rs.getString("DesignPizz"));
    	  System.out.println(rs.getString(1));
    	  
    	 String nroPizza = rs.getString(1);
         String designPizza = rs.getString(2);
         String tarifPizza = rs.getString(3);

                        //creation d'un objet
         Pizza itemPizza = new Pizza(nroPizza, designPizza, tarifPizza);
                       //affichage de l'objet créé
         System.out.println(itemPizza);
         

   	}
     
 
      // Si récup données alors étapes 5 (parcours Resultset)
      System.out.println(rs);
 
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
 
  }
 
}