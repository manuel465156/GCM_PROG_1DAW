Algoritmo condicional8_2
	Definir eleccion Como Entero
	Definir num1, num2 Como Real
	Escribir "Dime una de estas opciones: "
	Escribir "1.Sumar"
	Escribir "2. Restar"
	Escribir "3. Multiplicar"
	Escribir "4. Dividir"
	Escribir "5. Salir"
	Escribir "Al responder con el número sirve"
	Leer eleccion
	Escribir "Dime dos numeros"
	Leer num1, num2
	Segun eleccion Hacer
	1:
		Escribir (num1+num2)
	2:
		Escribir (num1-num2)
	3:
		Escribir (num1*num2)
	4:
		Si (num2=0) Entonces
			Escribir "No se puede dividir por 0"
		SiNo
			Escribir (num1/num2)
		FinSi
	5:
		Escribir "Salir"
	De Otro Modo:
		Escribir "Eligue una opcion valida"
Fin Segun
FinAlgoritmo