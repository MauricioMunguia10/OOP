import javax.swing.*;//metodo JOptionPane
public class ANumeroX{
   public static void main(String a[]){
      Numero miNumero = new Numero();
      /*Scanner sc = new Scanner(System.in);
      System.out.println("Elige una tabla de multiplicar");
      int tabla = sc.nextInt();*/
      int tabla=Integer.parseInt(JOptionPane.showInputDialog("Elige una tabla de multiplicar"));
      miNumero.tabla(tabla);
   }
}