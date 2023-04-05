/*Explicacion de for
MMG*/
public class Numero{
   //Primeros numeros
   public void primerosNum(){
      /*System.out.println("1");
      System.out.println("2");
      System.out.println("3");
      System.out.println("4");
      System.out.println("5");
      System.out.println("6");
      System.out.println("7");
      System.out.println("8");
      System.out.println("9");
      System.out.println("10");*/
      for(int i=1;i<=10;i++){
         System.out.println(i);
      }
   }
   //Tabla del siete
   public void tablaSiete(){
      for(int i=1;i<=10;i++){
         System.out.println("7x "+i+"="+i*7);
      }
   }
   //Cualquier tabla
   public void tabla(int n){
      int tabla = n;
      for(int i=1;i<=10;i++){
         System.out.println(tabla+ "x "+i+"="+i*tabla);
      }
   }
}