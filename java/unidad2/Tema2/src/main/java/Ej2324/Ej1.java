/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2324;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej1 {
     public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        boolean bandera=true;
        while (bandera) {
            System.out.println("Introduce una altura: ");
            int altura=sr.nextInt();
            if (altura%2==0 || altura<3) {
                System.out.println("Altura incorracta");
            } else {
                bandera=false;
                dibujarM(altura);
                System.out.println("");
                dibujarY(altura);
                System.out.println("");
                dibujar(altura);
            }
        }
    }
    public static void dibujarY (int altura){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i<=altura/2 &&
                   (j==i || j==altura-1-i) ||
                   (i>altura/2 && j==altura/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void dibujarM (int altura){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == 0 || j == altura - 1 ||
                        (i==j && i<=altura/2) ||
                        (i+j==altura-1 && i<=altura/2)) {
                     System.out.print("*");
                } else {
                   System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void dibujar (int altura){
        //Dibujar filas
        for (int i = 0; i < altura; i++) {
            //Dibujar M
            for (int j = 0; j < altura; j++) {
                if (j == 0 || j == altura - 1 ||
                        (i==j && i<=altura/2) ||
                        (i+j==altura-1 && i<=altura/2)) {
                     System.out.print("*");
                } else {
                   System.out.print(" ");
                }
            }
            //Separa letras
            System.out.print("    ");
            //Dibujar Y
            for (int j = 0; j < altura; j++) {
                if (i<=altura/2 &&
                   (j==i || j==altura-1-i) ||
                   (i>altura/2 && j==altura/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            }
        }
}
