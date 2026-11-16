Algoritmo condiconal7
	Definir horaDia, horaNoche, pagar	Como Real
	Escribir "¿Cuantas horas has trabajado de dia?"
	Leer horaDia
	Escribir "¿Cuantas horas has trabajado de noche?"
	Leer horaNoche
	horaDia<-12*horaDia
	horaNoche<-20*horaNoche
	pagar<-horaDia+horaNoche
	Si pagar>120 Entonces
		pagar<-pagar-(pagar*0.05)
		Escribir "Tu cobras: " pagar
	SiNo
		Escribir "Tu cobras: " pagar
	FinSi
FinAlgoritmo
