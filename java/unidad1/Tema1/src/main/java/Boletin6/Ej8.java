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
public class Ej8 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int numero, decena, unidad;
        System.out.print("Introduce un numero de dos cifras: ");
        numero = sr.nextInt();
        decena = numero / 10;
        unidad = numero % 10;
        if (numero >= 10 && numero <= 99) {
            switch (decena) {
                case 1:
                    switch (unidad) {
                        case 0: System.out.println("Diez"); break;
                        case 1: System.out.println("Once"); break;
                        case 2: System.out.println("Doce"); break;
                        case 3: System.out.println("Trece"); break;
                        case 4: System.out.println("Catorce"); break;
                        case 5: System.out.println("Quince"); break;
                        default: System.out.println("Dieci" + unidad);
                    }
                    break;
                case 2:
                    if (unidad == 0) {
                        System.out.println("Veinte");
                    } else {
                        switch (unidad) {
                            case 1: System.out.println("Veintiuno"); break;
                            case 2: System.out.println("Veintidos"); break;
                            case 3: System.out.println("Veintitres"); break;
                            case 4: System.out.println("Veinticuatro"); break;
                            case 5: System.out.println("Veinticinco"); break;
                            case 6: System.out.println("Veintiseis"); break;
                            case 7: System.out.println("Veintisiete"); break;
                            case 8: System.out.println("Veintiocho"); break;
                            case 9: System.out.println("Veintinueve"); break;
                        }
                    }
                    break;
                case 3: System.out.print("Treinta"); break;
                case 4: System.out.print("Cuarenta"); break;
                case 5: System.out.print("Cincuenta"); break;
                case 6: System.out.print("Sesenta"); break;
                case 7: System.out.print("Setenta"); break;
                case 8: System.out.print("Ochenta"); break;
                case 9: System.out.print("Noventa"); break;
            }
            if (decena >= 3 && unidad != 0) {
                System.out.print(" y ");
                switch (unidad) {
                    case 1: System.out.println("uno"); break;
                    case 2: System.out.println("dos"); break;
                    case 3: System.out.println("tres"); break;
                    case 4: System.out.println("cuatro"); break;
                    case 5: System.out.println("cinco"); break;
                    case 6: System.out.println("seis"); break;
                    case 7: System.out.println("siete"); break;
                    case 8: System.out.println("ocho"); break;
                    case 9: System.out.println("nueve"); break;
                }
            }
        } else {
            System.out.println("El numero debe tener dos cifras.");
        }
        sr.close();
    }
}