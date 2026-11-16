Algoritmo bandera_acum
	Definir num, acumulador Como Entero
	Definir respueta Como Caracter
	respueta<-"S"
	Mientras respueta="S" Hacer
		Escribir "Dime un numero: "
		Leer num
		Si (num%5)<>0 Entonces
			acumulador<-acumulador+num
		FinSi
		Escribir "¿Quieres seguir metiendo numeros S/N?"
		Leer respueta
	FinMientras
	Escribir "La suma de los numeros que no son multiplos de 5 es: " acumulador
FinAlgoritmo