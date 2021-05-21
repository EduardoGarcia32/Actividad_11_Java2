package luisgs.com;



import java.util.Scanner;

public class Circle implements Shape {
    public static final double pi = 3.1416;
    private double radio;

    public Circle(double radio){
        this.radio = radio;
    }
    public Circle(){
        System.out.println("Ingrese Radio:");
        Scanner scanner = new Scanner(System.in);
        radio = scanner.nextInt();
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {

        return radio;
    }

    public double getDiametro(){

        return radio * 2;
    }
    @Override
    public double area(){
        return pi*radio*radio;
    }
    @Override
    public double perimetro(){
        return pi*getDiametro();
    }
}
