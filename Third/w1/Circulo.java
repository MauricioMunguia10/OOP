public  class Circulo extends FiguraGeometrica{
   public Circulo(){//sobreescribir
      System.out.println("Soy un circulo :)");
   }
   public Circulo(double valor1){//sobrecarga
      super(valor1);
   }
   public double getArea(){
      return 3.1416*(getValor1()*getValor1());
   }
   public double getPerimetro(){
      return 2*3.1416*getValor1();
   }
}