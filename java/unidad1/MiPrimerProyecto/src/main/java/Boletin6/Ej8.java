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
public class Ej8 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime un numero de dos cifras");
        int num=sr.nextInt();
        if ((num>99) | (num<10)) {
            System.out.println("Debes introducir un numero de 2 cifras");
        } else{
            char letra=(char)num;
            System.out.println("El  es: " + letra);
        }
    }
}
