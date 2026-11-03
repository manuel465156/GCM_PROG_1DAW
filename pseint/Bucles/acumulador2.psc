Algoritmo acumulador2
	Definir num1, num2, acumulador como Entero
	acumulador<-1
	Para num2<-1 Hasta 5  Con Paso 1 Hacer
		Escribir "Dime un numero: "
		Leer num1
		Si (num1%2)<>0 Entonces
			acumulador<-acumulador*num1
		FinSi
		Escribir "Tienes un total de " num2 " numeros"
	FinPara
	Escribir "La multiplicacio de todos los numeros impares da: " acumulador
FinAlgoritmo
