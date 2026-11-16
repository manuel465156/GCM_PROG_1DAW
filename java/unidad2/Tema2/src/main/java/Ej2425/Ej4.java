/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2425;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Introduce las horas:");
        int horas=sr.nextInt();
        System.out.println("Introduce los minutos:");
        int min=sr.nextInt();
        System.out.println("Introduce los segundos:");
        int seg=sr.nextInt();
        System.out.println("Introduce los segundos a incrementar:");
        int incremento=sr.nextInt();
        calcularincremento(horas, min, seg, incremento);
    }
    public static void calcularincremento(int horas, int min, int seg, int incremento){
        System.out.println("Aumentando la hora...");
        for (int i = 0; i < incremento; i++) {
            seg=seg+1;
            if (seg>59) {
                min=min+1;
                seg=00;
            }
            if (min>59) {
                horas=horas+1;
                min=00;
            } 
            System.out.println(horas + ":" + min + ":" + seg);
        }
    }
}
