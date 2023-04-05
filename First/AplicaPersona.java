public class AplicaPersona{
   public static void main(String a[]){
      Persona miPersona = new Persona();
      
      miPersona.muestraNombre("Mauricio");
      miPersona.esMayor(21);
      miPersona.muestraSexo("H");
      miPersona.generaDni();
      miPersona.calculaImc(70,1.72);
      miPersona.mensajeImc();
      
      
   } 
}