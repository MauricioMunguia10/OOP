//comentario de una sola linea
/*comentario de mas de una linea*/
/**Documentacion**/
/*Munguia Garcia Mauricio
DSM-104
POO
Crear un celular*/
public class Celular{//firma de la clase
   private String color;
   private String tamano;
   private int sum,a,b;
   private String tipoEntrada;
   private boolean sensor;
   public void contestar(){
      System.out.println("Esta contestando");
   }
   public void llamar(){
      System.out.println("Esta llamando");
   }
   public void navegar(){
      System.out.println("Estas en navegacion");
   }
   public int dividir(int x,int y){
      int a=x;
      int b=y;
      sum=a/b;
      System.out.println(sum);
      return sum;
   }
   
}//fin de la clase