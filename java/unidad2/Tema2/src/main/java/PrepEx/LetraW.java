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
public class LetraW {
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

        int anchura = 2 * altura - 1; // espacio para dos V seguidas
        int centro = altura - 1;      // columna del pico central de arriba

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (j == i / 2                              // trazo 1: baja de arriba-izquierda
                        || j == centro - i / 2              // trazo 2: sube al pico central
                        || j == centro + i / 2              // trazo 3: baja del pico central
                        || j == anchura - 1 - i / 2) {      // trazo 4: sube a arriba-derecha
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
