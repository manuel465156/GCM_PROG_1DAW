Algoritmo completo3
	Definir num, total, Parmayor, contador, impartotal, mediaImpar Como Real
	Definir multi3 Como Lógico
	num <- 0
	total <- 0
	Parmayor <- 0
	contador <- 0
	impartotal <- 0
	multi3 <- Falso
	Mientras num>=0 Hacer
		Escribir 'Dime un numero: '
		Leer num
		total <- total+1
		Si (num%2=0) Entonces
			Si num>Parmayor Entonces
				Parmayor <- num
			FinSi
		SiNo
			impartotal <- impartotal+num
			contador <- contador+1
		FinSi
		Si (num%3=0) Entonces
			multi3 <- Verdadero
		FinSi
	FinMientras
	mediaImpar <- impartotal/contador
	Escribir 'Se ha introducido un total de ', total, ' numeros'
	Escribir 'La media de los numeros impares es: ', mediaImpar
	Escribir 'El mayor de los pares es: ', Parmayor
	Escribir '¿Hay algun multiplo de 3? ', multi3
FinAlgoritmo
