//Formula general ax^2+bx+c=0
public class General{
   private double a;
   private double b;
   private double c;
   private double place,raiz;
   private double x1;
   private double x2;
   
   public void pedirVariables(int n,int m,int o){
      a = n;
      b = m;
      c = o;
      /*System.out.println(a);
      System.out.println(b);
      System.out.println(c);*/
   }
   public void sacarRaiz(){
      place = b*b-4*a*c;
      raiz = Math.sqrt(place);
   }
   public void primerValor(){
      //raiz = Math.sqrt(16);
      x1 = (-b+(raiz))/2*a;
      //System.out.println(x1);
   }
   public void segundoValor(){
      //raiz = Math.sqrt((b*b)-4*a*c);
      x2 = (-b-(raiz))/2*a;
      //System.out.println(x2);
   }
   public void imprimirTodo(){
      System.out.println("Valores iniciales a= "+ a +", b= "+ b +", c= "+ c +".");
      System.out.println("El valor de x1= "+ x1 +" y el de x2= "+ x2 +".");
   }
}