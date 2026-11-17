/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2425;
import static Ej2425.Ej2.contardig;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime tus numeros favoritos: ");
        int num1=sr.nextInt(), num2=sr.nextInt(), num3=sr.nextInt();
        System.out.println("Introduce el numero de loteria: ");
        int loteria=sr.nextInt();
        int cifras=contardig(loteria);
        suerte(loteria, cifras, num1, num2, num3);
    }
    public static void suerte (int num, int cifras, int fav1, int fav2, int fav3){
    int divisor = 1, contadorfav=0, contador=0;
    for (int i = 1; i < cifras; i++) {
        divisor *= 10;
    }
    while (divisor > 0) {
        int cifra = (num / divisor) % 10;  // cifra individual
        if (cifra != fav1 && cifra!= fav2 && cifra!= fav3) {
            contador=contador+1;
        } else {
            contadorfav=contadorfav+1;
        }
        divisor /= 10;
    }
        if (contador>contadorfav) {
            System.out.println("Esos numeros no dan suerte");
        } else {
            System.out.println("Esos numeros dan suerte");
        }
    }
}
