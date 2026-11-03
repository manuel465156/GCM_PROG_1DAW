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
public class Ej9 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int max_temp=Integer.MIN_VALUE;
        int media=0;
        String max_nombre=".";
        String nombre="";
        for (int i = 0; i < 2; i++) {
            System.out.println("Dime el nombre del alumno:");
            nombre=sr.next();
            media=0;
            for (int j = 0; j < 3; j++) {
                System.out.println("Dime la nota del alumno " + nombre);
                int nota=sr.nextInt();
                if (nota>10 | nota<0) {
                    System.out.println("Formato de nota incorrecto");
                    j--;
                } else {
                    media=media+nota;
                }
            }
            media=(media/3);
            if (media>max_temp) {
                max_temp=media;
                max_nombre=nombre;
            }
        }
        System.out.println("El alumno con la mayor nota media es: " + max_nombre + " con una media de " + max_temp);
    }
}
