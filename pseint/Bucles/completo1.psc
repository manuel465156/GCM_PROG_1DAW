Algoritmo completo1
	Definir num, contador, total, npar, nimpar, nmayor, nmenor, nnegativo Como Entero
	contador<-0
	num<-1
	total<-0
	npar<-0
	nimpar<-0
	nmayor<-0
	nmenor<-9999
	nnegativo<-0
	Repetir
		Escribir "Dime un numero: "
		Leer num
		total<-total+num
		contador<-contador+1
		Si (num%2=0) Entonces
			npar<-npar+1
		SiNo
			Si num<nmenor Entonces
				nmenor<-num
			FinSi
		FinSi
		Si num<0 Entonces
			nnegativo<-nnegativo+1
		FinSi
		Si num>nmayor Entonces
			nmayor<-num
		FinSi
	Hasta Que (num=0 o contador=10)
	Escribir "La suma de todos los numeros es: " total
	Escribir "La cantidad de numeros pares son: " npar
	Escribir "La cantidad de numeros negativos son: " nnegativo
	Escribir "El numero mayor es: " nmayor
	Escribir "El numero impar más pequeño es: " nmenor
FinAlgoritmo
