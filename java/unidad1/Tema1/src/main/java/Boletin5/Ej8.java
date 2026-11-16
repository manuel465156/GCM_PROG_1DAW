/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin5;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        int num=0, contador=0;
        while (num>=0) {
            System.out.println("Dime un numero");
            num=sr.nextInt();
            contador=contador+1;
        }
        System.out.println("El numero total de positivos es: " + (contador-1));
    }
}
