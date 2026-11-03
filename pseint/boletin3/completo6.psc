Algoritmo completo6
	Definir intento, num, contador Como Entero
	num<-Aleatorio(1,50)
	contador<-0
	intento=0
Repetir 
	contado<-contado+1
	Escribir "Intenta adivinarlo: "
	Escribir num
	Leer intento
	Si intento>num Entonces
		Escribir "Muy alto"
	SiNo
		Si intento<num Entonces
			Escribir "Muy bajo"
		SiNo
			Si num<>intento Entonces
				Escribir "Suerte la proxima vez"
			SiNo
				Escribir "Lo has adivinado"
			FinSi
		FinSi
	FinSi
Hasta Que 	(intento=num) o (contado=6)
FinAlgoritmo