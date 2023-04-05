/*    Leer de un registro el nombre de un
empleado, el salario básico por hora y el número de horas trabajadas durante
una semana. Calcular el salario neto, teniendo en cuenta que si el número de
horas trabajadas durante una semana es mayor a 48, esas horas de más se
consideran horas extras y tienen un 35% de recargo. Imprima el nombre del
empleado y el salario neto
MMG*/
public class Empleado{
   private String noEmploye;
   private double salHora;
   private double horas;
   private double aux;
   private double salario;
   private double salNeto;
   
   public void setNoEmploye(String n){
      noEmploye = n;
   }
   public void setSalH(double n){
      salHora = n;
   }
   public void setHoras(double n){
      horas = n;
   }
   public void setSalario(double n){
      salario = n;
   }
   public void setSalNeto(double n){
      salNeto = n;
   }
   public String getNoEmploye(){
      return noEmploye;
   }
   public double getSalH(){
      return salHora;
   }
   public double getHoras(){
      return horas;
   }
   public double getSalario(){
      salario = salHora*horas; 
      return salario;
   }
   public double getSalNeto(){
      if(horas>48){
         aux = horas-48;
         aux = aux*salHora*1.35;
         setSalario(48);
         salNeto = aux + getSalario();
        
      }else{
         salNeto = getSalario();
      }
      return salNeto;
   }
   public void muestra(){
      System.out.println("Nombre: "+getNoEmploye());
      System.out.println("Salario neto: "+getSalNeto());
   }
   
}