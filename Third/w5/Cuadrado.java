public class Cuadrado extends Figura2D{
   private int ancho;
   private int alto;
   
   public Cuadrado(){
      System.out.println("Es un cuadrado");
   }
   public double area(){
      double area = ancho*alto;
      return area; 
   }
   public void dibujar(){
      System.out.println("Se dibuja un cuadrado");
   }
}