/*Leer un numero entero e indicar si es negativo
MMG*/
public class Negativo{
   private int num;
   
   public void setNum(int n){
      num = n;
   }
   public int getNum(){
      return num;
   }
   public void comprueba(){
      if(num<0){
         System.out.println("El numero es negativo");
      }else if(num>0){
         System.out.println("El numero es positivo");
      }else{
         System.out.println("El numero es neutro");
      }
   }
}