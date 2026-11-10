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
public class Ej4 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime un numero");
        int num=sr.nextInt(), acumulador=1;
        while (num!=0) {
            acumulador=acumulador*num;
            num=num-1;
        }
        System.out.println(acumulador);
    }
}
