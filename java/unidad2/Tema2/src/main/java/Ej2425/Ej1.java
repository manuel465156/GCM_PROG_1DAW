/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2425;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime la altura del calcetin");
        calcetin(sr.nextInt());
    }
    public static void calcetin(int num){
        if (num>=4) {
        boolean bandera=true;
        for (int i = 1; i <= num; i++) {
            if (bandera) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 6; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
                if (num-2==i) {
                    bandera=false;
                }
            }
            else if (bandera==false) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 3; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 6; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        }else{
            System.out.println("Altura introducida incorrecta");
        }
    }
}
