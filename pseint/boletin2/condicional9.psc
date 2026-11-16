Algoritmo condicional9
	Definir eleccion Como Entero
	Escribir "Elije una opción: "
	Escribir "1.Helado sin topping"
	Escribir "2. Topping de oreo"
	Escribir "3. Topping de kitkat"
	Escribir "4. Topping de lacasitos"
	Escribir "5. Topping de conguitos"
	Escribir "6. Salir"
	Leer eleccion	
	Segun eleccion Hacer
		1:
			Escribir "El helado sin topping cuesta 1.90?"
		2:
			Escribir "El topping de oreo cuesta " (1.90+1)
		3:
			Escribir "El topping de kitkat cuesta " (1.90+1)
		4:
			Escribir "El topping de lacasitos cuesta " (1.90+0.50)
		5:	
			Escribir "El topping de conguitos cuesta " (1.90+0.50)
		6:
			Escribir "Saliendo"
		De Otro Modo:
			Escribir "Eligue una opcion valida"
	Fin Segun
FinAlgoritmo