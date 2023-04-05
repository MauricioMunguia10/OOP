public class AplicaSuma{
   public static void main(String a[]){
      Suma miSuma = new Suma();//el constructor tiene el mismo nombre que la clase - default
      miSuma.setNum1(5);
      miSuma.setNum2(10);
      System.out.println("La suma es "+ miSuma.suma());
      
      Suma miSuma2 = new Suma(10,10);
      System.out.println("La suma es "+ miSuma2.suma());
      
      Suma miSuma3 = new Suma(15);
      miSuma3.setNum2(15);
      System.out.println("La suma es "+ miSuma3.suma());
   }
}