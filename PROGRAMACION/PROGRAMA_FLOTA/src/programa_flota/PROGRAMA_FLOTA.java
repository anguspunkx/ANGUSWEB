
package programa_flota;
//CLASES IMPORTADAS A MAIN

import java.io.*;                    // Clase para trabajar con archivos try y catch
import programa_flota.*;             // Clases creadas por nosotros
import javax.swing.JOptionPane;      // Clase para capturar datos
import java.text.SimpleDateFormat;   // Clase para formato de fecha
import java.util.Date;               // Clase para traer fecha 

public class PROGRAMA_FLOTA { 
    //MAIN PROGRAMA PRINCIPAL 
    
    public static void main(String[] args) throws IOException {    
        
                    //ARCHIVOS INICIALIZADOS PARA IR GUARDANDO LO QUE SE HAGA EN EL PROGRAMA 
        
                    System.out.println("INICIALIZACION DEL PROGRAMA...");
                    System.out.println("Verificando existencia de archivos....");

                    File recorridos = new File("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Asignacionbusruta.txt");
                    recorridos.createNewFile();
                    System.out.println("El archivo de Buses Y Busetas Existe?: "+recorridos.exists());                 
                    
                    File archivosbusesybusetas = new File("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_busesybusetas.txt");
                    archivosbusesybusetas.createNewFile();
                    System.out.println("El archivo de Buses Y Busetas Existe?: "+archivosbusesybusetas.exists());
                    
                    File archivosrutas = new File("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_rutas_tickets.txt");
                    archivosrutas.createNewFile();
                    System.out.println("El archivo de Rutas Existe?: "+archivosrutas.exists());                   
                    
                    File reportes = new File("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Reportes.txt");
                    reportes.createNewFile();
                    System.out.println("El archivo de Reportes Existe?: "+reportes.exists());
                    
                    System.out.println("ARCHIVOS CREADOS Y VERIFICADOS CORRECTAMENTE ...");                   
                    System.out.println("");
                    
                    //DECLARACION DE VARIABLES                   
                    //OPCIONES MENU
                    int OPCION_MENU;
                    
                    //VARIABLES PARA CREAR BUSES O BUSETAS
                    int IDBUS;
                    int OPCIONBUSOBUSETA;
                    String PLACA_BUS;
                    int OPCION_REGRESO=0;
                    int ACTIVACION_BUS=1;                  
                    int CANTIDAD_DEPASAJEROS;
                    
                    //VARIABLES PARA CREAR RUTAS
                    int IDRUTA;
                    String NOMBRERUTA;
                    int DISTANCIARUTA;
                    int ACTIVACION_RUTA=1;
                    int contador=0;
                    
                    //VARIABLES PARA CREAR TICKETS
                    String RUTATICKET;
                    int DISTANCIATICKET;
                    int MANTENIMIENTOCARRO;
                    int OTROSCOSTOS;
                    int RENTABILIDAD;
                    
                    //VARIABLES PARA VENTA DE TICKETS
                    int CANTIDADDETICKETSACOMPRAR;
                    int VENTASTOTALES;
                    double GANANCIASTOTALES=0;
                
                    //MENU DEL PROGRAMA             
        do
        {
        System.out.println("** BIENVENIDOS AL SISTEMA DE CONTROL **");
        System.out.println(" COOPERATIVA DE TRANSPORTE GAVIMBACHI ");
        System.out.println("        MENU DE OPCIONES        ");
        System.out.println("1.CREAR BUS O BUSETA ");
        System.out.println("2.INACTIVAR BUS O BUSETA");
        System.out.println("3.CREAR RUTA Y ASIGNAR VALOR AL TICKET");
        System.out.println("4.INACTIVAR RUTA");
        System.out.println("5.ASIGNAR RUTA A BUS");
        System.out.println("6.VENDER TICKETES A USUARIOS");
        System.out.println("7.GENERAR REPORTES");
        System.out.println("8.SALIR DEL PROGRAMA");
        System.out.println("");      
        
        OPCION_MENU=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite Una opcion"));  
                     switch(OPCION_MENU)                       
         {
 case 1:{if(OPCION_MENU==1) 
                    {for(int BUSES=0; BUSES<8 ; BUSES++)//CONTADOR DE BUSES QUE LLEVO CREADOS= DETERMINA EL ID UNICO DE MI BUS SIN REPETIR                
                    {                                           
                    System.out.println("Ha ingresado a la opcion 1.CREAR BUS/BUSETA ");
                    OPCIONBUSOBUSETA=Integer.parseInt(JOptionPane.showInputDialog("Si desea crear un bus presione 1 , si desea crear una buseta presione 2"));
                    
                    if(OPCIONBUSOBUSETA==1)
                       {System.out.println("A Continuacion Ingrese PLACA DEL VEHICULO Y el Bus sera activado ");
                        IDBUS=BUSES;
                        PLACA_BUS=JOptionPane.showInputDialog("Por favor ingresa la placa del vehiculo");
                        CANTIDAD_DEPASAJEROS=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pasajeros: "));
                        
                        BUS_BUSETA BUS1 =new BUS_BUSETA(IDBUS,PLACA_BUS,ACTIVACION_BUS,CANTIDAD_DEPASAJEROS);//CREACION DE BUS
                        System.out.println("Bus creado con las siguientes caracteristicas:");
                        String BUSINFO= "ID: "+IDBUS+","+"PLACA: "+PLACA_BUS+", "+"TIPO DE VEHICULO:BUS , "+" ACTIVADO"+", CANTIDAD DE PASAJEROS: "+CANTIDAD_DEPASAJEROS;
                        System.out.println("");
                        System.out.println(BUSINFO);
                        System.out.println("");
                        
                        FileWriter archivo=null;
                        PrintWriter escritor;
                        
                        try
                        {archivo= new FileWriter("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_busesybusetas.txt",true);
                        escritor= new PrintWriter(archivo);
                        
                        escritor.println(BUSINFO);}
                        
                        catch(Exception e)
                        {System.out.println("Error: "+e.getMessage());}
                        
                        finally{archivo.close();}                     
                    }//FIN DE CREACION BUS
                    
                    else if(OPCIONBUSOBUSETA==2)
                    {   System.out.println("A continuacion ingrese placa y la Buseta sera activada ");
                        IDBUS=BUSES;
                        PLACA_BUS=JOptionPane.showInputDialog("Por favor ingresa la placa del vehiculo");
                        CANTIDAD_DEPASAJEROS=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pasajeros: "));
                        
                        BUS_BUSETA BUSETA1 =new BUS_BUSETA(IDBUS,PLACA_BUS,ACTIVACION_BUS,CANTIDAD_DEPASAJEROS);//CREACION DE BUS
                        System.out.println("Buseta creada con las siguientes caracteristicas:");
                        String BUSETAINFO = "ID: "+IDBUS+","+"PLACA: "+PLACA_BUS+","+"TIPO DE VEHICULO:BUSETA ,"+" ACTIVADO"+", CANTIDAD DE PASAJEROS: "+CANTIDAD_DEPASAJEROS;
                        System.out.println(BUSETAINFO);
                        System.out.println("");
                        
                        FileWriter archivo=null;
                        PrintWriter escritor;                       
                        try//LO USAMOS PARA ESCRIBIR EN EL ARCHIVO BUSES Y BUSETAS
                        {archivo= new FileWriter("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_busesybusetas.txt",true);
                        escritor= new PrintWriter(archivo);
                        //ESCRIBIMOS EN EL ARCHIVO//
                        escritor.println(BUSETAINFO);}
                        //LO USAMOS PARA CAPTURAR ERRORESA LA HORA DE ESCRIBIR EN UN ARCHIVO//
                        catch(Exception e)
                        {System.out.println("Error: "+e.getMessage());}
                        //CERRAMOS EL ARCHIVO 
                        finally{archivo.close();}
                    }//FIN DE CREACION BUSETA                    
                    else
                    {System.out.println("La opcion no es valida");}//FIN DE OPCION NO VALIDA ELECCION BUS O BUSETA                                                    
                     System.out.println("");
                     System.out.println("Desea crear otro bus o buseta  ? Digite 1 para si, de lo contrario volveras al menu principal");       
                     OPCION_REGRESO=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite Una opcion"));                  
                    if(OPCION_REGRESO!=1)
                            {break;}
                     }                   
                    }     
                 }        
                  System.out.println("");            
                  break;//CASE 1
              
 case 2: if(OPCION_MENU==2)
              do{
                System.out.println("Ha ingresado a la opcion 2.INACTIVAR BUS O BUSETA");
                System.out.println("");
                System.out.println("LISTA DE BUSES CREADOS: ");
                System.out.println("");               
                //CREACION DE LAS VARIABLES PARA LA LECTURA DEL TXT BUSES Y BUSETAS ANTERIORMENTE DIGITADO               
                String Contenido;
                File Archivo;
                FileReader Lector;
                BufferedReader Lectura;              
                try{//LO USAMOS PARA LEER EL ARCHIVO BUSES O BUSETAS//
                Archivo= new File("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_busesybusetas.txt");
                Lector=new FileReader(Archivo);
                Lectura= new BufferedReader(Lector);                
                Contenido=Lectura.readLine();              
                while(Contenido !=null)//WHILE PARA LEER CON EL BUFFERED READOR TODAS LAS LINEAS QUE NO ESTEN VACIAS
                {System.out.println(Contenido);
                 Contenido=Lectura.readLine();}}
                catch(IOException e)//SI HAY ALGUN FALLO AL LEER EL ARCHIVO EL NO LO MOSTRARA
                {System.out.println("Error al leer el archivo : "+e);}
                
                 //CODIGO PARA BORRAR LINEA DE CODIGO EN EL TXT//ELIMINAR RUTA DEL TXT                                    
                  String Borrar;                                              
                  String filePath = "E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_busesybusetas.txt";  // Ruta del archivo
                  try {//LO USAMOS PARA LEER EL ARCHIVO RUTAS                                     
                      FileReader lector = new FileReader(filePath);
                      BufferedReader lectura = new BufferedReader(lector);
                      // Creamos un StringBuilder para almacenar el nuevo contenido del archivo
                          StringBuilder sb = new StringBuilder();
                      // Escribir palabra a borrar
                     String borrar = JOptionPane.showInputDialog(null, "INGRESE LA PLACA DEL BUS QUE DESEA INACTIVAR:");
                     // Leemos la primera línea del archivo
                     String linea = lectura.readLine();
                    // Creamos un bucle while para leer las demás líneas
                     while (linea != null) {
                   // Verificamos si la línea contiene la parte que queremos borrar
                   if (!linea.contains(borrar)) {
                    // Si la línea no contiene la parte a borrar, la añadimos al StringBuilder
                    sb.append(linea);
                    sb.append("\n");
                }
                // Leemos la siguiente línea
                linea = lectura.readLine();
            }
            // Cerramos el lector
            lectura.close();       
            // Escribimos el nuevo contenido en el archivo
            FileWriter escritor = new FileWriter(filePath);
            BufferedWriter escritura = new BufferedWriter(escritor);
            escritura.write(sb.toString());
            escritura.close();            
           } catch (IOException e) {System.out.println("Excepción al borrar parte del archivo: " + e);}
                //PREGUNTAMOS SI DESEA INACTIVAR OTRO BUS O BUSETA 
                OPCION_REGRESO=Integer.parseInt(JOptionPane.showInputDialog("Desea inactivar otro bus o buseta presione 1 para si , de lo contrario volver al menu principal "));               
                }while((OPCION_REGRESO==1));
              else{}
              System.out.println("");   
              break;//CASE 2
              
 case 3:if(OPCION_MENU==3)
              
               do{
                 System.out.println("Ha ingresado a la opcion 3.CREAR RUTA Y ASIGNAR VALOR AL TICKETE ");
                 NOMBRERUTA=JOptionPane.showInputDialog("Por favor ingresa el nombre de la RUTA");
                 IDRUTA=contador;
                 DISTANCIARUTA=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la distancia en KM:"));
                 contador++;
                 RUTA RUTA1 = new RUTA(NOMBRERUTA,IDRUTA,DISTANCIARUTA,ACTIVACION_RUTA);//SE CREA EL OBJETO RUTA               
                 System.out.println("");
                
                 RUTATICKET=NOMBRERUTA;
                 DISTANCIATICKET=DISTANCIARUTA;
                 MANTENIMIENTOCARRO=Integer.parseInt(JOptionPane.showInputDialog("Costos generales de mantenimiento del vehiculo (VALOR POR TICKETE) "));
                 OTROSCOSTOS=Integer.parseInt(JOptionPane.showInputDialog("Otros costos a tener en cuenta del viaje, ejemplo peajes y mantenimiento de vias  (VALOR POR TICKETE) "));
                 RENTABILIDAD=1;
                 
                 int ACPM=9614;
                 double  Cantidadpasajerosporbus=20;
                 int COSTOKMPORGALON=ACPM/5;
                 int CalculodeCostoViaje = DISTANCIATICKET*COSTOKMPORGALON+MANTENIMIENTOCARRO+OTROSCOSTOS;
                 int RentabilidadDelviaje = CalculodeCostoViaje*RENTABILIDAD;
                 int CostodeviajeconRentabilidad = CalculodeCostoViaje+RentabilidadDelviaje;
                 double Costodelticketa50porciento = CostodeviajeconRentabilidad/(Cantidadpasajerosporbus*0.5);
                               
                 System.out.println("CARACTERISTICAS DE LA RUTA Y DEL TICKETE: ");
                 String TICKET_INFO ="ID: "+IDRUTA+", RUTA: "+RUTATICKET+", DISTANCIA: "+DISTANCIATICKET+"KM, "+"MANTENIMIENTOS GENERALES: "+MANTENIMIENTOCARRO+"$"+", OTROS COSTOS: "+OTROSCOSTOS+"$"+", "+"PRECIO DEL TICKET: "+Costodelticketa50porciento+" $";
                 System.out.println(TICKET_INFO);
                 TICKET Ticket1=new TICKET(RUTATICKET,DISTANCIATICKET,MANTENIMIENTOCARRO,OTROSCOSTOS,RENTABILIDAD);//TICKET CREADO
                                  
                        System.out.println("El costo del tickete a la venta considerando el 50% del bus ocupado es: "+"$"+Costodelticketa50porciento+"Pesos");
                        FileWriter archivo5=null;
                        PrintWriter escritor5;
                        
                       //ALMACENAR RUTAS CON VALOR DE TICKETES CREADOS EN TXT 
                        try
                        {archivo5= new FileWriter("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_rutas_tickets.txt",true);
                        escritor5= new PrintWriter(archivo5);
                        
                        escritor5.println(TICKET_INFO);}
                        
                        catch(Exception e)
                        {System.out.println("Error: "+e.getMessage());}
                        
                        finally{archivo5.close();}
                        
                 System.out.println("");
                 System.out.println("Desea crear otra RUTA y Asignarle el valor al TICKET ? Digite 1 para si, de lo contrario volveras al menu principal ");
                 OPCION_REGRESO=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite Una opcion"));              
                                                  
               }while(OPCION_REGRESO==1);
                 System.out.println("");
                 break;//CASE 3
              
 case 4:if(OPCION_MENU==4)
              do{
                System.out.println("Ha ingresado a la opcion 4.INACTIVAR RUTA ");
                System.out.println("");
                System.out.println("LISTA DE RUTAS ACTIVADAS: ");
                System.out.println("");
                
                //CREACION DE LAS VARIABLES PARA LA LECTURA DEL TXT RUTAS ANTERIORMENTE DIGITADO              
                String Contenido;
                File Archivo;
                FileReader Lector;
                BufferedReader Lectura;
                
                //MUESTRA O LEE EL ARCHIVO CON LAS RUTAS GUARDADAS ANTERIORMENTE PARA ELEGIR CUAL BORRAR 
                try{
                Archivo= new File("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_rutas_tickets.txt");
                Lector=new FileReader(Archivo);
                Lectura= new BufferedReader(Lector);
                
                Contenido=Lectura.readLine();
                while(Contenido !=null)//WHILE PARA LEER CON EL BUFFERED READOR TODAS LAS LINEAS QUE NO ESTEN VACIAS
                {System.out.println(Contenido);
                 Contenido=Lectura.readLine();}
                }
                catch(IOException e)//SI HAY ALGUN FALLO AL LEER EL ARCHIVO EL NO LO MOSTRARA
                {System.out.println("Error al leer el archivo : "+e);}
                
                //ELIMINAR RUTA DEL TXT                               
                  String Borrar;                                             
                  String filePath = "E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_rutas_tickets.txt";  // Ruta del archivo
                  // Utilizamos el try/catch para poder controlar las excepciones
                  try {                 
                      // Creamos un FileReader y un BufferedReader para leer el archivo
                      FileReader lector = new FileReader(filePath);
                      BufferedReader lectura = new BufferedReader(lector);
                      // Creamos un StringBuilder para almacenar el nuevo contenido del archivo
                      StringBuilder sb = new StringBuilder();//DESCARTA 
                      // Escribir palabra a borrar
                      String borrar = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DE LA RUTA A DESACTIVAR:");
                      // Leemos la primera línea del archivo
                      String linea = lectura.readLine();
                      // Creamos un bucle while para leer las demás líneas
                     while (linea != null)
                     {
                     // Verificamos si la línea contiene la parte que queremos borrar
                     if (!linea.contains(borrar))                  
                     {// Si la línea no contiene la parte a borrar, la añadimos al StringBuilder
                     sb.append(linea);
                     sb.append("\n");}                  
                     // Leemos la siguiente línea
                     linea = lectura.readLine();}                    
                     // Cerramos el lector
                     lectura.close();          
                     // Escribimos el nuevo contenido en el archivo
                     FileWriter escritor = new FileWriter(filePath);
                     BufferedWriter escritura = new BufferedWriter(escritor);
                     escritura.write(sb.toString());
                     escritura.close();            
                     }catch (IOException e) {System.out.println("Excepción al borrar parte del archivo: " + e);}
                     System.out.println("");
                     System.out.println("");
                     OPCION_REGRESO=Integer.parseInt(JOptionPane.showInputDialog("Desea inactivar otra ruta ? Presione 1 para si o volver al menu principal"));
                     }while(OPCION_REGRESO==1);
                     else
                     System.out.println("");
                     break;//CASE 4
              
 case 5:if(OPCION_MENU==5)
              
            {String ruta_asignada;
            System.out.println("Ha ingresado a la opcion 5.ASIGNAR RUTA A BUS ");          
            try {         
            Writer escribir3 = new FileWriter(recorridos, true); //Para escribir en el archivo. El true es para escribir al final de un archivo ya existente
            PrintWriter linea3 = new PrintWriter(escribir3); //para escribir en varias lineas de texto
            JOptionPane.showMessageDialog(null, "¡VAS A ASIGNAR RUTAS!");
            BufferedReader reader = null;
            
            try {//MUESTRA LAS RUTAS CREADAS PARA ASIGNAR EL BUS 
                reader = new BufferedReader(new FileReader("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_rutas_tickets.txt"));
                String linea;
                boolean archivoVacio = true;
                while ((linea = reader.readLine()) != null) 
                {
                    if (!linea.trim().isEmpty()) 
                    {
                        System.out.println(linea);
                        archivoVacio = false;
                    }
                }            

                if (archivoVacio)
                {
                    JOptionPane.showMessageDialog(null, "¡NO TIENES RUTAS! - DEBES CREAR UNA RUTA");                
                }
            }catch (IOException e)
            {
                System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            }finally 
            {
                if (reader != null)
                    {
                    try {
                        reader.close();
                         } catch (IOException e) {
                        System.err.println("Ocurrió un error al cerrar el archivo: " + e.getMessage());
                        }
                     }   
             }
             // SE ELIGE EL NOMBRE DE LA RUTA 
             int opcion_ruta = Integer.parseInt(JOptionPane.showInputDialog("¡ELIJA EL NOMBRE DE LA RUTA !"));
              BufferedReader reader1 = null;
            
              try {//MOSTRAR LISTA DE BUSES Y BUSETAS Y ASIGNARLOS A LA RUTA 
                reader1 = new BufferedReader(new FileReader("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_busesybusetas.txt"));
                String linea;
                boolean archivoVacio = true;

                while ((linea = reader1.readLine()) != null) {
                    if (!linea.trim().isEmpty()) {
                        System.out.println(linea);
                        archivoVacio = false;
                    }
                }
                if (archivoVacio)
                {JOptionPane.showMessageDialog(null, "¡NO TIENES BUS / BUSETA CREADOS! - DEBES CREAR UNA BUS O BUSETA");}

             } catch (IOException e) {
                System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
              } finally {
                if (reader != null) {
                    try {
                        reader.close();
                        } catch (IOException e) {
                        System.err.println("Ocurrió un error al cerrar el archivo: " + e.getMessage());
                        }
                    }
              }
              //SE ELIGE LA PLACA DEL BUS O BUSETA
              String opcion_carro = JOptionPane.showInputDialog("¡ELIJA LA PLACA DEL BUS O BUSETA!");

              JOptionPane.showMessageDialog(null, "RUTA ASIGNADA CON ÉXITO: " + "ID RUTA: " + opcion_ruta + " --" + opcion_carro);
              ruta_asignada = (opcion_ruta + " --" + " " + opcion_carro);

              //Escribimos en el archivo
              linea3.print(ruta_asignada + "\n");

              escribir3.close();
              linea3.close();

                } catch (IOException e) {
               System.out.println("Error al escribir en el archivo de ASIGNACIÓN DE RUTAS: " + e.getMessage());
               }
               }break;
        
 case 6:if(OPCION_MENU==6){
              do{
                 System.out.println("Ha ingresado a la opcion 6.VENDER TICKETES A USUARIOS ");
                 System.out.println("LISTA DE RUTAS DISPONIBLES");
                 
                //CREACION DE LAS VARIABLES PARA LA LECTURA DEL TXT RUTAS ANTERIORMENTE DIGITADOS
                String Contenido;
                File Archivo;
                FileReader Lector;
                BufferedReader Lectura;
                
                //MOSTRAR LOS TICKETES EN TXT GUARDADOS CON SU PRECIO Y RUTA 
                try{
                Archivo= new File("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Archivo_rutas_tickets.txt");
                Lector=new FileReader(Archivo);
                Lectura= new BufferedReader(Lector);
                
                Contenido=Lectura.readLine();
                while(Contenido !=null)//WHILE PARA LEER CON EL BUFFERED READER TODAS LAS LINEAS QUE NO ESTEN VACIAS
                {System.out.println(Contenido);
                Contenido=Lectura.readLine();}
                }
                catch(IOException e)//SI HAY ALGUN FALLO AL LEER EL ARCHIVO EL NO LO MOSTRARA
                {System.out.println("Error al leer el archivo : "+e);} 
                
                int OPCION_COMPRATICKET = Integer.parseInt(JOptionPane.showInputDialog("Segun su lugar de destino , indique el precio del ticket "));                                  
                int CANT_TICKETSACOMPRAR = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la cantidad de ticketes que desea comprar.")); 
                double TOTALAPAGARTICKET=OPCION_COMPRATICKET*CANT_TICKETSACOMPRAR;
                
                Date fechaActual=new Date();
                SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String fechaFormateada=formatoFecha.format(fechaActual);
                System.out.println("El valor a PAGAR es: "+TOTALAPAGARTICKET+"$$"+", POR "+CANT_TICKETSACOMPRAR+" PASAJEROS");
                               
                double GANANCIAPORVIAJE= (TOTALAPAGARTICKET*0.1) ;              
                GANANCIASTOTALES += GANANCIAPORVIAJE;          
                String GANANCIA=" VENTA "+" del: "+fechaFormateada+" : "+TOTALAPAGARTICKET+" $$ "+", DE: "+CANT_TICKETSACOMPRAR+" PASAJEROS .";           
                           
                System.out.println();
                System.out.println(GANANCIA+"GANANCIAS POR ESTA VENTA: "+GANANCIAPORVIAJE+"$");                                               
                
                //ALMACENAR GANANCIA CREADOS EN TXT 
                        FileWriter archivo6=null; 
                        PrintWriter escritor6 = null ;
                      
                        try                       
                        {archivo6 = new FileWriter("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Reportes.txt",true);
                         escritor6 = new PrintWriter(archivo6);                       
                        escritor6.println(GANANCIA+"GANANCIAS POR ESTA VENTA: "+GANANCIAPORVIAJE);                       
                        }                       
                        catch(Exception e)
                        {System.out.println("Error: "+e.getMessage());}                       
                        finally{archivo6.close();}
                                       
                 System.out.println("");
                 System.out.println("Desea crear comprar mas tickets ? Digite 1 para si, de lo contrario volveras al menu principal ");
                 OPCION_REGRESO=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite Una opcion"));
                }while(OPCION_REGRESO==1);                    
                 System.out.println("");
                 break;//CASE 6
                }  
 case 7:if(OPCION_MENU==7)
                {
                System.out.println("Ha ingresado a la opcion 7.GENERAR REPORTES DE VENTAS");
                String Contenido;
                File Archivo;
                FileReader Lector;
                BufferedReader Lectura;
                                 
                //MOSTRAR LOS TICKETES EN TXT GUARDADOS CON SU PRECIO Y RUTA 
                try{
                Archivo= new File("E:\\OneDrive - Institución Universitaria Antonio Jose Camacho\\UNICAMACHO ANDRES\\2.SEMESTRE 2 ANDRES\\3.PROGRAMACION 1\\CORTE 3\\PROGRAMA_FLOTA\\Reportes.txt");
                Lector=new FileReader(Archivo);
                Lectura= new BufferedReader(Lector);
                
                
                Contenido=Lectura.readLine();
                while(Contenido !=null)//WHILE PARA LEER CON EL BUFFERED READER TODAS LAS LINEAS QUE NO ESTEN VACIAS
                {System.out.println(Contenido);
                 Contenido=Lectura.readLine();}
                }               
                catch(IOException e)//SI HAY ALGUN FALLO AL LEER EL ARCHIVO EL NO LO MOSTRARA
                {System.out.println("Error al leer el archivo : "+e);}             
                }
                 System.out.println("Desea conocer las ganancias de toda la venta de tickets ? Digite 1 para si , de lo contrario volvera al menu principal ");       
                 int IMPRIMIR_GANANCIASTOTALES = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite Una opcion"));  
                                             
                        if(IMPRIMIR_GANANCIASTOTALES==1)        
                         {System.out.println("GANANCIAS TOTALES:"+GANANCIASTOTALES+" $$");}
                        else{       }                              
                        System.out.println("");
                 
                 break;//CASE 7 
              
 case 8:if(OPCION_MENU==8)
                {System.out.println("Ha ingresado a la opcion 8.SALIR");
                 System.out.println("¡Hasta luego!");
                 System.exit(0);//SALE DEL SISTEMA  
                 break;}//CASE 8 
              
 default:System.out.println("Opción inválida. Por favor seleccione una opción válida.");}//SWITCH CASE
                     
         }while(OPCION_REGRESO!=1&&OPCION_MENU!=8&& OPCION_MENU<9);// WHILE DEL MENU : Osea se repite cuando cumple esas condiciones //FIN DEL MAIN
       } 
    }//FIN DE LA CLASE PROGRAMA FLOTA  

