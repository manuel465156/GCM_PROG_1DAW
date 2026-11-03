Algoritmo conta_acum_max
	Definir i, acumulador, contador, maximo, num Como Entero
	acumulador<-0
	contador<-0
	maximo<- -99999
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "Dime un numero: "
		Leer num
		Si num%2=0 Entonces
			acumulador<-acumulador+num
		SiNo
			contador<-contador+1
		FinSi
		Si num<0 Entonces
			Si num>maximo Entonces
				maximo<-num
			FinSi
		FinSi
	FinPara
	Escribir "La suma de todos los pares son: " acumulador
	Escribir "La cantidad total de los impares son: " contador
	Escribir "El numero mayor de todos los negativos es: " maximo
FinAlgoritmo
