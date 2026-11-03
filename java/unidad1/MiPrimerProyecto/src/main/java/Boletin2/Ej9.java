/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin2;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej9 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("1. El helado sin topping cuesta 1.90");
        System.out.println("2. El topping de oreo cuesta 1");
        System.out.println("3. El topping de kitkat cuesta 1");
        System.out.println("4. El topping de lacasitos cuesta 0.50");
        System.out.println("5. El topping de conguitos cuesta 0.50");
        System.out.println("¿Que opcion quieres?");
        int opc =sr.nextInt();
        switch (opc) {
            case 1 -> System.out.println("Tu helado cuesta 1.90");
            case 2 -> System.out.println("Tu helado cuesta 2.90");
            case 3 -> System.out.println("Tu helado cuesta 2.90");
            case 4 -> System.out.println("Tu helado cuesta 2.40");
            case 5 -> System.out.println("Tu helado cuesta 2.40");
            default -> System.out.println("Dame una opcion valida");
        }
    }
}
