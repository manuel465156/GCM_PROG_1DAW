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
public class Ej1 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.print("Dime un numero:");
        int n = sr.nextInt();
        System.out.println("El doble de ese numero es: " + n*2);
        System.out.println("El triple de ese numero es: " + n*3);
    }
}
