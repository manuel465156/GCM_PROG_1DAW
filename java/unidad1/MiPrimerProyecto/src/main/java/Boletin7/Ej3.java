/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin7;

/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej3 {
    public static void main(String[] args) {
        int num=1, acumulador=1;
        for (int i = 0; i < 10; i++) {
            acumulador=acumulador*num;
            num=num+2;
        }
        System.out.println(acumulador);
    }
}
