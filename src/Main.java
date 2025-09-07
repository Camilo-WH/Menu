import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Menu
        Scanner teclado = new Scanner(System.in);
        int a;
        boolean b = true;
        System.out.println("Elija su opcion: 1: Dados(2) 2: Dados(3) 3: Estado nutricional 4: Tabla de Multiplicar 5:Salir ");
        a = teclado.nextInt();
        switch (a) {
            case 1:
                dados2();
                break;
            case 2:
                dados3();
                break;
            case 3:
                System.out.println(nutricion());
                break;
            case 4:
                tablaMultiplicar();
                break;
            case 5:
                b = false;
                break;
            default:
                System.out.println("Opcion invalida ");
                break;


        }


    }


    public static void dados2() {

        Random aleatorio = new Random();
        int a, b, sumaD1 = 0, sumaD2 = 0;
        for (int x = 1; x <= 20; x++) {
            a = aleatorio.nextInt((6 - 1) + 1) + 1;
            b = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaD1 += a;
            sumaD2 += b;
            System.out.println("La suma del dado 1 es:" + sumaD1);
            System.out.println("La suma del dado 2 es:" + sumaD2);

        }

        if (sumaD1 == sumaD2) {
            System.out.println("Empate");
        }
        else if (sumaD1 > sumaD2) {
            System.out.println("Dado 1 gana");
        }else{
            System.out.println("Dado 2 gana");
        }


    }


    public static void dados3() {
        Random aleatorio = new Random();
        int a, b, sumaD1 = 0, sumaD2 = 0, c, sumaD3 = 0;
        for (int x = 1; x <= 20; x++) {
            a = aleatorio.nextInt((6 - 1) + 1) + 1;
            b = aleatorio.nextInt((6 - 1) + 1) + 1;
            c = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaD1 += a;
            sumaD2 += b;
            sumaD3 += c;
            System.out.println("La suma del dado 1 es:" + sumaD1);
            System.out.println("La suma del dado 2 es:" + sumaD2);
            System.out.println("La suma del dado 3 es:" + sumaD3);
        }

        if (sumaD1 == sumaD2 && sumaD2 == sumaD3) {
            System.out.println("Empate");
        }
        if (sumaD1 > sumaD2 || sumaD1 > sumaD3) {
            if (sumaD1 > sumaD2 && sumaD1 > sumaD3) {
                System.out.println("Dado 1 Gana");
            } else {
                System.out.println("Dado 1 Segunda posicion");
            }
        } else {
            System.out.println("Dado 1 tercera posicion");
        }
        if (sumaD2 > sumaD1 || sumaD2 > sumaD3) {
            if (sumaD2 > sumaD1 && sumaD2 > sumaD3) {
                System.out.println("Dado 2 Gana");
            } else {
                System.out.println("Dado 2 Segunda posicion");
            }
        } else {
            System.out.println("Dado 2 tercera posicion");
        }
        if (sumaD3 > sumaD1 || sumaD3 > sumaD2) {
            if (sumaD3 > sumaD2 && sumaD3 > sumaD1) {
                System.out.println("Dado 3 Gana");
            } else {
                System.out.println("Dado 3 Segunda posicion");
            }
        } else {
            System.out.println("Dado 3 tercera posicion");
        }


    }

    public static String nutricion() {

        Scanner teclado = new Scanner(System.in);
        double peso, altura, imc;
        String resultado= "";
        System.out.println("Digite su peso");
        peso = teclado.nextDouble();
        System.out.println("Digite su altura");
        altura = teclado.nextDouble();
        imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 27) {
            System.out.println("Sobre peso de grado 1");
        } else if (imc < 30) {
            System.out.println("Sobre peso de grado 2");
        } else if (imc < 35) {
            System.out.println("Obesidad de tipo 1");
        } else if (imc < 40) {
            System.out.println("Obesidad de tipo 2");
        } else if (imc < 46) {
            System.out.println("obesidad tipo 3 (Morbida)");
        } else {
            resultado = "Obesidad extrema";
        }
        return resultado;
    }
    public static void tablaMultiplicar(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero para ver su tabla de multiplicar");
        numero=teclado.nextInt();
        System.out.println("Tabla del "+ numero + ":");
        for(int i=1; i<=10;i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }

    }


}