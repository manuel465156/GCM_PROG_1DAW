/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin5;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int suma=0, contador=0, media=0, ceros=0, num=0;
        for (int i = 0; i < 11; i++) {
            System.out.println("Dime un numero:");   
            num=sr.nextInt();
            if (num>0) {
                suma=suma+num;
            } else if (num<0) {
                contador=contador+1;
                media=media+num;
            } else {
                ceros=ceros+1;
            }
        }
        System.out.println("La suma de los positivos es: " + suma);
        System.out.println("La media de los negativos es: " + (media/contador));
        System.out.println("El numero de ceros introducidos es: " + ceros);
    }
}
