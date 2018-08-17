
package Video35Empleado3Kev;

import java.util.*;

public class Empleado {
    
    public Empleado(String nom,double sue,int agno,int mes,int dia){
      
        nombre=nom;
        sueldo = sue;
        
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        
        altaContrato = calendario.getTime();
  }

    Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
  public String dameNombre(){
      
      return nombre;
  }  
  
  public double dameSueldo(){ 
      
      return sueldo;
  }
  
  public Date dameFechaContrato(){
      
      return altaContrato;
  }
  
  public void subSueldo(double porcentaje){
      
      double aumento = sueldo*porcentaje/100;
      
      sueldo+=aumento;
  }
  private String nombre;
  private double sueldo;
  private Date altaContrato;
  
  
}
