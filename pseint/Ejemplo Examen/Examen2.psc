Algoritmo Examen2
	Definir entradasGOL, entradasPREFERENCIA, opc, ganancia, gananciaGOL, gananciaPREFERENCIA, entrada, vendidaGOL, vendidaPREFERENCIA Como Entero
	Definir respuesta Como Caracter
	gananciaGOL=0
	gananciaPREFERENCIA=0
	respuesta="s"
	vendidaGOL=0
	vendidaPREFERENCIA=0
	Escribir "¿Cuantas entradas disponibles van a haber en GOL?"
	Leer entradasGOL
	Escribir "¿Cuantas entradas disponibles van a haber en PREFERENCIA?"
	Leer entradasPREFERENCIA 
	Mientras respuesta="s" y ((entradasGOL<>0) o (entradasPREFERENCIA<>0)) Hacer
		Escribir "--- NUEVO INTENTO DE COMPRA ---"
		Escribir "Quedan " entradasGOL " entradas en la zona GOL"
		Escribir "Quedan " entradasPREFERENCIA " entradas en la zona PREFERENCIA"
		Escribir ""
		Escribir "¿En qué zona desea comprar?"
		Escribir "1. GOL (25?)"
		Escribir "2. PREFERENCIA (40?)"
		Leer opc
		Segun opc Hacer
				1:
					Escribir "¿Cuántas entradas desea comprar?"
					Leer entrada
					Si entrada>5 Entonces
						Escribir "ERROR: No se pueden comprar más de 5 entradas por operación."
					SiNo
						Si entradasGOL>0 Entonces
							entradasGOL=entradasGOL-entrada
							vendidaGOL=entrada+vendidaGOL
							Escribir "Venta realizada correctamente"
							ganancia= (entrada*25) 
							Escribir "Importe ganado: " ganancia
							gananciaGOL=gananciaGOL+ganancia
						SiNo
							Escribir "No quedan entradas disponibles"
						FinSi
					FinSi
				2:
					Escribir "¿Cuántas entradas desea comprar?"
					Leer entrada
					Si entrada>5 Entonces
						Escribir "ERROR: No se pueden comprar más de 5 entradas por operación."
					SiNo
						Si entradasPREFERENCIA>0 Entonces
							entradasPREFERENCIA=entradasPREFERENCIA-entrada
							vendidaPREFERENCIA=entrada+vendidaPREFERENCIA
							Escribir "Venta realizada correctamente"
							ganancia= (entrada*25) 
							Escribir "Importe ganado: " ganancia
							gananciaPREFERENCIA=gananciaPREFERENCIA+ganancia
						SiNo
							Escribir "No quedan entradas disponibles"
						FinSi
					FinSi
			FinSegun
			Escribir "¿Desea seguir comprando? (s/n): "
			Leer respuesta
		FinMientras
		Escribir "Se han vendido un total de " vendidaGOL " entradas en GOL"
		Escribir "Se han vendido un total de " vendidaPREFERENCIA " entradas en PREFERENCIA"
		Escribir "Se ha recaudado un total de " gananciaGOL+gananciaPREFERENCIA " ?"
		Escribir "Quedan " entradasGOL " entradas en GOL"
		Escribir "Quedan " entradasPREFERENCIA " entradas en Preferencia"
FinAlgoritmo
// Preguntar las entradas de queda zona
//  Mientres queden entradas en GOL o PREFERENCIAS  preguntar si seguir
// Mostrar nº entradas de cada zona
//  Preguntar que zona quiere comprar
// Comprar max de 5, si supera ERROR, volver a preguntar si quiere comprar
//  Comprobar si hay entradas para comprar, si se puede Mostrar importe de venta. Sino hay entradas suficientes ERROR
// Precio GOL = 25
// Precio PREFERENCIA = 40
// Preguntar si quiere seguir comprando
// Termina cuando diga que no quiere comprar mas, no queden entradas en ninguna zona
// Cuando finalice muestre:
// nº total de vendido por zona
// nº total recaudado
// nº entradas disponibles