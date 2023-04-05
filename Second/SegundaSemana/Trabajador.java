/*Construya un programa que permita calcular lo que hay que pagarle a un trabajador
teniendo en cuenta su sueldo y las horas trabajadas. Para el pago de horas extras se
tienen en cuenta además la categoría del trabajador.1-30,2-38,3-50,4-70.
Cada trabajador puede tener como máximo 30 horas extras, si tiene más sólo se le pagarán 30
MMG*/
public class Trabajador{
   private int opc;//categoria
   private double sal;
   private double horas;
   
   public void setOpc(int n){
      opc = n;
   }
   public void setSal(double n){
      sal = n;
   }    
   public void setHoras(double n){
      horas = n;
   }
   public int getOpc(){
      return opc;
   }
   public double getSal(){
      if(opc==1){
         sal = horas*30;
      }else if(opc==2){
         sal = horas*38;
      }else if(opc==3){
         sal = horas*50;
      }else if(opc==4){
         sal = horas*70;
      }else{
         sal=0;
      }
      return sal;
   }
   public double getHoras(){
      return horas;
   }
   public void muestra(){
      if(horas<=30){
         System.out.println("El pago por horas extras es de: "+getSal());
      }else{
         System.out.println("Excediste las horas extras, solo se pagaran 30 horas");
         setHoras(30);
         //System.out.println(getHoras());
         //System.out.println(getOpc());
         System.out.println("El pago por horas extras es de: "+getSal());
      }
      
   } 
       
}