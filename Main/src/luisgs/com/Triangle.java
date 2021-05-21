package luisgs.com;

import java.util.Scanner;

public class Triangle implements Shape {
    private double lado, altura,base;

    public Triangle(double lado, double altura, double base){
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }
    public Triangle(){
        System.out.println("Inserta medidas de los lados");
        Scanner scanner = new Scanner(System.in);
        lado = scanner.nextInt();
        System.out.println("Inserte medidas de la altura:");
        Scanner scanner1 = new Scanner(System.in);
        altura = scanner1.nextInt();
        System.out.println("Inserte medidas de la base:");
        Scanner scanner2= new Scanner(System.in);
        base = scanner2.nextInt();
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {

        return base;
    }
    @Override
    public double area(){
        return base * altura/2;
    }
    @Override
    public double perimetro(){
        return lado * 3;
    }

}
