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
public class Ej9_Mientras {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int max_temp=Integer.MIN_VALUE;
        int media=0;
        String max_nombre="";
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime el nombre del alumno:");
            String nombre=sr.next();
            int j=0;
            while (j<4) {
                System.out.println("Dime la nota del alumno " + nombre);
                int nota=sr.nextInt();
                if (nota>10 | nota<0) {
                    System.out.println("Formato de nota incorrecto");
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
