Algoritmo Ejercicio2_Examen
	Definir nombre, mayordonante Como Caracter
	Definir edad, donantes, objetivo, bote, donacion, mayordonacion, mayoredad, menoredad Como Entero
	objetivo<-50000
	donantes<-1
	bote<-0
	mayordonacion<-0
	mayoredad<-0
	menoredad<-99999
	Repetir
		Escribir "=== DONACIÓN Nº " donantes " ==="
		donantes<-donantes+1
		Escribir "Introduce el nombre del donante: "
		Leer nombre
		Escribir "Introduce la edad del donante: "
		Leer edad
		Repetir
			Escribir "Introduce la cantidad a donar en ? (múltiplo de 10): "
			Leer donacion
			Si ((donacion%10<>0) o (donacion<=0)) Entonces
				Escribir "Error: La cantidad introducida no es válida. Debe ser mayor que 0 y múltiplo de 10."
			FinSi
		Hasta Que (donacion%10=0)
		bote<-bote+donacion
		Si donacion>mayordonacion Entonces
			mayordonacion<-donacion
			mayordonante<-nombre
		FinSi
		Si edad>mayoredad Entonces
			mayoredad<-edad
		FinSi
		Si edad<menoredad Entonces
			menoredad<-edad
		FinSi
	Hasta Que (donantes=11 o bote=50000) //Acordarme de cambiarlo a 11
	Escribir "========================================"
	Escribir "			RESUMEN DE LA GALA"
	Escribir "========================================"
	Escribir "Mayor aportación: " mayordonante " con " mayordonacion
	Escribir "Diferencia de edad entre donantes: " mayoredad-menoredad
	Escribir "Donante MIL: "
	Si bote>=50000 Entonces
		Escribir "¡Enhorabuena, objetivo conseguido! La gala ha recaudado " bote " con un total de " donantes " donaciones"
	SiNo
		Escribir "¡Objetivo no conseguido! Tras las 10 donaciones, la gala se ha quedado a " objetivo-bote " de conseguir el objetivo de 50000"
	FinSi
	Escribir "========================================"
FinAlgoritmo
//Preguntar nombre, edad, donacion y que sea multiplo de 10, terminar cuando tenga 10 donantes
// Mayor aportacion y su nombre, diferencia de edad, finalizar con bote=50000
//Si conseguido/No conseguido
//Me queda donante MIL, lo he intentado hacer un bucle con otra variable logica y cuando supere los 1000 guarde el nombre del donante, por ultimo hacer un Si y si la variable logica es Verdadera de el mensaje de donantemil con su nombre y si es falso que no hay nadie