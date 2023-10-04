
package ServiPeru;

import java.sql.*;
public class Conexion {
    public static void main(String[] args) {   
    try {
        
    //Cargar driver
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    //Conectar con la base de datos
    String url="jdbc:sqlserver://localhost:1433;databaseName=ServiPeru";
    Connection con=DriverManager.getConnection(url, "Martin", "8326");
    //Crear consulta
    Statement st=con.createStatement();
    //Ejecutar consulta
    String Consulta = "select Usuario,Contraseña from Usuarios";
    ResultSet res = st.executeQuery(Consulta);
    // prueba de inicio de secion
    String usu = "Martin";
    String Contra = "8326";
    int i=0;
    while(res.next()){
        String DatoU= res.getString("Usuario");
        String DatoC= res.getString("Contraseña");
        if(DatoU.equals(usu) && DatoC.contains(Contra)){
            System.out.println("Inicio correcto");
            break;
        }else{
            i =1;
        }
    }
    if(i==1){
        System.out.println("Credenciales invalidas");
    }
    //Cerrar estancia
    st.close();
    //Cerrar conexion
    con.close();
    
    }catch (ClassNotFoundException e){
      e.printStackTrace();
    }catch (SQLException e){
      e.printStackTrace();
    }
    
  }
 
}
