/*Obtener promedio de cinco calificaciones
MMG
*/
public class Promedio{
   private double promedio;
   private int matricula;
   //private double calificaciones = [c1,c2,c3,c4,c5];
   private double c1,c2,c3,c4,c5;
   private String nombre;
   
   public void setMatricula(int x){
      matricula = x;
   }
   public void setNombre(String n){
      nombre = n;
   }
   public void setCalificaciones(double n1,double n2,double n3,double n4,double n5){
      c1 = n1;
      c2 = n2;
      c3 = n3;
      c4 = n4;
      c5 = n5;
   }
   public void setPromedio(){
      promedio = (c1+c2+c3+c4+c5)/5;
   }
   public int getMatricula(){
      return matricula;
   }
   public String getNombre(){
      return nombre;
   }
   public double getPromedio(){
      return promedio;
   }
   /*public void getCalificaciones(){
      for(int i=0;i<5;i++){
         
         System.out.println("Calificacion: "+ c'i');
      }
   }*/
   
}