/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Apuntes;

import java.util.Scanner;

/**
 * ============================================================================
 * GUÍA DE REFERENCIA: FUNCIONES Y MÉTODOS ESTÁTICOS EN JAVA
 * Módulo: Programación (1º DAW / 1º DAM)
 * ============================================================================
 * 
 * NOTA DE CONTEXTO (PRE-ORIENTACIÓN A OBJETOS):
 * En este bloque del curso trabajamos con funciones estáticas (`public static`).
 * - `public`: Indica que la función es accesible desde cualquier parte del programa.
 * - `static`: Permite llamar a la función directamente desde el método `main` sin
 *   necesidad de instanciar objetos en memoria (concepto que se tratará en el bloque POO).
 * 
 * SINTAXIS GENERAL DE UNA FUNCIÓN EN JAVA:
 * [modificadores] <tipo_de_retorno> <nombreFuncion>(<tipo1> <param1>, <tipo2> <param2>...) {
 *     // Cuerpo de la función
 *     return <valor>; // Obligatorio si el tipo de retorno NO es 'void'
 * }
 */
public class PruebaFunciones {

    public static void main(String[] args) {

        System.out.println("=== 1. FUNCIONES SIN RETORNO (void) ===");
        mostrarMensajeBienvenida();
        imprimirFichaUsuario("Lucía", 19);

        System.out.println("\n=== 2. FUNCIONES CON RETORNO DE VALOR ===");
        int resultadoSuma = sumar(8, 12);
        System.out.println("Resultado de sumar(8, 12): " + resultadoSuma);

        boolean esPar = esNumeroPar(7);
        System.out.println("¿Es par el número 7?: " + esPar);

        System.out.println("\n=== 3. LÓGICA PROGRESIVA Y CONTROL DE FLUJO ===");
        double precioConDescuento = calcularPrecioFinal(120.0, 15.0);
        System.out.println("Precio final (120€ con 15% desc.): " + precioConDescuento + "€");

        int mayor = obtenerMayorDeTres(14, 29, 8);
        System.out.println("El número mayor entre 14, 29 y 8 es: " + mayor);

        System.out.println("\n=== 4. MALAS PRÁCTICAS Y PASO POR VALOR ===");
        int numeroOriginal = 50;
        System.out.println("Valor de 'numeroOriginal' ANTES de la función: " + numeroOriginal);
        
        // Se pasa la variable como parámetro
        intentarModificarParametro(numeroOriginal);
        
        System.out.println("Valor de 'numeroOriginal' DESPUÉS de la función: " + numeroOriginal);
        System.out.println("-> NOTA: En Java los tipos primitivos SIEMPRE se pasan por VALOR (copia).");


        /* ====================================================================
         * CASOS DE ERROR COMUNES AL LLAMAR A FUNCIONES (DESCOMENTAR PRODUCE ERROR)
         * ==================================================================== */

        // ERROR DE LLAMADA 1: Intentar asignar el resultado de una función void.
        // int x = mostrarMensajeBienvenida();
        // EXPLICACIÓN: 'mostrarMensajeBienvenida()' devuelve 'void' (nada). No se puede guardar en una variable.

        // ERROR DE LLAMADA 2: Incompatibilidad de tipos en los argumentos.
        // int res = sumar("10", 5);
        // EXPLICACIÓN: El primer argumento esperado es 'int', pero se pasó un 'String'. Java es de tipado fuerte.

        // ERROR DE LLAMADA 3: Número incorrecto de argumentos.
        // int res2 = sumar(10);
        // EXPLICACIÓN: La función 'sumar' requiere exactamente dos parámetros 'int', no uno.
    }


    // ========================================================================
    // BLOQUE 1: FUNCIONES SIN RETORNO (void)
    // ========================================================================

    /**
     * Función trivial sin parámetros ni retorno.
     * Se usa para ejecutar acciones secundarias (mostrar datos por consola, guardar archivos, etc.).
     */
    public static void mostrarMensajeBienvenida() {
        System.out.println("----------------------------------------");
        System.out.println(" Bienvenido al módulo de Programación  ");
        System.out.println("----------------------------------------");
    }

    /**
     * Función void con parámetros de entrada.
     * @param nombre Cadena con el nombre de la persona
     * @param edad   Entero con la edad
     */
    public static void imprimirFichaUsuario(String nombre, int edad) {
        System.out.println("Ficha del Alumno -> Nombre: " + nombre + " | Edad: " + edad);
    }


    // ========================================================================
    // BLOQUE 2: FUNCIONES CON RETORNO DE VALOR
    // ========================================================================

