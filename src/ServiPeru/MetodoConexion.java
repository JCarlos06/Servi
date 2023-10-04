
package ServiPeru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MetodoConexion {
    public Connection getConexion(){
        Connection con=null;
    try {      
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url="jdbc:sqlserver://localhost:1433;databaseName=ServiPeru";
    con =DriverManager.getConnection(url, "Martin", "8326");
    return con;
    }catch (ClassNotFoundException e){
      return null;
    }catch (SQLException e){
       return null;
    }
}
}
