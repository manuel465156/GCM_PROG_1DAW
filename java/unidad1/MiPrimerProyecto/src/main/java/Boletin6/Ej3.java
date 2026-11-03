/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin6;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime tu numero");
        int num=sr.nextInt();
        //String n=num;
        if (num>=1000 | num<=99) {
            System.out.println("Error no es de 3 cifras");
        } else {
            int capicua1=num%10, capicua2=num%100, capicua3=capicua2%10;
            if (capicua1==capicua3) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es cappicua");
            }
        }        
    }
}
