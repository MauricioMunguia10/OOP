/*Se tienen las calificaciones de un examen.Haga un prograa que calcule y muestre
cuantas calificaciones hay en cada uno de los rangos:
Rango 1: 0-3.99
Rango 1: 4-5.99
Rango 1: 6-7.99
Rango 1: 8-10
MMG*/
import javax.swing.*;
public class Examen{
   private double cal;
   private int n;
   private int c1,c2,c3,c4,c5;
   
   public void setN(int x){
      n = x;
   }
   public int getN(){
      return n;
   }
   public void proceso(){
      for(int i=0;i<n;i++){
         cal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una calificacion: "));
         if(cal>=0 && cal<4){
            c1++;
         }else if(cal>=4 && cal<6){
            c2++;
         }else if(cal>=6 && cal<8){
            c3++;
         }else if(cal>=8 && cal<=10){
            c4++;
         }else{
            c5++;
         }
      }
      System.out.println("Calificaciones entre 0 y 3.99: "+c1);   
      System.out.println("Calificaciones entre 4 y 5.99: "+c2); 
      System.out.println("Calificaciones entre 6 y 7.99: "+c3); 
      System.out.println("Calificaciones entre 8 y 10: "+c4);
      System.out.println("Calificaciones no validas: "+c5);  
      }
}