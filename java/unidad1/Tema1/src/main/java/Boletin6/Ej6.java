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
public class Ej6 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime tu numero");
        int num=sr.nextInt();
        if (num>=1000 | num<=99) {
            System.out.println("Error no es de 3 cifras");
        } else {
            int centena=num%10, medio=num/10, unidad=medio/10, decena=(num/10)%10;
            System.out.println(unidad + " " + decena + " " + centena);
            System.out.println("centenas: " + (unidad*100) + " " + "decenas: " +  (decena*10) + " " + "unidades: " +  centena);
        }
    }
}
