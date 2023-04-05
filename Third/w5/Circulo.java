public class Circulo extends Figura2D{
   private int radio;
   
   public Circulo(){
      System.out.println("Es un circulo");
   }
   public double area(){
      double area = 3.1416*radio*radio;
      return area; 
   }
   public void dibujar(){
      System.out.println("Se dibuja un circulo");
   }
}