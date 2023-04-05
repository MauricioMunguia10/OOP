public class AEmpleo{
   public static void main(String a[]){
      Empleo miEmpleo = new Empleo();
      miEmpleo.setName("Mauricio");
      miEmpleo.setSPH(100);
      miEmpleo.setHoras(30);
      miEmpleo.setPorcentaje(10);
      miEmpleo.setSB();
      miEmpleo.setSN();
      System.out.println("Nombre: "+miEmpleo.getName());
      System.out.println("Salario bruto: "+miEmpleo.getSB());
      System.out.println("Porcentaje de retencion: "+miEmpleo.getPorcentaje()+"%");
      System.out.println("Salario neto: "+miEmpleo.getSN());
   } 
}