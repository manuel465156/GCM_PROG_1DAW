Algoritmo secuencial4
	Definir num1, num2 Como Entero
	Definir resto Como Entero
	Escribir "Dime dos numeros: "
	Leer num1, num2
	resto=num1%num2
	Si (resto=0) Entonces
		Escribir  num1 " es multiplo de " num2
	SiNo
		resto=num2%num1
		Si (resto=0) Entonces
			Escribir  num2 " es multiplo de " num1
		SiNo 
			Escribir "Ni " num1 " ni " num2 " son multiplos"
		FinSi
	FinSi
FinAlgoritmo
