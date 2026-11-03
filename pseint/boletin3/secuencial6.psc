Algoritmo secuencial6
	Definir num1 Como entero
	Definir rest Como Real
	Escribir "Dime un entre 0 y 9999"
	Leer num1
	Si ((num1>0) y (num1<9999)) Entonces
	rest <- Ln(num1)/Ln(10)
		Escribir rest
	SiNo
		Escribir "Debes poner un numero entre este rango 0 y 9999"
	FinSi

FinAlgoritmo