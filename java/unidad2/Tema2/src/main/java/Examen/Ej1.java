/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
import java.util.Scanner;
/**
 *
 * @author 1DAW-mgoncor1301
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre=sc.next();
        System.out.println("Introduce tu edad");
        int edad=sc.nextInt();
        System.out.println("¿Corresponde la inscripcion al Mes de Promocion? (S/N)");
        String mes=sc.next();
        System.out.println("¿Deseas inscribirte a la clase extra de Crossfit? (S/N)");
        String clase1=sc.next();
        System.out.println("¿Deseas inscribirte a la clase extra de Hyrox? (S/N)");
        String clase2=sc.next();
        System.out.println("¿Deseas inscribirte a la clase extra de Entrenamiento Funcional? (S/N)");
        String clase3=sc.next();
        long extra = 1, cuota = 0, contador=0;
        boolean promocion=false, menor=false;
        
        if (clase1.equalsIgnoreCase("S")) {
            contador=contador+1;
        }
        if (clase2.equalsIgnoreCase("S")) {
            contador=contador+1;
        }
        if (clase3.equalsIgnoreCase("S")) {
            contador=contador+1;
        }
        if (mes.equalsIgnoreCase("S")) {
            promocion=true;
        }
        if (edad>0 && edad<12) { //He puesto que sea tambien mayor a 0 años para que no se pueda inscribir alguien con una edad de 0 o negativa
            cuota=0;
            
            menor=true;
        } else if ((edad>=12 && edad<=17)) {
            if (promocion) {
                cuota=30;
            } else {
                cuota=35;
            }
            
        } else if (edad>=18) {
            if (promocion) {
                cuota=30;
            } else {
                cuota=40;
            }
        } else {
            System.out.println("Edad erronea");
        }
        if (menor) {
            extra=contador*5;
        }else {
            extra=contador*5;
            extra=extra/100;
        }
        extra=cuota*extra;
     long pago=cuota+extra;
        if (pago==0) {
            System.out.println("Hola "+nombre+"! La mensualidad de los niños al gimnasio es gratuita, y como ademas no has asistido a ninguna clase extra no tendras que pagar nada por la mensualidad");
        } else {
            System.out.println("Hola "+nombre+"!");
            System.out.println("Tu cuota mensual a pagar por el gimnasio sera de "+pago);
            System.out.println("***Desglose de la cuota***");
            System.out.println("Precio Base: "+cuota);
            System.out.println("Cantidad de clases extras asistidas: "+extra+" por "+contador+" clases que has asistido"); 
        }
        
    }
    //El extra por algun motivo que desconozco no lo calcula y siempre da 0,
    //he probado en pasarlo todo a long para que opere bien con los decimales,
    //luego he destripado todo paso a paso y con un sout para que me diga que esta haciendo y nada no hace ni el primer paso del destripe siempre da 0.
    //Lo siguiente que iba a probar es hacer un for y que me calcule el porcentaje en base a las vueltas que seria contador, sumando 0.05 cada vuelta,
    //pero no tengo tiempo de comprobar si eso funciona ya que tengo que hacer las demas actividades
}
