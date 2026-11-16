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
public class Ej2 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime dos numeros enteros");
        comprendido(sr.nextInt(), sr.nextInt());
    }
    public static void comprendido (int num1, int num2){
        if (num1>num2) {
            System.out.println("Numeros comprendidos: ");
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        } else if (num1!=num2) {
            System.out.println("Numeros comprendidos: ");
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Los dos numero son iguales");
        }
{
        }
}
}
