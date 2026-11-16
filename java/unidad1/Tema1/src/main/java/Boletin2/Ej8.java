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
public class Ej8 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime dos numeros:");
        int num1 =sr.nextInt(), num2 =sr.nextInt();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elije una opcion: ");
        int opc =sr.nextInt();
        switch (opc) {
            case 1: 
                System.out.println(num1 + num2);
                break;
            case 2: 
                System.out.println(num1 - num2);
                break;
            case 3: 
                System.out.println(num1 * num2);
                break;
            case 4: 
                if (num2==0) {
                    System.out.println("No se puede dividir por 0");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
            case 5: 
                System.out.println("Saliendo del menu");
                break;
            default:
                System.out.println("Dame una opcion valida");
                break;
        }
        
    }     
}
