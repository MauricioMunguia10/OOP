/*Mostrar promedio general del grupo
Cantidad de alumnos reprobados y aprobados
Porcentaje de alumnos reprobados y aprobados
MMG*/
import javax.swing.*;
public class Calificaciones{
   private String name[];
   private double cal[];
   private double prom;
   private int rep,aprob;
   private double porb,porm;
   
   public void setName(){
      name = new String[5];
   }
   public void setCal(){
      cal = new double[5];
   }
   public void llenar(){
      prom = 0;
      rep=0; 
      aprob=0;
      for(int i=0; i<name.length; i++){//.lenght en arreglos muestra la longitud de un arreglo
         name[i] = JOptionPane.showInputDialog("Ingresa nombre["+i+"]: ");
         cal[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa calificacion["+i+"]: "));
         prom = prom+cal[i];
         if(cal[i]>=6){
            aprob++;
         }else{
            rep++;
         }
      }
      prom = prom/name.length;
   }
   public void porcentajes(){
      
      porb = aprob*100/5; 
      porm = rep*100/5;
      //System.out.println("Alumnos aprobados: "+aprob+".Un procentaje de "+porb);
   }
   public void mostrar(){
      for(int i=0; i<name.length; i++){
         System.out.println("El alumno "+name[i]+" tiene la calificacion de: "+cal[i]);
      }
      System.out.println("El promedio del grupo es de: "+prom);
      System.out.println("Alumnos aprobados: "+aprob+".Un procentaje de "+porb+"%");
      System.out.println("Alumnos reprobados: "+rep+".Un procentaje de "+porm+"%");
   }
}