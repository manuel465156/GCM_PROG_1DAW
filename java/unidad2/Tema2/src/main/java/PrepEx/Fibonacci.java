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
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime un numero");
        int n=sr.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + "  ");
        }
    }
    public static int fibonacci(int n){
        if (n == 0) {
            return 0; // Caso base 1
        } else if (n == 1) {
            return 1; // Caso base 2
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Caso recursivo
        }
    }
}
