public abstract class Figura2D implements FiguraGeometrica{
   private int x;
   private int y;
   
   public Figura2D(){
      System.out.println("Figura 2D");
   }
   public Figura2D(int x, int y){
      System.out.println("Figura 2D con argumentos");
   }
   public void mover(int x,int y){
      System.out.println("Se mueve en 2D");
   }
   public void dibujar(){
      System.out.println("Se dibuja en 2D");
   }
   public abstract double area();
   
}