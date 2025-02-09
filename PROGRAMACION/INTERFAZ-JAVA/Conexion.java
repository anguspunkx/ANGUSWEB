
package ProyectoFinal;


import java.sql.Connection; //se utiliza para representar una conexión a la base de datos.
import java.sql.DriverManager; // se utiliza para obtener conexiones a la base de datos.
import java.sql.PreparedStatement; //se utiliza para ejecutar consultas parametrizadas en la base de datos.
import java.sql.ResultSet;//se utiliza para representar los resultados de una consulta a la base de datos.
import java.sql.SQLException; //se utiliza para manejar excepciones relacionadas con errores de base de datos.
import java.util.ArrayList; //se utiliza para almacenar los resultados de consultas en memoria.
import javax.swing.JOptionPane;

//Paquete/Clase

public class Conexion {
    
   ArrayList <Persona> personaLista; //Lista que almacena los objetos de la clase persona
   private Connection conexion; //Objeto que representa la conexión a la base de datos.
   private ResultSet rs=null; //Objeto para almacenar los resultados de una consulta.
   private PreparedStatement st; //Objeto para ejecutar consultas parametrizadas en la base de datos
    
    public  void conectarMysql(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pedidosbd",
                    "root","");
            if(conexion!=null){
            JOptionPane.showMessageDialog(null,
                    "Se conectó correctamente a la base de datos");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,
                    "Error en la conexion de la base de datos "
                    +e.toString());
        }
    }
    
    public ArrayList<Persona> cargarDatos() {
        conectarMysql();
        personaLista = new ArrayList<>();
        
        String sql = "SELECT * FROM datos";

        try{
                 st = conexion.prepareStatement(sql);
                 rs = st.executeQuery();
                 

            while (rs.next()) {
                String usuario = rs.getString("USUARIO");
                String libro = rs.getString("LIBRO");
                String representante = rs.getString("AUTOR");
                String pais = rs.getString("DESTINO");
                String email = rs.getString("EMAIL");

                Persona cargar = new Persona(usuario, libro, representante, pais, email);
                personaLista.add(cargar);
            }
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,
                    "Error al cargar los datos\n" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return personaLista;
    }
   
    public boolean buscarDato(String usuario){ 
       boolean encontrado=false;
        try{
            st=conexion.prepareStatement("select * "
                    + "from pedidosbd where usuario="+usuario);
            rs=st.executeQuery();
            if(rs!=null){
                encontrado=true;
            }
        }catch(Exception e){
        }
       return encontrado;
   }
   
     public void cerrar(){
       try{
           conexion.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,
                   "ERROR"+"\n"+ex.toString());
       }
   }

      public void insertarPersona(Persona persona) {
    try {
        // Preparar la sentencia SQL para la inserción
        
        String sql = "INSERT INTO datos (USUARIO, LIBRO, AUTOR, DESTINO, EMAIL) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement statement = conexion.prepareStatement(sql);
        
        // Establecer los parámetros de la sentencia SQL
        statement.setString(1, persona.getUsuario());
        statement.setString(2, persona.getLibro());
        statement.setString(3, persona.getRepresentante());
        statement.setString(4, persona.getPais());
        statement.setString(5, persona.getEmail());
        
        // Ejecutar la sentencia SQL de inserción
        statement.executeUpdate();
        
        // Cerrar el statement
        statement.close();
        
        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(null, 
                "Pedido insertado correctamente en la base de datos",
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e)
    {
        // Mostrar un mensaje de error en caso de que ocurra una excepción SQL
        JOptionPane.showMessageDialog(null,
                "Error al insertar persona en la base de datos: " 
                        + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }
}
}

