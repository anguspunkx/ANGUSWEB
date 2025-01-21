
package programa_flota;


public class RUTA {
    int ID;
    int distancia;
    String NombreRuta;
    int activo=1;
    
      //METOCO CONSTRUCTOR DE RUTA
        public RUTA(String NombreRuta,int ID,int distancia,int activo)
                
        {   this.NombreRuta=NombreRuta;
            this.ID=ID;
            this.distancia=distancia;
            this.activo=activo;
            
            System.out.println("Ruta creada con las siguientes caracteristicas:");
            System.out.println("Nombre de la ruta: "+NombreRuta+", "+"ID: "+ID+", "+ "Distancia en km: "+distancia+"KM,"+"ESTADO ACTIVACION :"+ activo);
        }
        
}
