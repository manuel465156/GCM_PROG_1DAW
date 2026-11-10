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
public class Ej2 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime dos numeros: ");
        double num1=sr.nextInt() , num2=sr.nextInt();
        System.out.println("1.SUMAR LOS NUMEROS");
        System.out.println("2.RESTAR LOS NUMEROS");
        System.out.println("3.MULTIPLICAR LOS NUMEROS");
        System.out.println("4.DIVIDIR LOS NUMEROS");
        int opc=sr.nextInt();
        switch (opc) {
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