    /**
     * Recibe dos enteros y devuelve la suma.
     * El tipo devuelto ('int') debe coincidir con la cabecera.
     */
    public static int sumar(int num1, int num2) {
        return num1 + num2; // 'return' finaliza la función y devuelve el valor al punto de llamada.
    }

    /**
     * Evalúa una condición y retorna un valor booleano (true/false).
     */
    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }


    // ========================================================================
    // BLOQUE 3: DIFICULTAD PROGRESIVA (VALIDACIÓN Y FLUJOS MÚLTIPLES)
    // ========================================================================

    /**
     * Aplica un porcentaje de descuento a un precio base.
     * Incluye control de errores con valor centinela (-1.0).
     */
    public static double calcularPrecioFinal(double precioBase, double porcentajeDescuento) {
        // Validar datos de entrada erróneos
        if (precioBase < 0 || porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            System.out.println("Error: El precio o el porcentaje introducido no es válido.");
            return -1.0; // Devuelve -1 para indicar al programa principal que hubo un error.
        }

        double descuento = precioBase * (porcentajeDescuento / 100.0);
        return precioBase - descuento;
    }

    /**
     * Determina cuál es el mayor de 3 números dados utilizando salidas tempranas (early return).
     */
    public static int obtenerMayorDeTres(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= c) {
            return b;
        }
        return c;
    }


    // ========================================================================
    // BLOQUE 4: DEMOSTRACIÓN DE MALAS PRÁCTICAS Y PASO POR VALOR
    // ========================================================================

    /**
     * MALA PRÁCTICA DE PRINCIPIANTE 1: Intentar "modificar" la variable externa 
     * reasignando el parámetro de entrada.
     * 
     * EXPLICACIÓN TÉCNICA:
     * En Java los tipos primitivos (int, double, boolean...) se pasan por VALOR.
     * La variable 'valor' es una copia local independiente. Reasignarla no afecta 
     * en absoluto a la variable declarada en 'main'.
     */
    public static void intentarModificarParametro(int valor) {
        System.out.println("   [Interior función] Valor inicial del parámetro: " + valor);
        
        valor = 9999; // MALA PRÁCTICA: Reasignar el parámetro de entrada crea confusión.
        
        System.out.println("   [Interior función] Valor tras la reasignación: " + valor);
    }

    /**
     * BUENA PRÁCTICA: Si se desea obtener un nuevo valor transformado, la función
     * debe retribuirlo formalmente mediante la instrucción 'return'.
     */
    public static int incrementarCorrectamente(int valorOriginal) {
        return valorOriginal + 1;
    }


    // ========================================================================
    // BLOQUE 5: CASOS DE ERRORES DE SINTAXIS Y COMPILACIÓN EN FUNCIONES
    // (Código comentado para evitar que el proyecto no compile)
    // ========================================================================

    /*
    // ERROR 1: Faltar la sentencia 'return' en una función no-void.
    public static int funcionSinReturn(int n) {
        int doble = n * 2;
        // COMPILADOR DA ERROR: "missing return statement"
    }
    */

    /*
    // ERROR 2: Incompatibilidad entre el tipo declarado y el tipo retornado.
    public static int tipoRetornoIncorrecto() {
        return "Hola Mundo"; 
        // COMPILADOR DA ERROR: "incompatible types: java.lang.String cannot be converted to int"
    }
    */

    /*
    // ERROR 3: Retornos incompletos (Ramas de control sin 'return').
    public static String evaluarCalificacion(int nota) {
        if (nota >= 5) {
            return "Aprobado";
        }
        // COMPILADOR DA ERROR: "missing return statement"
        // Explicación: Si 'nota' es menor que 5, la función no sabe qué devolver.
    }
    */

    /*
    // ERROR 4: Código inalcanzable (Unreachable Code).
    public static double ejemploCodigoInalcanzable() {
        return 3.14;
        System.out.println("Este mensaje jamás llegará a ejecutarse");
        // COMPILADOR DA ERROR: "unreachable statement"
    }
    */

    /*
    // ERROR 5: Devolver un valor en una función de tipo 'void'.
    public static void funcionVoidRetornandoValor() {
        System.out.println("Ejecutando proceso...");
        return 100;
        // COMPILADOR DA ERROR: "cannot return a value from a method with void result type"
    }
    */

    /*
    // ERROR 6: Violación de ámbito (Scope) de variables locales.
    public static void funcionA() {
        int contadorLocal = 10;
    }

    public static void funcionB() {
        // System.out.println(contadorLocal);
        // COMPILADOR DA ERROR: "cannot find symbol: variable contadorLocal"
        // Explicación: Las variables creadas dentro de una función mueren al terminar esa función.
    }
    */
}
    
   
