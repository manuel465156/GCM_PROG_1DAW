/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2526;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner pepe=new Scanner (System.in);
        System.out.println("Dime un numero");
        int num=(pepe.nextInt());
        pabajo(num);
        parriba(num);
        
    }
    public static void pabajo(int num){
        for (int i = num; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void parriba(int num){
        for (int i = 2; i<=num; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
