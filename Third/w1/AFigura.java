import javax.swing.*;
public class AFigura{
   public static void main(String a[]){
      int opc = 0;
      double n1, n2;
      do{
      System.out.println("1.-Circulo");
      System.out.println("2.-Cuadrado");
      System.out.println("3.-Triangulo");
      System.out.println("4.-Cubo");
      System.out.println("5.-Salir");
      opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:"));
      switch (opc){
         case 1:
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio:"));
            Circulo miCirculo = new Circulo(n1);
            System.out.println(miCirculo.getArea());
            System.out.println(miCirculo.getPerimetro());
            break;
         case 2:
            Cuadrado miCuadrado = new Cuadrado(1);
            System.out.println(miCuadrado.getArea());
            System.out.println(miCuadrado.getPerimetro());
            break;
         case 3:
            Triangulo miTriangulo = new Triangulo(1,2);
            System.out.println(miTriangulo.getArea());
            System.out.println(miTriangulo.getPerimetro());
            break;
         case 4:
            Cubo miCubo = new Cubo(2);
            System.out.println(miCubo.getArea());
            System.out.println(miCubo.getVolumen());
            break;
         case 5:
            System.out.println("A elegido salir, adios :)");
            break;
         default:
            System.out.println("Seleccione una opcion valida");
            break;
      }
      }while(opc!=5);

   }
}