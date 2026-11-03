Algoritmo condicional6
	Definir numEntradas Como Entero
	Definir precio, pagar Como Real
	Escribir "Dime cuantas entradas has comprado y cual es el precio"
	Leer numEntradas, precio
	Si numEntradas=4 Entonces
		precio<-precio*4
		pagar<-precio-(precio*0.20)
		Escribir "Tienes que pagar un total de " pagar
	SiNo
		Si numEntradas=3 Entonces
			precio<-precio*3
			pagar<-precio-(precio*0.15)
			Escribir "Tienes que pagar un total de " pagar
		SiNo
			Si numEntradas=2 Entonces
				precio<-precio*2
				pagar<-precio-(precio*0.10)
				Escribir "Tienes que pagar un total de " pagar	
			SiNo
				Escribir "Tienes que pagar un total de " precio	 
			FinSi
		FinSi
	FinSi
FinAlgoritmo
