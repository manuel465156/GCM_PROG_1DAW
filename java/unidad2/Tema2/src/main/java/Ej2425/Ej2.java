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
        int contador=contardig(num);
        eliminar(num, contador);
        System.out.println(contador);
    }
    public static void eliminar(int num, int cifras){
        int divisor=10^(cifras-1),numfinal=0;
        for (int i = 0; i < cifras; i++) {
            int numtemp=num/divisor;
            if (numtemp==8 | numtemp==0) {
                numfinal=numtemp;
            }
            divisor=divisor/10;
        }
        System.out.println(numfinal);
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
