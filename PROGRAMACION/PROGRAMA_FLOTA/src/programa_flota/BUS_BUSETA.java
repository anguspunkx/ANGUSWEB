
package programa_flota;


public class BUS_BUSETA {
    //ATRIBUTOS DE LA CLASE BUS BUSETA
    int ID;
    String Placa;
    int Activo=1;
    int Cantidaddepasajeros=20;
    String Ruta=null;
    
    //METOCO CONSTRUCTOR DE BUS_BUSETA
        public BUS_BUSETA(int ID,String Placa,int Activo,int Cantidaddepasajeros)
                
        {   this.ID=ID;
            this.Placa=Placa;
            this.Activo=Activo;
            this.Cantidaddepasajeros=20;
        }
        
}
