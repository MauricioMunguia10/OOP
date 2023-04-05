public class AplicaSalario{
   public static void main(String a[]){
      Salario miSalario = new Salario();
      miSalario.pedirName("Mauricio");
      miSalario.pedirHoras(8);
      miSalario.pedirSalHora(100.5);
      miSalario.calSalario();
      miSalario.mostrar();
   }
}