//Calcula el area de un circulo
//Extra, calcula el perimetro
public class Circulo{
   private double radio;
   private double pi=3.1416;
   private double area;
   private double perimetro;
   
   public void pedirRadio(double r){
      radio=r;
   }
   public void calcularArea(){
      area = pi*radio*radio;
   }
   public void mensajeArea(){
      System.out.println("El area del circulo con radio "+ radio+ " es "+ area);
   }
   public void calcularPerimetro(){
      perimetro = 2*pi*radio;
   }
   public void mensajePerimetro(){
      System.out.println("El perimetro del circulo con radio "+ radio+ " es "+ perimetro);
   }
}