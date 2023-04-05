import  java.util.Scanner;//llama la clase scanner
public class ANumero{
   public static void main(String a[]){
   Numero miNumero = new Numero();
   Scanner sc = new Scanner(System.in);
   System.out.println("Elige una tabla de multiplicar");
   int tabla = sc.nextInt();
   miNumero.tabla(tabla);
   }
}