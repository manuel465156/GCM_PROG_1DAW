/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrepEx;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Factorial {
        public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("Introduzca un número del cual quiera su factorial: ");
        int n=sr.nextInt();
        System.out.println(factorial(n)); // Salida: 120
    }

    public static long factorial(int n) {
        // Caso base: 0! = 1 y 1! = 1
        if (n <= 1) {
            return 1;
        }
        // Caso recursivo: n! = n * (n-1)!
        return n * factorial(n - 1);
    }
}
