public  class Triangulo extends FiguraGeometrica{
   private int valor2;
   public Triangulo(){//sobreescribir
      System.out.println("Soy un triangulo :)");
   }
   public Triangulo(int valor1){//sobrecarga
      super(valor1);
   }
   public Triangulo(int valor1, int valor2){
      super(valor1);
      this.valor2 = valor2;
   }
   public double getArea(){
      return getValor1()*valor2/2;
   }
   public double getPerimetro(){
      return getValor1()+valor2;
   }
}