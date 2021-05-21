package luisgs.com;



import java.util.Scanner;

public class Rectangle implements Shape {
    private double lado1, lado2;

    public Rectangle(double lado1, double lado2){
        this.lado1= lado1;
        this.lado2=lado2;
    }
    public Rectangle(){
        System.out.println("Inserte medidas de largo:");
        Scanner sn = new Scanner(System.in);
        lado1 = sn.nextInt();
        System.out.println("Insertar medidas de ancho:");
        Scanner sn1 = new Scanner(System.in);
        lado2 = sn1.nextInt();
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }
    @Override
    public double area(){
        return lado1*lado2;
    }
    @Override
    public double perimetro(){
        return 2*lado1+lado2;
    }
}
