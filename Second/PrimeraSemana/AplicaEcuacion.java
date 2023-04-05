public class AplicaEcuacion{
   public static void main(String a[]){
      Ecuacion miEcuacion = new Ecuacion();
      miEcuacion.setX(1);
      miEcuacion.resuelve();
      System.out.println("Cuando x= "+ miEcuacion.getX());
      System.out.println("El valor de y= "+ miEcuacion.getY()); 
   }
}