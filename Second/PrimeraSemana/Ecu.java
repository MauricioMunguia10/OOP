/*Construya un progrma para calcular 'y' mostrar los valores de 'x' y 'y' teniendo
como entrada el valor de 'x' y calcular 'y' de awcurdo con las siguientes condiciones
Si x!=0 => y=3x+6
Si x=0 => y=x+6
MMG*/
public class Ecu{
   private double x;
   private double y;
   
   
   public void setX(double n){
      x = n;
   }
   public double getX(){
      return x;
   }
   public void setY(double n){
      y = n;
   }
   public double getY(){
      if(x==0){
         y = x+6;
      }else{
         y = 3*x+6;
      }
      return y;
   }
   public void respuesta(){
      System.out.println("El valor de x= "+getX());   
      System.out.println("El valor de y= "+getY());
      
   }
}