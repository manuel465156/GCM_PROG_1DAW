/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin4;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int tirada=0;
        for (int i = 0; i < 2; i++) {
             System.out.println("Cuanto has sacado:");
                String cara=sr.next();
                if (cara .equalsIgnoreCase("uno")) {
                    tirada=tirada+1;
                } else if (cara .equalsIgnoreCase("dos")) {
                    tirada=tirada+2;
                } else if (cara .equalsIgnoreCase("tres")) {
                    tirada=tirada+3;
                } else if (cara .equalsIgnoreCase("cuatro")) {
                    tirada=tirada+4;
                } else if (cara .equalsIgnoreCase("cinco")) {
                    tirada=tirada+5;
                } else if (cara .equalsIgnoreCase("seis")) {
                    tirada=tirada+6;
                } else {
                    System.out.println("Tirada invalida");
                    break;
                }
        }
        System.out.println("La suma de las dos tiradas es:" + tirada);
    }
}
