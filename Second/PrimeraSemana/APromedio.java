//MMG
public class APromedio{
   public static void main(String a[]){
      Promedio miPromedio = new Promedio();
      miPromedio.setCalificaciones(10,9,10,9,8);
      miPromedio.setPromedio();
      miPromedio.setMatricula(22302078);
      miPromedio.setNombre("Mauricio");
      System.out.println("Alumno: "+ miPromedio.getNombre());
      System.out.println("Matricula: "+ miPromedio.getMatricula());
      System.out.println("Promedio: "+ miPromedio.getPromedio());
      
   }
}