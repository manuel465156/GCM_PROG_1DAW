/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin1;
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime un caracter");
        char c=sr.next().charAt(0);
        boolean EsCaracter= vocal(c);
        System.out.println("¿El caracter " + c + " es una vocal? " + EsCaracter);
    }
    public static boolean vocal(char caracter){
        if (caracter == 'a') {
            return true;
        } else if (caracter == 'e') {
            return true;
        } else if (caracter == 'i') {
            return true;
        } else if (caracter == 'o') {
            return true;
        } else if (caracter == 'u') {
            return true;
        } else {
            return false;
        }
    }
}