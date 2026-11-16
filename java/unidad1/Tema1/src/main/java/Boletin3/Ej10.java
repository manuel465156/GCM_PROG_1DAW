/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin3;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        int min = 1;
        int max = 3;
        int num = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(num);
        System.out.println("Vamos ha jugar a piedra,papel o tijeras");
        System.out.println("¿Que eliges?");
        String opc=sr.next();
        if (opc .equalsIgnoreCase("piedra")) {
            if (num==1) {
                System.out.println("Has empatado");
            } else if (num==2) {
                System.out.println("Has perdido");
            } else {
                System.out.println("Has ganado");
            }
{
            }
        } else if (opc .equalsIgnoreCase ("papel")) {
            if (num==1) {
                System.out.println("Has ganado");
            } else if (num==2) {
                System.out.println("Has empatado");
            } else {
                System.out.println("Has perdido");
            }
        } else if (opc .equalsIgnoreCase("tijeras")) {
            if (num==1) {
                System.out.println("Has perdido");
            } else if (num==2) {
                System.out.println("Has ganado");
            } else {
                System.out.println("Has empatado");
            }
        } else {
            System.out.println("Dame una respuesta valida");
            System.out.println("piedra/papel/tijeras");
        }

    }
}
