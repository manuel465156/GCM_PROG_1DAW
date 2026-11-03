Algoritmo condicional8
	Definir eleccion Como Entero
	Definir num1, num2 Como Real
	Escribir "Dime una de estas opciones: "
	Escribir "1.Sumar"
	Escribir "2. Restar"
	Escribir "3. Multiplicar"
	Escribir "4. Dividir"
	Escribir "5. Salir"
	Leer eleccion
	Escribir "Dime dos números: "
	Leer num1, num2
	Si eleccion=1 Entonces
		Escribir "El resultado de la suma es: " num1+num2
	SiNo
		Si eleccion=2 Entonces
			Escribir "El resultado de la resta es: " num1-num2
		SiNo
			Si eleccion=3 Entonces
				Escribir "El resultado de la resta es: " num1*num2
			SiNo
				Si eleccion=4 Entonces
					Si num2=0 Entonces
						Escribir "No se puede dividir por 0"
					SiNo
						Escribir "El resultado de la división es: " num1/num2
					FinSi
				SiNo
					Si eleccion=5 Entonces
						Escribir "Adios"
					SiNo
						Escribir "Debes elegir una opción valida"
					FinSi
					FinSi
					FinSi
				FinSi
			FinSi							
FinAlgoritmo