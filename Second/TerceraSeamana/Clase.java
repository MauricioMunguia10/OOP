/*Leer el nombre y las edades de tu clase y calcular su media o promedio
MMG*/
import javax.swing.*;
public class Clase{
   private float media;
   private int edad,total;
   private String name;
   
   public void setTotal(int n){
      edad = n;
      total = total+edad;
   }
   public int getTotal(){
      return total;   }
   public void setName(String n){
      name = n;
   }
   public String getName(){
      return name;   
   }
   public void muestra(){
      ciclo();
      System.out.println(getTotal());
      
   }
   public void ciclo(){
      for(int i=1;i<=4;i++){
         edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad"));
         //String nombre = JOptionPane.showInputDialog("Escriba su nombre");
         setTotal(edad);
         System.out.println(getTotal());
         
      }
   }
   
}