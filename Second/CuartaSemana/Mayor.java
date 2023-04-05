/*Dado n numeros enteros mostarar el menor y el mayor
MMG*/
import javax.swing.*;
public class Mayor{
   private int n,x;
   private int mayor;
   private int menor;
   
   public void muestra(){
      mayor = -32767;
      menor = 32768;
      n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de numeros: "));
      int i=0;
      while(i<n){
         x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una calificacion: "));
         if(x>mayor){
            mayor = x;
         }if(x<menor){
            menor = x;
         }
         i++;
      }
      System.out.println("El numero mayor es:"+mayor);
      System.out.println("El numero menor es:"+menor);
   }
   
}
 