/*Switch
MMG*/
public class TrabajadorS{
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
      switch(opc){
      case 1:
         sal = horas*30;
         break;
      case 2:
         sal = horas*38;
         break;
      case 3:
         sal = horas*50;
         break;
      case 4:
         sal = horas*70;
         break;
      default:
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
      System.out.println("Estas en un switch");
      
   } 
       
}