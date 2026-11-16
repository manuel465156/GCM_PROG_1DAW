Algoritmo secuencial8
	Definir r , base, altura, area1, area2 Como Real
	Escribir "Dime el radio del circulo: "
	Leer r
	Escribir "Dime la base y la altura del triangulo: "
	Leer base, altura
	area1<-pi*r^2
	area2<-(base*altura)/2
	Si area1=area2 Entonces
		Escribir "El ciruclo y el triangulo tienen el mismo area"
	SiNo
		Si area1>area2 Entonces
			Escribir "El ciruclo tiene una area mayor"
		SiNo
			Escribir "El triangulo tiene un area mayor"
		FinSi
	FinSi
FinAlgoritmo
