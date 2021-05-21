package luisgs.com;



import java.util.Scanner;

public class Square implements Shape{
    protected double lado;
    public Square(double lado){
        this.lado = lado;
    }
    public Square(){
        System.out.println("Inserte medidas de los lados:");
        Scanner scanner  = new Scanner(System.in);
        lado = scanner.nextInt();
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    @Override
    public double area (){
        return lado*lado;
    }
    @Override
    public double perimetro(){
        return lado * 4;
    }
}
