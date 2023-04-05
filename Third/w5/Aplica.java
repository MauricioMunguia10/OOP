public class Aplica{
   public static void main(String a[]){
   
      Cuadrado mC = new Cuadrado();
      mC.area();
      mC.dibujar();
      
      Circulo mCir = new Circulo();
      mCir.area();
      mCir.dibujar();
      
      Cubo mCubo = new Cubo(1,2,3,4);
      mCubo.volumen();
      mCubo.dibujar();
   }
}