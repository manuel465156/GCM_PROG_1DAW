Algoritmo condicional3
	Definir num1, num2, num3 Como Entero
	Escribir "Dime tres numeros"
	Leer num1, num2, num3
	Si ((num1=num2) y (num2=num3)) Entonces
		Escribir "Los numeros deben de ser diferentes"
	SiNo
		Si (num1>num2 y num1>num3) Entonces
			Escribir "El numero mayor de " num1 ", " num2 " y " num3 " es: " num1
		SiNo
			Si (num2>num3) Entonces
				Escribir "El numero mayor de " num1 ", " num2 " y " num3 " es: " num2
			SiNo
				Escribir "El numero mayor de " num1 ", " num2 " y " num3 " es: " num3
			FinSi
		FinSi
	FinSi
FinAlgoritmo