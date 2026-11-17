/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apuntes;
import java.util.Scanner;

/**
 *
 * @author 1DAW-mgoncor1301
 */
public class EjFunciones {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("Dime un numero: ");
        imprimirDescendente(sr.nextInt());
    }
    public static void imprimirDescendente (int n){
        if (n==1) {
            System.out.println(n);
        }else{
            System.out.println(n);
            imprimirDescendente(n-1);
        }
    }
}
