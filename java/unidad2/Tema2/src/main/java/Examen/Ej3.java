/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej3 {
    //Apartado A
    public static void pintarCuadrado (int num, int altura, char diagonal){
        int cifras=contardig(num);
        int divisor = 1;
        for (int i = 1; i < cifras; i++) {
        divisor=divisor*10;
        }
        int n=0, cifra1 = 0, cifra2 = 0;
        if (cifras==1) {
            cifra1=num;
            cifra2=num;
        } else {
        cifra1 = num / divisor;
        cifra2 = (num % divisor)%10;
        }
        
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j<n) {
                    System.out.print(cifra1);
                } else if (j>n) {
                    System.out.print(cifra2);
                } else {
                    System.out.print(diagonal);
                }    
            }
            n=n+1;
            System.out.println("");
        }
            
    }
    public static int contardig(int num){
        int contador=0;
        while (num > 0) {
            contador++;
            num = num / 10;                      // quita la última cifra
        }
        return contador;
    }
    
    //main
    public static void main(String[] args) {
        pintarCuadrado(482, 4, '*');
    }
}
