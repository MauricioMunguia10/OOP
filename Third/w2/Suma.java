/*Constructores
Metodos especiales
Sirven para inicializar
MMG*/
public class Suma{
   private double num1; 
   private double num2;
   
   public void setNum1(double num1){
      this.num1 = num1;//especifica que la variable es un atributo 
   }
   public void setNum2(double num2){
      this.num2 = num2;
   }
   public double suma(){
      return num1+num2;
   }
   public Suma(){//sobreescribir
      System.out.println("Soy una suma :)");
   }
   public Suma(double num1, double num2){//sobrecarga
      this.num1 = num1;
      this.num2 = num2; 
   }
   public Suma(double num1){
      this.num1 = num1;
   }
}