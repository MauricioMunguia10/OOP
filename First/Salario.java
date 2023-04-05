public class Salario{
   private String name;
   private double salHora;
   private double horas;
   private double salario;
   
   public void calSalario(){
      salario=salHora*horas;
   }
   public void mostrar(){
      System.out.println(name+" gana "+salario+ " pesos.");
   }
   public void pedirHoras(double h){
      horas=h;
   }
   public void pedirSalHora(double sh){
      salHora=sh;
   }
   public void pedirName(String n){
      name=n;
   }
}