Algoritmo condicional5
	Definir num Como Entero
	Definir compra, pagar Como Real
	Escribir "Introduce el importe de la compra"
	Leer compra
	num=Aleatorio(1,100)
	Si (num<60) Entonces
		pagar<-compra-(compra*0.15)
		Escribir "El descuento aplicado es del 15%, debes de pagar: " pagar
	SiNo
		pagar<-compra-(compra*0.20)
		Escribir "El descuento aplicado es del 20%, debes de pagar: " pagar
	FinSi
FinAlgoritmo
