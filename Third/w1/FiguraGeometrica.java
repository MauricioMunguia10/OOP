/*Area y perimetro de Figuras:
Circulo
Cuadraado
Triangulo
Rectangulo
MMG*/
public abstract class FiguraGeometrica{
   private double valor1;
   public void setValor1(double n){
   valor1=n;
   }
   public double getValor1(){
   return valor1;
   }
   public FiguraGeometrica(){//sobreescribir
      System.out.println("Soy una figura :)");
   }
   public FiguraGeometrica(int valor1){//sobrecarga
      this.valor1 = valor1;
   }
   public abstract double getArea();
   public abstract double getPerimetro();
}
