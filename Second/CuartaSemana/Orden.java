/*Crear un programa en java que ordene de forma ascendente 4 números enteros, 
utilizando únicamente las estructuras de control vistas en clase
MMG*/
import javax.swing.*;
public class Orden{
   private int x;
   private int mayor;
   private int n1,n2,n3,n4;
   
   public void muestra(){
      int i=0;
      mayor = -32767;
      n1 = -32767;
      n2 = -32767;
      n3 = -32767;
      n4 = -32767;
      while(i<4){
         x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
         if(x>mayor){
            mayor = x;
            n1=n2;
            n2=n3;
            n3=n4;
            n4=mayor;
         }else if(x>n3){
            n1=n2;
            n2=n3;
            n3=x;
         }else if(x>n2){
            n1=n2;
            n2=x;
         }else {
            n1=x;
         }
         i++;
      }
      System.out.println("Orden ascendente: "+n1+", "+n2+", "+n3+", "+n4+".");
      System.out.println("Orden descendente: "+n4+", "+n3+", "+n2+", "+n1+".");
   }
}