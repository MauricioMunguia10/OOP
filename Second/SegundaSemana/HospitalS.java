/*Switch
MMG*/
public class HospitalS{
   private int edad;
   private int dias;
   private int opc;//tipo de enfermedad
   private double cDia;
   private double total;
   
   public void setDias(int n){
      dias = n;
   }
   public int getDias(){
      return dias;
   }
   public void setEdad(int n){
      edad = n;
   }
   public void setOpc(int n){
      opc = n;
   }
   public void setCD(double n){
      cDia = n;
   }
   public void setTotal(double n){
      total = n;
   }
   public int getEdad(){
      return edad;
   }
   public int getOpc(){
      return opc;
   }
   public double getCD(){
      return cDia;
   }
   public double getTotal(){
      switch(opc){
         case 1:
            total = dias*25;
            break;
         case 2:
            total = dias*16;
            break;
         case 3:
            total = dias*20;
            break;
         case 4:
            total = dias*32;
            break;
         default:
            total=0;
            break;
      }
      return total;
   }
   public void muestra(){
      if(opc<1 || opc>4){
         System.out.println("Tipo de enfermedad no valido");
      }else{
         if(edad>=14 && edad<=22){
            total=getTotal()*1.1;
            System.out.println("Con una enfermedad tipo "+getOpc());
            System.out.println("El costo total es de: "+total);
         }else{
            System.out.println("Con una enfermedad tipo "+getOpc());
            System.out.println("El costo total es de: "+getTotal());
         }
      }
      //System.out.println("Estas en un switch");
   }
   
}