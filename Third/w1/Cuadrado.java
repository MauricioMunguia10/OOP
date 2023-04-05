public  class Cuadrado extends FiguraGeometrica{
   private int valor1;
   public Cuadrado(int valor1){//sobreescribir
      super(valor1);
      System.out.println("Soy un cuadrado :)");
   }
   public double getArea(){
      return getValor1()*getValor1();
   }
   public double getPerimetro(){
      return 4*getValor1();
   }
}