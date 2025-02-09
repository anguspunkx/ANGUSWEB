
package ProyectoFinal;

import javax.swing.JOptionPane;


public class validaciones {
    
    public static boolean leerCadena(String dato, String campo){
     
        boolean validacion=false;
        try {
            if(dato.isEmpty()){
                JOptionPane.showMessageDialog(null, 
                        "El valor para el campo "+campo+
                        " no puede estar vacio, por favor ingrese un "
                                +campo);
            
            return validacion;
            }
            else if(!dato.matches("[a-zA-Z]+")){
               JOptionPane.showMessageDialog(null, "El valor para el campo "+campo+
                        " no puede contener valores numericos, "+
                                "por favor revisar la información del  "+campo);  
            return validacion;
            }
            else if(dato.trim().length()<3){
               JOptionPane.showMessageDialog(null, "El valor para el campo "+campo+
                        " debe tener al menos 3 caracteres "+
                                "por favor revisar la información del  "+campo);  
            return validacion;
            }
            else{
                return validacion=true;
            }
        } catch (Exception e) {
            return validacion; 
        } 
    }
}
