/*Calcule el aumento de sueldo para n empleados de una empresa bajo
el sigueinte critrerio:
sueldo<1000 Aumento 12%
1000<sueldo<2500 Aumento 10%
sueldo>2500 Aumento 8%
Muestre lo sigueiente
a Nuevo sueldo
b Monto total de la nomina despues del aumento 
Do While
MMG*/
import javax.swing.*;
public class Sueldo{
   private double sueldo,nomina;
   private int n;
    
   public void muestra(){
      n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de empleados: "));
      int i=0;
      nomina = 0;
      do{
         sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo: "));
         if(sueldo>2500){
            sueldo=sueldo+sueldo*.08;
            System.out.println("El nuevo sueldo es: "+sueldo);
         }if(sueldo>1000 && sueldo<2500){
            sueldo=sueldo+sueldo*.1;
            System.out.println("El nuevo sueldo es: "+sueldo);
         }if(sueldo<1000){
            sueldo=sueldo+sueldo*.12;
            System.out.println("El nuevo sueldo es: "+sueldo);
         }
         nomina=nomina+sueldo;
         i++;
      }while(i<n);
      System.out.println("La nomina total es: "+nomina);
   }
}