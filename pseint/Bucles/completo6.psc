Algoritmo completo6
	Definir intento, num, contador Como Entero
	num<-Aleatorio(1,50)
	contador<-0
	intento=0
	Mientras intento<>num Hacer
		Mientras contado<7 Hacer
			contado<-contado+1
			Escribir num
			Escribir "Intenta adivinarlo: "
			Leer intento
		Si intento>num Entonces
			Escribir "Muy alto"
		SiNo
			Si intento<num Entonces
				Escribir "Muy bajo"
			FinSi
		FinSi
		FinMientras
	FinMientras
	Si num<>intento Entonces
		Escribir "Suerte la proxima vez"
	SiNo
		Escribir "Lo has adivinado"
	FinSi
FinAlgoritmo
//mientras () o ()