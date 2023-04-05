/*El costo de las llamadas telefonicas internacionales depende da la
geografica en la que se encuentre el pais destino,el numero de minutos hablados
segun la duracion de la llamada. En la sig tabla se opresenta el costo
por minuto y por zona. A cada zona se le ha asociado una lcave.
EL programa debera mostrar a la zona que se hablo y el costo por llamada
----------------------------------------------------------------------
clave | zona | precio minuto(3min)| precio minuto (4 en adekante)
---------------------------------------------------------------------
3        america del norte       2.1      1.5
5        america central         2.5      1.8
7        america del sur         4.7      3.5
11       europa                  4.9      2.7      
13       asia                    5.0      4.6
17       africa                  5.0      4.6
19       oceania                 5.2      3.9

MMG*/
public class Telefono{
   private double costo;
   private int clave;
   private double pTres,pCuatro;
   private double min;
   
   public void setClave(int n){
      clave = n;
   }
   public void setMin(double n){
      min = n;
   }
   public double getMin(){
      return min;
   }
   public int getClave(){
      return clave;
   }
   public void costoMin(double n, double m){
      pTres = n;
      pCuatro = m;
      if(min<4){
         costo = pTres*min;
      }else{
         min = min-3;
         costo = pCuatro*min + pTres*3;
      }
      System.out.println("El costo de la llamada es de: "+costo);
   }
   public void costoZona(){
      switch(clave){
         case 3:
            System.out.println("Selecciono la zona 3 'America del norte'.");
            costoMin(2.1,1.5);
            break;
         case 5:
            System.out.println("Selecciono la zona 5 'America central'.");
            costoMin(2.5,1.8);
            break;
         case 7:
            System.out.println("Selecciono la zona 7 'America del sur'.");
            costoMin(4.7,3.5);
            break;
         case 11:
            System.out.println("Selecciono la zona 11 'Europa'.");
            costoMin(4.9,2.7);
            break;
         case 13:
            System.out.println("Selecciono la zona 13 'Asia'.");
            costoMin(5.0,4.6);
            break;
         case 17:
            System.out.println("Selecciono la zona 17 'Africa'.");
            costoMin(5.0,4.6);
            break;
         case 19:
            System.out.println("Selecciono la zona 19 'Oceania'.");
            costoMin(5.2,3.9);
            break;
      }
   }
}