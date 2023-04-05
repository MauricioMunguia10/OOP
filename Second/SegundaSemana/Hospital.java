/*En un hospital se ha hecho un estudio sobre los pacientes registrados durante los últimos
10 años, con el objeto de hacer una aproximación de los costos de internación por el
paciente. Se obtuvo un costo promedio diario según el tipo de enfermedad que aqueja al
paciente; además se pudo determinar que en promedio todos los pacientes con edad entre
14 y 22 años implican un costo adicional del 10%. La siguiente tabla expresa los costos
diarios, según el tipo de enfermedad. Construya un programa donde muestre el costo total
a pagar, así como el tipo de enfermedad que aqueja al paciente.
1-25,2-16,3-20,4-32
MMG*/
public class Hospital{
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
      if(opc==1){
         total = dias*25;
      }else if(opc==2){
         total = dias*16;
      }else if(opc==3){
         total = dias*20;
      }else if(opc==4){
         total = dias*32;
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
   }
   
}