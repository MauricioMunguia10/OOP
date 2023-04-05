/*Operadores pero en Switch
MMG*/
public class OperadoreSwitch{
   private int opc;
   private double n1;
   private double n2;
   private double res;
   
   public void setOpc(int n){
      opc = n;
   }
   public void setNum1(double n){
      n1 = n;
   }
   public void setNum2(double n){
      n2 = n;
   }
   public double getNum1(){
      return n1;
   }
   public double getNum2(){
      return n2;
   }  
   public void operaciones(){
      System.out.println("Numero 1: "+getNum1()+"\nNumero 2: "+getNum2());
      if(opc<1 || opc>5){
         System.out.println("No selecciono una operacion valida :(");
      }else{
      //switch
      switch(opc){
      case 1:
         res = n1+n2;
         System.out.println("Selecciono suma");
         break;
      case 2:
         res = n1-n2;
         System.out.println("Selecciono resta");
         break;
      case 3:
         res = n1*n2;
         System.out.println("Selecciono producto");
         break;
      case 4:
         if(n2!=0){
            res = n1/n2;
            System.out.println("Selecciono division");
         }else{
            System.out.println("Selecciono division pero no se puede hacer");
         }
         break;
      case 5:
         res = n1%n2;
         System.out.println("Selecciono modulo");
         break;
      }
         System.out.println("El resultado es: "+res);
       
   }
   
   
}
}