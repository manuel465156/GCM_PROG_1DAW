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
public class Ej1 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime tu nombre:");
        String nombre=sr.next();
        System.out.println("Dime tu edad:");
        int edad=sr.nextInt();
        if (edad>18 & edad<25) {
            System.out.println(nombre + " eres apto para el servicio militar");
        } else {
            System.out.println(nombre + " no puedes prestar el servicio militar");                    
        }
    }
}
