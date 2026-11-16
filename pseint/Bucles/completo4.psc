Algoritmo completo4
	Definir contador, acumulador Como Entero
	contador<-0
	acumulador<-0
	Para i<-2 Hasta 30 Con Paso 2 Hacer
		Si (i<10 o i>20) Entonces
			Escribir i
			contador<-contador+1
			acumulador<-acumulador+i
		FinSi
	FinPara
	Escribir "Hay un total de " contador " numeros."
	Escribir "La suma de todos ellos es " acumulador
FinAlgoritmo
