Algoritmo acumulador1
	Definir num1, num2, acumulador como Entero
	acumulador<-0
	Para num2<-1 Hasta 3  Con Paso 1 Hacer
		Escribir "Dime un numero: "
		Leer num1
		Escribir "Tienes un total de " num2 " numeros"
		acumulador<-acumulador+num1
	FinPara
	Escribir "La suma total es: " acumulador
FinAlgoritmo