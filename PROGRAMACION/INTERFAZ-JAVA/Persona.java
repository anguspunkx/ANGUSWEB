
package ProyectoFinal;

public class Persona {

    public static String nombre;
    public static String email;
    public static String telefono;
    public static String genero;
    public static String representante;
    public static String pais;
    public static String ciudad;
    public static String libro;
    public static String usuario;
    
     public Persona(){
        
    }
     
    public Persona(String usuario, String libro,String representante, String pais, String email){
       
    }
    
    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Persona.usuario = usuario;
    }
    
    public static String getLibro() {
        return libro;
    }

    public static void setLibro(String libro) {
        Persona.libro = libro;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String apellido) {
        Persona.email = apellido;
    }

    public static String getTelefono(String text) {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Persona.telefono = telefono;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Persona.genero = genero;
    }

    public static String getRepresentante() {
        return representante;
    }

    public static void setRepresentante(String representante) {
        Persona.representante = representante;
    }

    public static String getPais() {
        return pais;
    }

    public static void setPais(String pais) {
        Persona.pais = pais;
    }

    public static String getCiudad() {
        return ciudad;
    }

    public static void setCiudad(String ciudad) {
        Persona.ciudad = ciudad;
    }
    
    
    
    
}

