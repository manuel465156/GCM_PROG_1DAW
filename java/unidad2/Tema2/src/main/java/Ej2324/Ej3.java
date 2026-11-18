/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2324;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Pedidos Pitanza Feliz");
        System.out.print("Numero de hamburguesas basicas: ");
        int basico=sr.nextInt();
        System.out.print("Numero de hamburguesas gourmet: ");
        int gourmet=sr.nextInt();
        System.out.print("Dia de la semana: ");
        String dia=sr.next();
        System.out.print("¿Pertenece al club Fanegas? (s/n): ");
        String club=sr.next();
        double preciobasico=3, preciogourmet=5,resultadogourmet;;
        if (dia.equalsIgnoreCase("miercoles")) {
            preciobasico=2;
            resultadogourmet=preciogourmet*gourmet;
        } else if (dia.equalsIgnoreCase("martes") && gourmet>=2) {
            double oferta=9;
            gourmet=gourmet-2;
            resultadogourmet=preciogourmet*gourmet+oferta;
        }else   {
            resultadogourmet=preciogourmet*gourmet;
        }
        double resultadobasico=preciobasico*basico, resultado=resultadobasico+resultadogourmet;
        System.out.println("Hamburguesas basicas: " + basico);
        System.out.println("Hamburguesas gourmet: " + gourmet);
        System.out.println("Total: " + resultado);
        System.out.println("");
        System.out.println("Aqui tienes su pedido");
        descuento(club, resultado);
    }
    public static void descuento(String club, double resultado ){
        if (club.equals("s")) {
            double descuento=0.12*resultado;
            System.out.println("Descuento: " + descuento);
            double pagar=resultado-descuento;
            System.out.println("A pagar: " + pagar);
        } else {
            System.out.println("Descuento: " + 0);
            System.out.println("A pagar: " + resultado);
        }
    }
}
