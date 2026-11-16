Algoritmo condicional4
	Definir nombre Como Caracter
	Definir edad Como Entero
	Definir SiCarnet, SiCertificado, apto Como Logico
	Escribir "Dime tu nombre, tu edad"
	Leer nombre, edad
	Escribir "¿Tienes el carnet de conducir? y ¿Tienes el certificado médico en regla?(Verdadero Falso)"
	Leer SiCarnet, SiCertificado
	Si ((edad>=18) y SiCarnet y SiCertificado) Entonces
		Escribir "Eres apto para conducir"
	SiNo
		Escribir "No eres apto para conducir"
	FinSi
FinAlgoritmo
