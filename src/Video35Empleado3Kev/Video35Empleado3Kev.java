/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video35Empleado3Kev;

/**
 *
 * @author HP ENVY
 */
public class Video35Empleado3Kev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      /*  Empleado empleado1 = new empleado2("Paco Gómez " , 8500,1990,12,17);
        
        Empleado empleado2 = new empleado2("Ana López " , 9500,1995,06,02);
        
        Empleado empleado3 = new empleado2("Maria Martin " , 105,2002,03,15);
        
        empleado1.subSueldo(5);
        
        empleado2.subSueldo(5);
        
        empleado3.subSueldo(5);
        
        System.out.println("Nombre: "+empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
        + " Fecha de alta: " + empleado1.dameFechaContrato());
        
        System.out.println("Nombre: "+empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
        + " Fecha de alta: " + empleado2.dameFechaContrato());
        
        System.out.println("NOMBRE: "+empleado3.dameNombre() + " SUELDO: " + empleado3.dameSueldo()
        + " Fecha de alta: " + empleado3.dameFechaContrato());*/
      
      Empleado[] misempleados = new Empleado[3];
      
      misempleados[0] = new Empleado("Paco Gómez " , 8500,1990,12,17);
      
      misempleados[1] = new Empleado("Ana López " , 9500,1995,06,02);
      
      misempleados[2] = new Empleado("Maria Martin" , 105,2002,03,15);
      
      /*for(int i=0; i < 3; i++){
          
          misempleados[i].subSueldo(5);
      }*/
      
      for(Empleado e : misempleados){
          
          e.subSueldo(5);
      }
      
      for(Empleado e:misempleados){
          
          System.out.println("Nombre: " + e.dameNombre() + 
                  "Sueldo: " + e.dameSueldo()+ " Fecha de alta " +
                  e.dameFechaContrato());
      }
      
      /*for(int i=0; i<3; i++){
          
          System.out.println("NOMBRE: " + misempleados[i].dameNombre() + 
                  "SUELDO: " + misempleados[i].dameSueldo()+ " FECHA DE ALTA " +
                  misempleados[i].dameFechaContrato());
      }*/
      
      
        
        
        
    }
    
}
