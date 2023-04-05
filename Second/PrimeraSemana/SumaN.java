/*Tarea. Lea dos numeros.Calcule la suma de los numeros.Muestre los numeros leidos
y solo si su suma es negativa muestrela
MMG*/
public class SumaN{
   private double num1;
   private double num2;
   private double sum;
   
   public void setNum1(double n1){
      num1 = n1;
   }
   public void setNum2(double n2){
      num2 = n2;
   }
   public void setSum(){
      sum = num1+num2;
   }
   public double getNum1(){
      return num1;
   }
   public double getNum2(){
      return num2;
   }
   public double getSum(){
      return sum;
   }
   public void muestra(){
      System.out.println("La suma de: "+getNum1()+" y "+getNum2());
      if(sum<0){
         System.out.println("El resultado es: "+getSum());
      }else{
         System.out.println("La suma de un valor positivo");   
      }
   }
}