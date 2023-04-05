/*Arreglos
Conjunto de datos del mismo tipo
Leer y mostrar el nombre y calificaciones de veinte estudiantes
MMG*/
import javax.swing.*;
public class Arreglo{
   private String name[];
   private double cal[];
   
   public void setName(){
      name = new String[5];
   }
   public void setCal(){
      cal = new double[5];
   }
   public void llenar(){
      for(int i=0; i<name.length; i++){//.lenght en arreglos muestra la longitud de un arreglo
         name[i] = JOptionPane.showInputDialog("Ingresa nombre["+i+"]: ");
         cal[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion["+i+"]: "));
      }
   }
   public void mostrar(){
      for(int i=0; i<name.length; i++){
         System.out.println("El alumno "+name[i]+" tiene la calificacion de: "+cal[i]);
      }
   }
}