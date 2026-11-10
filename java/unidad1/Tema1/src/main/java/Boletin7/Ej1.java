/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin7;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime el valor minimo");
        int min=sr.nextInt();
        System.out.println("Dime el valor maximo");
        int max=sr.nextInt();
        int num=0;
        while (num>max | num<min) {
            System.out.println("Dime un valor dentro del rango");
            num=sr.nextInt(); 
        }
    }
}
