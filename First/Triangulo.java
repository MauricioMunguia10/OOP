public class Triangulo{
   private double base;
   private double altura;
   private double area;
   public void calArea(){
      area=(base*altura)/2;
   }
   public void mostrarArea(){
      System.out.println("El area es: "+area);
   }
   public void pedirBase(double b){
      base=b;
   }
   public void pedirAltura(double a){
      altura=a;
   } 
   
}