Algoritmo contador2
	Definir num1, num2, i como Entero
	Para num2<-1 Hasta 5  Con Paso 1 Hacer
		Escribir "Dime un numero: "
		Leer num1
		Si (num1%3)=0 Entonces
			i<-i+1
		FinSi
	FinPara
	Escribir "Tienes " i " numeros multiplos de 3"
FinAlgoritmo
