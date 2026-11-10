/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin6;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime un numero:");
        int num=sr.nextInt(), acumulador=0;
        while (num > 0) {
            acumulador = acumulador + num % 10;  // suma la última cifra
            num = num / 10;                      // quita la última cifra
        }
        System.out.println("La suma de sus cifras es: " + acumulador);
    }
}
