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
public class Potencia {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduce el exponente: ");
        int exponente = sc.nextInt();
        if (exponente >= 0 && base == (int) base) {
            System.out.println((int) base + "^" + exponente + " = " + potencia((int) base, exponente));
        } else {
            System.out.println(base + "^" + exponente + " = " + potenciaDouble(base, exponente));
        }
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }


    public static double potenciaDouble(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return 1.0 / potenciaDouble(base, -exponente);
        }
        return base * potenciaDouble(base, exponente - 1);
    }


}
