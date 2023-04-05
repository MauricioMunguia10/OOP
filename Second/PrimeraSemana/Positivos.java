/*Lea dos numeros y muestre ambos numeros 
solo si los numeros son positivos 
-----------------------------------------------
Tarea. Lea dos numeros.Calcule la suma de los numeros.Muestre los numeros leidos
y solo si su suma es negativa muestrela
Tarea. Realice un programa que muestre el costo de un pedido del cual se tiene la 
descripcion, cantidad pedida y precio unitario.Si la cantidad pedida excede a 50 unidades,
se hace un desciento del 15%
MMG
*/
public class Positivos{
   private double num1;
   private double num2;
   
   public void setNum1(double n1){
      num1 = n1;
   }
   public void setNum2(double n2){
      num2 = n2;
   }
   public double getNum1(){
      return num1;
   }
   public double getNum2(){
      return num2;
   }
   public void muestra(){
      if(num1>=0){
         if(num2>=0){
            System.out.println("Ambos numeros son positivos: "+getNum1()+" y "+getNum2());   
         }
      }
   }
}