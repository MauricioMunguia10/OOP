/*Metodos accesores
setter y getter uno por cada atributo
Ejemplo con una suma
MMG
*/
public class Suma{
   private double num1;
   private double num2;
   private double res;
   
   public void setNum1(double n1){
      num1 = n1;
   }
   public void setNum2(double n2){
      num2 = n2;
   }
   public void setRes(double r1){
      res = r1;
   }
   
   public double getNum1(){
      return num1;
   }
   public double getNum2(){
      return num2;
   }
   public double getRes(){
      return res;
   }
   public void sumar(){
      res = num1+num2;
   }
   /*public double sumarDos(){
      res = num1+num2;
      return res;
   }
   public void imprimir(){
      System.out.println("La suma de "+num1+" + "+num2+" = "+ sumarDos());
   }*/
}

