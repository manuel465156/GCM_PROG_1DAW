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
public class Ej7 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime un numero de hasta 2 cifras");
        int num=sr.nextInt();
        if (num>99) {
            System.out.println("Error, dime un numero de hasta 2 cifras");
        } else {
            if (num<10) {
                System.out.println("Tu numero es de una cifra");
                System.out.println("Al numero " + num + " le falta " + (10-num) + " para ser de 2 cifras");
            } else {
                 System.out.println("Tu numero es de dos cifra");
                System.out.println("A tu numero le falta " + (100-num) + " para ser de 3 cifras");
            
            }
        }
    }
}
