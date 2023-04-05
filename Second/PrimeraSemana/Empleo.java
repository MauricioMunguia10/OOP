/*Calcular salario
MMG*/
public class Empleo{
   private String name;
   private double salporhora;
   private double horas;
   private double porcentaje;
   private double salbruto;
   private double salneto;
   
   //set
   public void setName(String n1){
      name = n1;
   } 
   public void setSPH(double n2){
      salporhora = n2;
   }
   public void setHoras(double n3){
      horas = n3;
   }
   public void setPorcentaje(double n4){
      porcentaje = n4;
   }
   public void setSB(){
      salbruto = salporhora*horas;
   }
   public void setSN(){
      salneto = salbruto-(salbruto*(porcentaje/100));
   }
   //get
   public String getName(){
      return name;
   }
   public double getSPH(){
      return salporhora;
   }
   public double getHoras(){
      return horas;
   }
   public double getPorcentaje(){
      return porcentaje;
   }
   public double getSB(){
      return salbruto;
   }
   public double getSN(){
      return salneto;
   }
   
}