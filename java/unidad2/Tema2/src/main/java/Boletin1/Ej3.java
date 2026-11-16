/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin1;
import static java.lang.Math.PI;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        System.out.println("Dime el radio de la base");
        double radio=sr.nextDouble();
        System.out.println("Dime la altura");
        double altura=sr.nextDouble();
        System.out.println("1.Calcular area");
        System.out.println("2.Calcular volumen");
        int opc=sr.nextInt();
        switch (opc) {
            case 1 -> area(radio, altura);
            case 2 -> volumen(radio, altura);
            default -> System.out.println("Opcion invalida");
        }
    }
    public static void area(double radio, double altura){
        System.out.println(2*PI*radio*(radio*altura));
    }
    public static void volumen(double radio, double altura){                
        System.out.println(PI*(radio*radio)*altura);
    }
}
