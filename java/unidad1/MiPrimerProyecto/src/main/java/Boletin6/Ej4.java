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
public class Ej4 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime el dia de tu fecha de nacimiento:");
        int dia=sr.nextInt();
        System.out.println("Dime el mes de tu fecha de nacimiento:");
        int mes=sr.nextInt();
        System.out.println("Dime el año de tu fecha de nacimiento:");
        int año=sr.nextInt();
        System.out.println("Dime el dia de hoy");
        int dia2=sr.nextInt();
        System.out.println("Dime el mes de hoy");
        int mes2=sr.nextInt();
        System.out.println("Dime el año de hoy");
        int año2=sr.nextInt();
        System.out.println("Tienes " + (año2-año) + " años");
        //28/10/2026
        //13-01-2008
                
    }
}
