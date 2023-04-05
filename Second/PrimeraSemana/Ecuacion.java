/*
Resolver la ecuacion
MMG
*/
public class Ecuacion{
   private double x;
   private double y;
   
   public void setX(double n1){
      x = n1;
   }
   public void setY(double n2){
      y = n2;
   }
   public void resuelve(){
      y = (7+4*x)/(3-5*x)+2*x;
   }
   public double getX(){
      return x;
   }
   public double getY(){
      return y;
   }
}