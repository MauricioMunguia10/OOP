/*Caso de estudio
MMG*/
import javax.swing.*;
public class Casa{
   private int cantTrans;
   private int idTransaccion[];
   private String cripto[];
   private String tipoTrans[];
   private int cantidadCripto[];
   private double tipoCambio;
   private double tipoCambioD;
   private double montoCVD[];
   private double comision;
   private double valorReal[];
   
   public void setArrays(){
      //cripto = JOptionPane.showInputDialog("Ingresa el tipo de criptomoneda: ");
      //tipoTrans = JOptionPane.showInputDialog("Ingresa la operacion a realizar: ");
      cantTrans = Integer.parseInt(JOptionPane.showInputDialog("Transacciones a realizar: "));
      cripto = new String[cantTrans];
      tipoTrans = new String[cantTrans];
      cantidadCripto = new int[cantTrans];
      idTransaccion = new int[cantTrans];
      montoCVD = new double[cantTrans];
      valorReal = new double[cantTrans];     
   }
   public void llenado(){
      for(int i=0;i<cantTrans; i++){
         cripto[i] = JOptionPane.showInputDialog("Ingresa la cripto: ");
         tipoTrans[i] = JOptionPane.showInputDialog("Ingresa el tipo de transaccion: ");
         cantidadCripto[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad: "));
         idTransaccion[i] = i+1;
         cambio(i);
      }
   }
   public void cambio(int n){
      int aux = n;
      String caso = cripto[aux];
      switch (caso){
         case "BTC":
            montoCVD[aux] = cantidadCripto[aux]*59000;
            break;
         case "ETH":
            montoCVD[aux] = cantidadCripto[aux]*3923.08;
            break; 
         case "XRP":
            montoCVD[aux] = cantidadCripto[aux]*1.5597;
            break;
         case "DOGE":
            montoCVD[aux] = cantidadCripto[aux]*0.7021;
            break;
         default:
            System.out.println("Cripto no valida");
            break;
      }
   }
   public void comision(int n){
      int i=n;
      if(montoCVD[i]<1000){
         comision = montoCVD[i]*5/100;
      }else{
         comision = montoCVD[i]*1/100;
      }
      valorReal[i] = montoCVD[i]-comision;
   }
   public void imprimir(int n){
      int i=n;
      comision(i);
      System.out.println("Transaccion no."+i);
      System.out.println(cripto[i]);
      System.out.println(tipoTrans[i]);
      System.out.println(cantidadCripto[i]);
      System.out.println(valorReal[i]);
      
   }
   public void muestra(){
      int opc;
      do{
         System.out.println("1. Registro de transaccion");
         System.out.println("2. Impresion del registro por ID de transaccion");
         System.out.println("3. Impresion de toda la lista de transacciones");
         System.out.println("4. Salir");
         opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion(en numero): "));
         int x;
         switch(opc){
            case 1:
               setArrays();
               llenado();
               break;
            case 2:
               x = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID: "));
               x = x-1;
               imprimir(x);             
               break;
            case 3:
               for(int i=0; i<cantTrans; i++){
                  imprimir(i);
               }
               break;
            case 4:
               System.out.println("Adios...");
               break;
            default:
               System.out.println("Opcion no valida");
               break;
         }
      }while(opc!=4);
      
   }
}