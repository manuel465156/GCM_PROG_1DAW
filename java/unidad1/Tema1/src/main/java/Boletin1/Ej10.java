/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin1;
import java.util.Scanner;
import javax.swing.plaf.SliderUI;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime tu nombre: ");
        String nombre=sr.next();
        System.out.println("Dime tu edad: ");
        int edad=sr.nextInt();
        System.out.println("Hola " + nombre + " , tienes " + edad + " años,¡que mayor eres!");
    }
            
}
