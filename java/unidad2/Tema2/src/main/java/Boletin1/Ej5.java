/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin1;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime tres numeros enteros");
        mayor(sr.nextInt(), sr.nextInt(), sr.nextInt());
    }
    public static void mayor(int num1, int num2, int num3){
        int max=Math.max(num1, Math.max(num2,num3));
        System.out.println("El numero mayor es " + max);
    }
}
