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
public class Ej4 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime dos numeros enteros");
        mayor(sr.nextInt(), sr.nextInt());
    }
    public static void mayor(int num1, int num2){
        if (num1>num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1!=num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los dos numeros son iguales");
        }
    }
}
