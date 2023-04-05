/*Programa Persona que tiene los datos: nombre,edad,DNI,sexo,peso,altura
calcula su IMC, si es mayor de edad,pide su nombre,su sexo,genera una DNI aleatoria
y muestra todos sus datos al final
Mauricio MG
*/
public class Persona{
   private String name;
   private int age;
   private int dni;
   private String sex;
   private double weight;
   private double height;
   private double imc;
   private boolean mayorEdad;
      
   public void calculaImc (double w ,double h){
      weight = w;
      height = h;
      imc = (weight)/(height*height);
      //System.out.println(imc);
   }
   public void mensajeImc (){
      if (imc<20)
         System.out.println("Esta por debajo del peso ideal.");
      else if (20<imc && imc<25)
         System.out.println("Esta en su peso ideal.");
      else 
         System.out.println("Esta por encima del peso ideal.");
   }
   public void esMayor(int e){
      age=e;
      if (age>=18)
         System.out.println("Es mayor de edad");
      else
         System.out.println("Es menor de edad");   
   }
   public void muestraNombre(String nom){
      name=nom;
      System.out.println("El nombre del usuario es:" + name);
   }
   public void muestraSexo(String se){
      sex=se;
      System.out.println("Es de sexo:" + sex);
   }
   public void generaDni(){
      dni = (int)Math.floor(Math.random()*10000000+1);
      System.out.println("La DNI es: #" + dni);
   }
   
   
}