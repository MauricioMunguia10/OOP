/*Realizar un programa que lea un numero y calcule el 5% del numero,
obtener el numero y el porcentaje
MMG*/
public class Porcentaje{
   private double num;
   private double por;
   private double total;
   
   public void setNum(double n1){
      num = n1;
   }
   public void setPor(double n2){
      por = n2;
   }
   public double getNum(){
      return num;  
   }
   public void setTotal(){
      total = num*(por/100);
   }
   public double getTotal(){
      return total;  
   }
   public double getPor(){
      return por;  
   }
}