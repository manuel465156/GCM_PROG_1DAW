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
public class Ej5 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        boolean bandera=false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime la calificacion del alumno");
            int nota=sr.nextInt();
            if (nota<5) {
                bandera=true;
            }
        }
        if (bandera) {
            System.out.println("Alguien ha suspendido");
        } else {
            System.out.println("Nadia ha suspendido");
        }
    }
}
