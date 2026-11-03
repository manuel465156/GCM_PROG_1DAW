/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin3;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime un numero: ");
        int num=sr.nextInt();
        if (num>0) {
            System.out.println("El numero es positivo");
        } else if (num<0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }
}
