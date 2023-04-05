public class Cubo extends Figura3D{
   private int lado;
   
   public Cubo(int w, int x, int y, int z){
      System.out.println("Es un circulo");
   }
   public double volumen(){
      double vol = lado*lado*lado*lado;
      return vol; 
   }
   public void dibujar(){
      System.out.println("Se dibuja un cubo");
   }
}