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
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el numero total de plantas de bloque: ");
        int planta=sc.nextInt();
        int puerta=0;
        int necesario=0, totalhab=0, maxtemp=Integer.MIN_VALUE,plantapresi=0, puertapresi=0;
        boolean presidente=false;
        while(puerta<1 || puerta>4){
        System.out.print("Introduce el numero puertas por planta (1 a 4): ");
        puerta=sc.nextInt();
            if (puerta<1 || puerta>4) {
                System.out.println("Error: El numero de pisos por planta debe estar entre 1 y 4");
            }
        }
        for (int i = 0; i < planta; i++) {
            System.out.println("---REVISION DE PLANTA--- " + i);
            System.out.println("¿Hay extintor en Planta "+i+"? (S/N)");
            String hayExtintor=sc.next();
            if (hayExtintor.equalsIgnoreCase("S")) {
                System.out.println("¿Esta caducado el extintor¿ (S/N)");
                String caducado=sc.next();
                if (caducado.equalsIgnoreCase("S")) {
                    necesario=necesario+1;
                }
            } else {
                necesario=necesario+1;
            }
            for (int j = 1; j <= puerta; j++) {
                System.out.println("> Planta " +i+" - Puerta " + j);
                System.out.print("Numero total de habitantes: ");
                int habitantes=sc.nextInt();
                totalhab=totalhab+habitantes;
                System.out.print("Numero total de niños: ");
                int niños=sc.nextInt();
                if (niños>maxtemp) {
                    maxtemp=i;
                }
                if (presidente==false) {
                    System.out.println("¿Aqui vive el presidente de la comunidad? (S/N)");
                    String vive=sc.next();
                    if (vive.equalsIgnoreCase("S")) {
                        presidente=true;
                        plantapresi=i;
                        puertapresi=j;
                    }
                }        
            }
        }
        System.out.println("INFORME DE SEGURIDAD DEL BLOQUE");
        System.out.println("=========================================");
        System.out.println("Numeros de extintores necesarios:" + necesario);
        System.out.println("Vivienda del presidente de la comunidad: Planta " + plantapresi + " piso " + puertapresi);
        //Poner sout con las planta 0 hasta planta $planta con sus numeros de $habitantes
        System.out.println("Numero total de habitantes del bloque: " + totalhab + " habitantes");
        System.out.println("Planta donde viven mas niños: Planta " + maxtemp);
    }
    //Me ha faltado por hacer que planta 0 diga planta baja
    //Tambien me ha faltado hacer el apartado intermedio de numero total de habitantes y donde viven más niños.
    //La verdad que ahora mismo ni se me ocurre el como hacerlo
    //Lo que intentaria si tuviera tiempo seria dentro del for de plantas que tenga un registro de la i y del numero de habitantes
    //Se que habra maneras mas rapidas y menos liosa de hacerlo pero la unica manera que se me llega a ocurrir es esa
}
