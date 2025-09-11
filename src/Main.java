
//Yeferson Camilo Blanco Carrion

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Menu
        Scanner teclado = new Scanner(System.in);
        int a;
        boolean b = true;
        System.out.println("1. Dados");
        System.out.println("2. Dados 2");
        System.out.println("3. Estado nutricional");
        System.out.println("4. Tabla de multiplicar");
        System.out.println("5. Carrera");
        System.out.println("6. Salir");
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
                carrera();

                break;
            case 6:
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

    public static void carrera () {
        int corredor1=0,corredor2=0,a,b;
        Random aleatorio = new Random();
        for(int x=1;x<=15;x++){

            a=aleatorio.nextInt((6-1)+1)+1;
            b=aleatorio.nextInt((6-1)+1)+1;
            corredor1+=a;
            corredor2+=b;
            System.out.println("Los pasos del corredor 1 han sido: "+ corredor1);
            System.out.println("Los pasos del corredor 2 han sido: "+ corredor2);
            if(a==6){
                a-=8;

            }else if(b==6){
                b-=8;

            }else if(a>=50 || b>=50){
                if(a>b){
                    System.out.println("El corredor 1 gana");

                }else if(b>a){
                    System.out.println("El corredor 2 gana");
                }else if (a==b){
                    System.out.println("Empate");
                }

            }






        }

    }


}