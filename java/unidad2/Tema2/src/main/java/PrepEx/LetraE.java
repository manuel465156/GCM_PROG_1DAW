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
public class LetraE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.print("Introduce la altura (impar y mayor que 3): ");
        altura = sc.nextInt();

        // Validar: impar y mayor que 3, se repite hasta que sea correcto
        while (altura <= 3 || altura % 2 == 0) {
            System.out.print("Valor incorrecto. Introduce la altura (impar y mayor que 3): ");
            altura = sc.nextInt();
        }

        int anchura = altura; // anchura igual a la altura
        int medio = altura / 2; // fila central

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (j == 0 || i == 0 || i == altura - 1 || i == medio) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
