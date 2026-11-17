package matematicas;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class FuncionesVarias {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("Dime un numero");
        int num=sr.nextInt();
        boolean capicua=esCapicua(num);
        System.out.println(capicua);
    }
    public static boolean esCapicua(int n){
        int cifras=contadig(n);
        int mitad=cifras/2, divisor=1;
        for (int i =1; i <= cifras; i++) {
            divisor*=10;
        }        
        int n2=0, n1=n;
        while (n>0) {
            int dig=n%10;
            n2=n2*10+dig;
            n=n/10;
        }
        if (n1==n2) {
            return true;
        } else {
            return false;
        }
    }

    public static int contadig(int num) {
        int contador=0;
        while (num > 0) {
            contador++;
            num = num / 10;                
        }
        return contador;
    }
}
