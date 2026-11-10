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
public class Ej2 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime el dia de hoy");
        int dia=sr.nextInt();
        System.out.println("Dime el mes de hoy");
        int mes=sr.nextInt();
        System.out.println("Dime el año  de hoy");
        int año=sr.nextInt();
        int fecha_actual=((mes*30)-(30-dia));
        System.out.println("Han transcurrido " + fecha_actual);
    }
}
