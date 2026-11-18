package PrepEx;



// Librería de funciones matemáticas que trabaja solo con divisiones y módulos (sin String ni Math).
// Nota: Las posiciones de los dígitos se cuentan de izquierda a derecha empezando en 1.
public class FuncionesVarias {

    // =========================================================================
    // 1. COMPROBACIÓN DE PROPIEDADES NUMÉRICAS
    // =========================================================================

    public static boolean esCapicua(long x) {
        // Los números negativos no se consideran capicúas por el signo '-'
        if (x < 0) {
            return false;
        }
        // Si el número original es igual al número dado la vuelta, es capicúa
        long volteado = voltea(x);
        return x == volteado;
    }

    // Sobrecarga para int: reutilizamos la lógica del metodo long
    public static boolean esCapicua(int x) {
        return esCapicua((long) x);
    }

    public static boolean esPrimo(long x) {
        // El 1, el 0 y los negativos nunca son primos
        if (x <= 1) {
            return false;
        }
        // Solo hace falta buscar divisores hasta la raíz cuadrada de x (i * i <= x)
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false; // En cuanto encontramos un divisor exacto, ya no es primo
            }
        }
        return true;
    }

    public static boolean esPrimo(int x) {
        return esPrimo((long) x);
    }

    public static int siguientePrimo(int x) {
        // Empezamos a probar desde el número inmediatamente superior
        int candidato = x + 1;
        while (!esPrimo(candidato)) {
            candidato++;
        }
        return candidato;
    }

    public static long siguientePrimo(long x) {
        long candidato = x + 1;
        while (!esPrimo(candidato)) {
            candidato++;
        }
        return candidato;
    }

    public static int primoCercano(int x, boolean anterior) {
        // Si anterior es falso, devolvemos directamente el siguiente primo
        if (!anterior) {
            return siguientePrimo(x);
        }
        // Si anterior es verdadero, vamos restando 1 hasta dar con el primer primo
        int candidato = x - 1;
        while (candidato >= 2) {
            if (esPrimo(candidato)) {
                return candidato;
            }
            candidato--;
        }
        // Si x era 2 o menor, no existe ningún primo por debajo
        return -1;
    }

    public static long primoCercano(long x, boolean anterior) {
        if (!anterior) {
            return siguientePrimo(x);
        }
        long candidato = x - 1;
        while (candidato >= 2) {
            if (esPrimo(candidato)) {
                return candidato;
            }
            candidato--;
        }
        return -1;
    }

    // =========================================================================
    // 2. OPERACIONES MATEMÁTICAS BÁSICAS
    // =========================================================================

    public static double potencia(int base, int exponente) {
        // Cualquier número elevado a 0 siempre da 1
        if (exponente == 0) {
            return 1;
        }
        double total = 1;
        // Convertimos el exponente a positivo para poder dar tantas vueltas como indique
        int expPositivo = exponente < 0 ? -exponente : exponente;

        for (int i = 1; i <= expPositivo; i++) {
            total *= base;
        }

        // Si el exponente original era negativo, invertimos el resultado (1 / potencia)
        return exponente < 0 ? (1.0 / total) : total;
    }

    public static double potencia(long base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        double total = 1;
        int expPositivo = exponente < 0 ? -exponente : exponente;

        for (int i = 1; i <= expPositivo; i++) {
            total *= base;
        }

        return exponente < 0 ? (1.0 / total) : total;
    }

    // =========================================================================
    // 3. MANIPULACIÓN DE DÍGITOS (ÍNDICES DESDE 1)
    // =========================================================================

    public static int digitos(long x) {
        int contador = 0;
        // Usamos do-while para que si x es 0, al menos entre una vez y cuente 1 dígito
        do {
            contador++;
            x /= 10; // Quitamos la última cifra en cada vuelta
        } while (x != 0);
        return contador;
    }

    public static int digitos(int x) {
        return digitos((long) x);
    }

    public static long voltea(long x) {
        long invertido = 0;
        while (x != 0) {
            // x % 10 saca el último dígito y lo vamos empujando a la izquierda multiplicando por 10
            invertido = invertido * 10 + x % 10;
            x /= 10;
        }
        return invertido;
    }

    public static int voltea(int x) {
        return (int) voltea((long) x);
    }

    public static int digitoN(long x, int n) {
        // Trabajamos en positivo para evitar que el resto (%) nos dé cifras negativas
        long num = x < 0 ? -x : x;
        int total = digitos(num);

        // Si nos piden una posición que no existe, devolvemos -1
        if (n < 1 || n > total) {
            return -1;
        }
        // Dividimos para dejar el dígito buscado al final y usamos % 10 para aislarlo
        long divisor = potenciaDeDiez(total - n);
        return (int) ((num / divisor) % 10);
    }

    public static int digitoN(int x, int n) {
        return digitoN((long) x, n);
    }

    public static int posicionDeDigito(long x, int d) {
        // Si no es un dígito válido (de 0 a 9), no puede estar en el número
        if (d < 0 || d > 9) {
            return -1;
        }
        long num = x < 0 ? -x : x;
        int encontrada = -1;
        int posicion = digitos(num);

        // Recorremos el número de derecha a izquierda; al no hacer break,
        // nos quedaremos con la posición más a la izquierda (la primera aparición)
        while (posicion >= 1) {
            if (num % 10 == d) {
                encontrada = posicion;
            }
            num /= 10;
            posicion--;
        }
        return encontrada;
    }

    public static int posicionDeDigito(int x, int d) {
        return posicionDeDigito((long) x, d);
    }

    // =========================================================================
    // 4. MODIFICACIÓN DE NÚMEROS
    // =========================================================================

    public static long quitaPorDetras(long x) {
        // Dividir entre 10 en enteros descarta automáticamente la última cifra
        return x / 10;
    }

    public static int quitaPorDetras(int x) {
        return x / 10;
    }

    public static long quitaPorDetras(long x, int n) {
        if (n <= 0) {
            return x;
        }
        // Dividir entre 10^n elimina n cifras de golpe por la derecha
        return x / potenciaDeDiez(n);
    }

    public static int quitaPorDetras(int x, int n) {
        return (int) quitaPorDetras((long) x, n);
    }

    public static long quitaPorDelante(long x) {
        return quitaPorDelante(x, 1);
    }

    public static int quitaPorDelante(int x) {
        return (int) quitaPorDelante((long) x, 1);
    }

    public static long quitaPorDelante(long x, int n) {
        if (n <= 0) {
            return x;
        }
        int total = digitos(x);
        // Si quitamos tantos dígitos o más de los que tiene el número, queda 0
        if (n >= total) {
            return 0;
        }
        // El resto de dividir entre 10^(total - n) nos deja exactamente las cifras de la derecha
        return x % potenciaDeDiez(total - n);
    }

    public static int quitaPorDelante(int x, int n) {
        return (int) quitaPorDelante((long) x, n);
    }

    public static long pegaPorDetras(long x, int d) {
        // Hacemos hueco a la derecha multiplicando por 10 y sumamos (o restamos si es negativo) el dígito
        if (x < 0) {
            return x * 10 - d;
        }
        return x * 10 + d;
    }

    public static int pegaPorDetras(int x, int d) {
        return (int) pegaPorDetras((long) x, d);
    }

    public static long pegaPorDelante(long x, int d) {
        // Colocamos el dígito nuevo en su posición multiplicándolo por 10^cifrasDeX y le sumamos x
        if (x < 0) {
            return -(d * potenciaDeDiez(digitos(x)) + (-x));
        }
        return d * potenciaDeDiez(digitos(x)) + x;
    }

    public static int pegaPorDelante(int x, int d) {
        return (int) pegaPorDelante((long) x, d);
    }

    public static long trozoDeNumero(long x, int inicio, int fin) {
        int total = digitos(x);
        // Comprobamos que las posiciones tengan sentido dentro del tamaño del número
        if (x < 0 || inicio < 1 || inicio > fin || fin > total) {
            return -1;
        }
        // Primero recortamos lo que sobra por la izquierda y luego lo que sobra por la derecha
        long sinDelante = quitaPorDelante(x, inicio - 1);
        return quitaPorDetras(sinDelante, total - fin);
    }

    public static int trozoDeNumero(int x, int inicio, int fin) {
        return (int) trozoDeNumero((long) x, inicio, fin);
    }

    public static long juntaNumeros(long x, long y) {
        long absY = y < 0 ? -y : y;
        int total = digitos(absY);
        // Desplazamos x a la izquierda tantos huecos como cifras tenga y, y luego encajamos y
        long desplazado = x * potenciaDeDiez(total);
        return x < 0 ? desplazado - absY : desplazado + absY;
    }

    public static int juntaNumeros(int x, int y) {
        return (int) juntaNumeros((long) x, (long) y);
    }

    // =========================================================================
    // METODO AUXILIAR PRIVADO
    // =========================================================================

    // Calcula 10^exponente devolviendo un long para evitar que se desborde un int con números grandes
    private static long potenciaDeDiez(int exponente) {
        long total = 1L;
        for (int i = 1; i <= exponente; i++) {
            total *= 10L;
        }
        return total;
    }

    public static void main(String[] args) {

        // =========================================================================
        // 1. PRUEBAS DE PROPIEDADES NUMÉRICAS
        // =========================================================================
        System.out.println("=== 1. PROPIEDADES NUMÉRICAS ===");

        // Comprobamos capicúas con int, long y un número negativo
        System.out.println("¿Es 12321 capicúa? (int): " + FuncionesVarias.esCapicua(12321));
        System.out.println("¿Es 12345654321L capicúa? (long): " + FuncionesVarias.esCapicua(12345654321L));
        System.out.println("¿Es -121 capicúa?: " + FuncionesVarias.esCapicua(-121));

        // Comprobamos números primos
        System.out.println("¿Es 17 primo? (int): " + FuncionesVarias.esPrimo(17));
        System.out.println("¿Es 20 primo? (int): " + FuncionesVarias.esPrimo(20));
        System.out.println("¿Es 1000000007L primo? (long): " + FuncionesVarias.esPrimo(1000000007L));

        // Siguiente primo
        System.out.println("Siguiente primo después de 14: " + FuncionesVarias.siguientePrimo(14));
        System.out.println("Siguiente primo después de 23: " + FuncionesVarias.siguientePrimo(23));

        // Primo cercano (true = anterior, false = siguiente)
        System.out.println("Primo anterior a 20: " + FuncionesVarias.primoCercano(20, true));
        System.out.println("Primo siguiente a 20: " + FuncionesVarias.primoCercano(20, false));
        System.out.println("Primo anterior a 2 (no existe): " + FuncionesVarias.primoCercano(2, true));

        // =========================================================================
        // 2. PRUEBAS DE OPERACIONES MATEMÁTICAS BÁSICAS
        // =========================================================================
        System.out.println("\n=== 2. OPERACIONES BÁSICAS ===");

        // Potencias con exponente positivo, cero y negativo
        System.out.println("2 elevado a 5: " + FuncionesVarias.potencia(2, 5));
        System.out.println("5 elevado a 0: " + FuncionesVarias.potencia(5, 0));
        System.out.println("2 elevado a -2: " + FuncionesVarias.potencia(2, -2));

        // =========================================================================
        // 3. PRUEBAS DE MANIPULACIÓN DE DÍGITOS (POSICIONES DESDE 1)
        // =========================================================================
        System.out.println("\n=== 3. MANIPULACIÓN DE DÍGITOS ===");

        // Contar dígitos (probando también el 0 y un long)
        System.out.println("Dígitos de 54321: " + FuncionesVarias.digitos(54321));
        System.out.println("Dígitos de 0: " + FuncionesVarias.digitos(0));
        System.out.println("Dígitos de 9876543210L: " + FuncionesVarias.digitos(9876543210L));

        // Voltear números
        System.out.println("12345 volteado: " + FuncionesVarias.voltea(12345));
        System.out.println("-9876 volteado: " + FuncionesVarias.voltea(-9876));

        // Obtener el dígito en una posición concreta (empezando en 1 por la izquierda)
        System.out.println("Dígito en posición 1 de 7894: " + FuncionesVarias.digitoN(7894, 1));
        System.out.println("Dígito en posición 3 de 7894: " + FuncionesVarias.digitoN(7894, 3));
        System.out.println("Dígito en posición 9 de 7894 (fuera de rango): " + FuncionesVarias.digitoN(7894, 9));

        // Buscar la primera posición de un dígito
        System.out.println("Posición del 5 en 45852 (debe dar la primera, 2): " + FuncionesVarias.posicionDeDigito(45852, 5));
        System.out.println("Posición del 9 en 45852 (no está): " + FuncionesVarias.posicionDeDigito(45852, 9));

        // =========================================================================
        // 4. PRUEBAS DE MODIFICACIÓN DE NÚMEROS
        // =========================================================================
        System.out.println("\n=== 4. MODIFICACIÓN DE NÚMEROS ===");

        // Quitar dígitos por detrás (derecha)
        System.out.println("Quitar 1 dígito por detrás a 4567: " + FuncionesVarias.quitaPorDetras(4567));
        System.out.println("Quitar 2 dígitos por detrás a 4567: " + FuncionesVarias.quitaPorDetras(4567, 2));

        // Quitar dígitos por delante (izquierda), probando un número con ceros intermedios
        System.out.println("Quitar 1 dígito por delante a 4567: " + FuncionesVarias.quitaPorDelante(4567));
        System.out.println("Quitar 2 dígitos por delante a 1025 (conserva el 25): " + FuncionesVarias.quitaPorDelante(1025, 2));

        // Pegar dígitos por detrás y por delante
        System.out.println("Pegar un 9 por detrás a 123: " + FuncionesVarias.pegaPorDetras(123, 9));
        System.out.println("Pegar un 8 por delante a 123: " + FuncionesVarias.pegaPorDelante(123, 8));

        // Extraer un trozo del número entre dos posiciones (ambas incluidas, desde 1)
        System.out.println("Trozo de 123456 entre posición 2 y 4: " + FuncionesVarias.trozoDeNumero(123456, 2, 4));
        System.out.println("Trozo de 123456 con posiciones mal puestas: " + FuncionesVarias.trozoDeNumero(123456, 5, 2));

        // Juntar dos números en uno solo (probando int y long)
        System.out.println("Juntar 123 y 456 (int): " + FuncionesVarias.juntaNumeros(123, 456));
        System.out.println("Juntar 123456L y 789012L (long): " + FuncionesVarias.juntaNumeros(123456L, 789012L));
    }
}