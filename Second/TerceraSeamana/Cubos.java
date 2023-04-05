//Calcular los cubos y cuadradors de los primero cincuenta numeros 
//MMG
public class Cubos{
   private int cubo;
   private int cuadrado;
   public void muestra(){
      for(int i=1; i<=50;i++){
         cuadrado = i*i;
         cubo = i*i*i;
         System.out.println(i+" Cubo= "+cubo+" Cuadrado="+cuadrado);
      }
   }
}