/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2324;
import java.util.Scanner;

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
        int resultado=saltando(num, salto);
        System.out.println("Resultado: " + resultado);
    }
    public static int saltando(int n, int salto) {
        int resultado = 0;
        int divisor = 1;
        while (n / divisor >= 10) {
            divisor *= 10;
        }
        // Recorremos las cifras de izquierda a derecha
        int posicion = 0;
        while (divisor > 0) {
            int cifra = n / divisor;
            // Comprobamos si debemos guardar esta cifra
            if (posicion % (salto + 1)==0) {
                resultado = resultado * 10 + cifra;
            }
            n = n % divisor;
            divisor /= 10;
            posicion++;
        }
        return resultado;
    }
}