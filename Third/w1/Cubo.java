public  class Cubo extends Cuadrado{
   public Cubo(int valor1){//sobreescribir
      super(valor1);
      System.out.println("Soy un cubo :)");
   }

   public double getArea(){
      return getValor1()*6;
   }
   public double getPerimetro(){
      return 12*getValor1();
   }
   public double getVolumen(){
      return getValor1()*getValor1()*getValor1();
   }
}