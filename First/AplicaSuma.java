public class AplicaSuma{
   public static void main(String a[]){
      Suma miSuma = new Suma();
      miSuma.setNum1(15);
      miSuma.setNum2(20);
      miSuma.sumar();
      System.out.println("La suma es "+miSuma.getRes());
   }
}