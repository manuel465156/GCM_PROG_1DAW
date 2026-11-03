Algoritmo secuencial9
	Definir num1, num2, num3 Como Entero
	Escribir "Dime tres numeros: "
	Leer num1, num2, num3
	Si (num1+num2=num3) Entonces
		Escribir "La suma de " num1 " + " num2 " es igual a " num3
	SiNo
		Si (num2+num3=num1) Entonces
			Escribir "La suma de " num2 " + " num3 " es igual a " num1
		SiNo
			Si (num3+num1=num2) Entonces
				Escribir "La suma de " num3 " + " num1 " es igual a " num2
			FinSi
		FinSi
	FinSi
FinAlgoritmo
