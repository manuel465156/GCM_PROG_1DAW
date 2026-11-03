Algoritmo incial2
	Definir num1, num2 Como Real
	Definir opc, i, final Como Entero
	Escribir "¿Cuantas veces vas a querer operar?"
	Leer final
	Para i<-1 Hasta final Con Paso 1 Hacer
		Escribir "Dime dos numeros: "
		Leer num1, num2
		Escribir "===Elije que quieres hacer==="
		Escribir "1. Sumar los números"
		Escribir "2. Restar los números"
		Escribir "3. Multiplicar los números"
		Escribir "4. Dividir los números"
		Escribir "5. Salir"
		Leer opc
		Segun opc Hacer
			1:
				Escribir (num1+num2)
			2:
				Escribir (num1-num2)
			3:
				Escribir (num1*num2)
			4:
				Si num2=0 Entonces
					Escribir "No se puede divir por cero"
				SiNo
					Escribir (num1/num2)
				FinSi
			5:
				Escribir "Saliendo"
			De Otro Modo:
				Escribir "Elije una opcion valida"
		FinSegun
	Fin Para
FinAlgoritmo
