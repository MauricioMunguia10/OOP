/*Tarea.Convertir fecha de tres numeros a letra
MMG*/
public class Fecha{
   private int dia;
   private int mes;
   private int ano;
   private int opc,n;
   
   public void setDia(int n){
      dia = n;
   }
   public void setMes(int n){
      mes = n;
   }
   public void setAno(int n){
      ano = n;
   }
   public int getDia(){
      return dia;
   }
   public int getMes(){
      return mes;
   }
   public int getAno(){
      return ano;
   }
   /*Meses 30 dias: Abril,Junio, Septiembre y Noviembre. 4,6,9,11
   Meses con 31 días: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.  1,3,5,7,8,10,12
   Meses con 28 días: Febrero (Menos cuando es bisiesto que tiene 29 días). 2*/ 
   public void ejecuta(){
      opc=getMes();
      if(dia>0 && dia<32){
         if(opc==4 ||opc==6 ||opc==9 ||opc==11){
            if(dia<=30){
            switch(opc){
               case 4:
                  System.out.println("Hoy es "+dia+" de "+ "Abril"+" de "+ano);    
                  break;
               case 6:
                  System.out.println("Hoy es "+dia+" de "+ "Junio"+" de "+ano);    
                  break;
               case 9:
                  if(dia==10){
                     System.out.println("Hoy es "+dia+" de "+ "Septiembre"+" de "+ano);    
                     System.out.println("Happy birthday to me");
                  }else{
                     System.out.println("Hoy es "+dia+" de "+ "Septiembre"+" de "+ano);    
                  }
                  break;
               case 11:
                  System.out.println("Hoy es "+dia+" de "+ "Noviembre"+" de "+ano);    
                  break;
           }
           }else{
               System.out.println("Este mes solo tiene 30 dias");
           }       
         }else if(opc==2){
            if(dia<=28){
               System.out.println("Hoy es "+dia+" de "+ "Febrero"+" de "+ano);    
            }else{
               System.out.println("Febrero solo tiene 28 dias");
            }
                
         }else if(opc==1 ||opc==3 ||opc==5 ||opc==7 ||opc==8 ||opc==10 ||opc==12){   
            switch(opc){
               case 1:
                  System.out.println("Hoy es "+dia+" de "+ "Enero"+" de "+ano);    
                  break;
               case 3:
                  System.out.println("Hoy es "+dia+" de "+ "Marzo"+" de "+ano);    
                  break;
               case 5:
                  System.out.println("Hoy es "+dia+" de "+ "Mayo"+" de "+ano);    
                  break;
               case 7:
                  System.out.println("Hoy es "+dia+" de "+ "Julio"+" de "+ano);    
                  break;
               case 8:
                  System.out.println("Hoy es "+dia+" de "+ "Agosto"+" de "+ano);    
                  break;
               case 10:
                  System.out.println("Hoy es "+dia+" de "+ "Octubre"+" de "+ano);    
                  break;
               case 12:
                  System.out.println("Hoy es "+dia+" de "+ "Diciembre"+" de "+ano);    
                  break;
            } 
            
         }else{
            System.out.println("Mes no valido");
         }
      }else{
         System.out.println("Dia no valido.");
      }
   }
   
      
   
}