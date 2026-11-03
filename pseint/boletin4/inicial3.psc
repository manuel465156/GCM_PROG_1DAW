Algoritmo inical3
	Definir dado1, dado2 Como Caracter
	Definir lado1, lado2 Como Entero
	Escribir "Dime cuanto has sacado en la primera tirada:"
	Leer dado1
	Si (dado1 = "UNO" o dado1 = "uno" ) Entonces
		lado1<-1
	SiNo
		Si (dado1 = "DOS" o dado1 = "dos2") Entonces
			lado1<-2
		SiNo
			Si (dado1 = "TRES" o dado1 = "tres") Entonces
				lado1<-3
			SiNo
				Si (dado1 = "CUATRO" o dado1 = "cuatro") Entonces
					lado1<-4
				SiNo
					Si (dado1 = "CINCO" o dado1 = "cinco") Entonces
						lado1<-5
					SiNo
						Si (dado1 = "SEIS" o dado1 = "seis") Entonces
							lado1<-6
						SiNo
							Escribir "Te has equivocado, pon un valor apropiado" 
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	Escribir "Dime cuanto has sacado en la segunda tirada:"
	Leer dado2
	Si (dado2 = "UNO" o dado2 = "uno") Entonces
		lado2<-1
	SiNo
		Si (dado2 = "DOS" o dado2 = "dos") Entonces
			lado2<-2
		SiNo
			Si (dado2 = "TRES" o dado2 = "tres") Entonces
				lado2<-3
			SiNo
				Si (dado2 = "CUATRO" o dado2 = "cuatro") Entonces
					lado2<-4
				SiNo
					Si (dado2 = "CINCO" o dado2 = "cinco") Entonces
						lado2<-5
					SiNo
						Si (dado2 = "SEIS" o dado2 = "seis") Entonces
							lado2<-6
						SiNo
							Escribir "Te has equivocado, pon un valor apropiado" 
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	Escribir "La suma de las dos tiradas es: " lado1+lado2
FinAlgoritmo