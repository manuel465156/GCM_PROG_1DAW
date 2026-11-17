/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin1;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej7 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime un numero");
        esprimo(sr.nextInt());
    }
    public static void esprimo (int num){
        int acumulador=0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                acumulador++;
            }
        }
        if (acumulador==2) {
            System.out.println("El numer es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
}
