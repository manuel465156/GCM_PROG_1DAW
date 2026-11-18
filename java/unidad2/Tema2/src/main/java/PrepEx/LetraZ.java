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
public class LetraZ {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura (impar y mayor que 3): ");
        int altura = sc.nextInt();

        // Validar: impar y mayor que 3
        while (altura <= 3 || altura % 2 == 0) {
            System.out.print("Valor incorrecto. Introduce la altura (impar y mayor que 3): ");
            altura = sc.nextInt();
        }

        int anchura = altura; // anchura igual a la altura

        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                // Borde superior e inferior completos
                for (int j = 0; j < anchura; j++) {
                    System.out.print("*");
                }
            } else {
                // Diagonal: el asterisco se desplaza de derecha a izquierda
                for (int j = 0; j < anchura; j++) {
                    if (j == anchura - 1 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
