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
public class Ej1 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime el numero total de segundos:");
        int num=sr.nextInt(), hora, min, seg;
        hora=num/3600;
        min=(num%3600)/60;
        seg=num%60;
        System.out.println(hora + ":" + min + ":" + seg);
        }
    }
