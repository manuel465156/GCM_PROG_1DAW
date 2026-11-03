Algoritmo completo2
	Definir personas, disponible Como Entero
	disponible<-25
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir "Dime cuantas personas van ha entrar en esta tanda: "
		Leer personas
		disponible<-disponible-personas
		Si !(disponible<0) Entonces
			Escribir "Quedan " disponible " plazas disponibles"
		SiNo
			Escribir "Has superado el numero de plazas"
		FinSi
		Si (disponible=0) Entonces
			Escribir "Aforo completo"
		FinSi
	FinPara
FinAlgoritmo
