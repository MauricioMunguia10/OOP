package Extra;

public class Cuenta {
    private String titular;
    private double cantidad,total;
    
    public Cuenta(String x){
        titular = x;
    }
    public Cuenta(String x, double y){
        titular = x;
        cantidad = y;
    }
    public void setTitular(String x){
        titular = x;
    }
    public void setCantidad(double x){
        cantidad = x;
    }
    public String getTitular(){
        return titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void ingresar(){
        System.out.println("Ingreso de "+getTitular());
        if (getCantidad()>0){
            total = total + getCantidad();
            System.out.println("Total = "+total);
        }else{
            System.out.println("Total = "+total);
        }
    }
    public void retirar(){
        System.out.println("Retiro de "+getTitular());
        total = total - getCantidad();
        if (total>0){
            System.out.println("Total = "+total);
        }else{
            total = 0;
            System.out.println("Total = "+total);
        }
    }
}