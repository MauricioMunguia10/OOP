/*Dado un conjunto de 100 numeros naturales,desarrollar un programa que determina
numeros entre 25 y 35
numeros mayores a 30
numeros menosres a 12
MMG*/
import javax.swing.*;
public class Numeros{
   private int n;
   private int c1,c2,c3; 
   
   public void muestra(){
      for(int i=0;i<10;i++){
         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
         if(n>24 && n<36){
            c1++;
         }else if(n>30){
            c2++;
         }else if(n<12){
            c3++;
         }
      }
      System.out.println("Numeros entre 25 y 35: "+c1);   
      System.out.println("Numeros mayores a 30: "+c2);
      System.out.println("Numeros menores a 12: "+c3);
   }
}