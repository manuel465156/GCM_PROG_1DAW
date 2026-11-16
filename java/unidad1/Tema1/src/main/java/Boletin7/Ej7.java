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
public class Ej7 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime un numero");
        int num=sr.nextInt(), cont_primos=0, x=2;
        while (x<=num){
            int acumulador=0;
            for (int i = 1; i <= num; i++) {
                if (x%i==0) {
                    acumulador=acumulador+1;
                }
            }
            if (acumulador==2) {
                cont_primos++;
            }
            x=x+1;
        }
        System.out.println("Entre 1 y " + num +  " hay " + cont_primos + " numeros primos");
    }
}
