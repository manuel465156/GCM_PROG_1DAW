/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2425;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime un numero");
        int num=sr.nextInt();
        if (num<0) {
            System.out.println("El numero debe ser positivo");
        } else {
        int contador=contardig(num);
        eliminar(num, contador);
        }
    }
    public static void eliminar(int num, int cifras){
    int divisor = 1;
    for (int i = 1; i < cifras; i++) {
        divisor *= 10; // lo mismo a divisor=divisor*10
    }
    int numfinal = 0, contador=0;
    while (divisor > 0) {
        int cifra = (num / divisor) % 10;  // cifra individual
        if (cifra != 8 && cifra!=0) {
            numfinal = numfinal * 10 + cifra;
        } else {
        contador=contador+ 1;
        }
        divisor /= 10;
    }
    System.out.println("Numero resultado: " + numfinal);
    System.out.println("Digitos eliminados: " + contador);

    }        
    public static int contardig(int num){
        int contador=0;
        while (num > 0) {
            contador++;
            num = num / 10;                      // quita la última cifra
        }
        return contador;
    }
}
