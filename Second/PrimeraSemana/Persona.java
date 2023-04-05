/*Estructuras de control
Ejemplo if 
MMG*/
public class Persona{
   private String name;
   private int edad;
   
   public void setName(String a){
      name = a;
   }
   public void setEdad(int e){
      edad = e;
   }
   public String getName(){
      return name;
   }
   public int getEdad(){
      return edad;
   }
   public void calcula(){
      if(edad>=18){
         System.out.println("El nombre es: "+getName());
      }
   }
}