Algoritmo contador_acumulador
	Definir i, entradas, venta, diponible Como Entero
	disponible<-100
	venta<-0
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir "Cuantas entradas vas a comprar: "
		Leer entradas
		Si (entradas>=0 y entradas<=5 ) Entonces
			disponible<-disponible-entradas
			venta<-venta+1
		SiNo
			Escribir "Has introducio un numero erroneo de entradas"
		FinSi
	FinPara
	Escribir "Se han realizado " venta " correctamente."
	Escribir "Quedan " disponible " entradas disponibles" 
FinAlgoritmo
