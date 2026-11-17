/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2324;
import java.util.Scanner;
import static Ej2425.Ej2.contardig;

/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        boolean bandera1=true, bandera2=true;
        int num = -1, salto = 3;
        while (bandera1) {
            System.out.print("Dime un numero:");
            num=sr.nextInt();
            if (num>=0) {
                bandera1=false;
            } else {
                System.out.println("Error numero positivo");
            }
        }
        while (bandera2) {
            System.out.print("Introduce el salto: ");
            salto=sr.nextInt();
            if (salto<0 || salto>2) {
                System.out.println("Error salto entre 0 y 2");
            } else {
                bandera2=false;
            }
        }
        int cifras=contardig(num), divisor=1;
        for (int i = 1; i < cifras; i++) {
            divisor*=10;
        }
        int resultado=saltando(num, salto, divisor);
        System.out.println("Resultado: " + resultado);
    }
    public static int saltando(int n, int salto, int ncifras){
        switch (salto) {
            case 1 -> {
                System.out.println("Has puesto 1 salto");
                if (ncifras%2==0) {
                    int pasos=(ncifras)/2-1;
                    int izq=cifraizq(n, ncifras), acumulador=1;
                    while (izq>pasos) {
                        acumulador=(acumulador*10)+izq ;
                    }
                    return acumulador;
                } else {
                    int pasos=(ncifras)/2+1;
                    int izq=cifraizq(n, ncifras), acumulador=1;
                    while (izq>pasos) {
                        acumulador=(acumulador*10)+izq ;
                    }
                    return acumulador;
                }
            }
            case 2 -> {
                System.out.println("Has puesto 2 salto");
                int pasos=(ncifras/3)+1;
                int izq=cifraizq(n, ncifras), acumulador=1;
                while (izq>pasos) {
                    acumulador=(acumulador*10)+izq ;
                }
                return acumulador;
            }
            default -> {
                System.out.println("Has puesto 0 salto");
                return n;
            }
        }
    }
    public static int cifraizq(int n, int divisor){
            int num=(n/divisor);
            int sobrante=n%divisor;
            System.out.println(num);
            System.out.println(sobrante);
        return num;
        return sobrante;
    }
}