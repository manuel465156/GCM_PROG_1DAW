Algoritmo completo5
	Definir num Como Entero
	Definir esPrimo Como Logico
	Escribir "Introduce un número: "
    Leer num
    Si num < 2 Entonces
        esPrimo <- Falso
    SiNo
        esPrimo <- Verdadero
    FinSi
    Para i<-2 Hasta num-1 Hacer
        Si num%i=0 Entonces
            esPrimo <- Falso
        FinSi
    FinPara
    Escribir "¿El " num " es primo? "  esPrimo
FinAlgoritmo
