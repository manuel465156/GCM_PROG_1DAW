Algoritmo bandera_conta
	//El programa terminara cuando num%2<>0 o num>100
	Definir num, conta Como Entero
	num<-0
	// Mientras !( num%2<>0 o num>100) Hacer
		//Escribir "Dime un numero: "
		//Leer num
		//conta<-conta+1
		//Escribir "Has introducido " conta " numeros"
	//FinMientras
//	Mientras ((num%2=0) y num<100) Hacer 
	//	Escribir "Dime un numero: "
		//Leer num
		//conta<-conta+1
		//Escribir "Has introducido " conta " numeros"
	//FinMientras
	Repetir
	Escribir "Dime un numero: "
		Leer num
		conta<-conta+1
		Escribir "Has introducido " conta " numeros"
	Hasta Que ( num%2<>0 o num>100)
FinAlgoritmo