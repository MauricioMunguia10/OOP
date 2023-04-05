public  class Rectangulo extends FiguraGeometrica{
   private int valor2;
   public Rectangulo(){//sobreescribir
      System.out.println("Soy un rectangulo :)");
   }
   public Rectangulo(int valor1, int valor2){
      super(valor1);
      this.valor2 = valor2;
   }
   public double getArea(){
      return getValor1()*valor2;
   }
   public double getPerimetro(){
      return 2*(getValor1()+valor2);
   }
}