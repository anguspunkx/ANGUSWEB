
package programa_flota;


public class TICKET {
    
    String RUTA;
    int Distancia;
    int MantenimientosCarro;
    int OtrosCostos;
    int Rentabilidad=1;
    int KMPORGALON=5;
   
    
    public TICKET(String RUTA,int Distancia,int MantenimientosCarro,int OtrosCostos,int Rentabilidad)
    {
    this.RUTA=RUTA;
    this.Distancia=Distancia;
    this.MantenimientosCarro=MantenimientosCarro;
    this.OtrosCostos=OtrosCostos;
    this.Rentabilidad=Rentabilidad;
    }
}
