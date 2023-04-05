public abstract class Figura3D implements FiguraGeometrica{
   private int x;
   private int y;
   private int z;
   
   public Figura3D(){
      System.out.println("Figura 3D");
   }
   public Figura3D(int x,int y,int z){
      System.out.println("Figura 3D con argumentos");
   }
   public abstract double volumen();
   public void mover(int x,int y){
      System.out.println("Se mueve en 3D");
   }
   public void dibujar(){
      System.out.println("Se dibuja en 3D");
   }
}