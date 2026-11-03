Algoritmo secuencial10
Definir opc1, num, opc0, p1, p2 Como Entero
Repetir
	Escribir "Vamos a jugar a piedra, papel o tijeras"
	Escribir "¿Contra quien quieres jugar?"
	Escribir "1. JugadorVSJugador"
	Escribir "2. JugadorVSBot"
	Escribir "3. Salir"
	Leer opc0
	Segun opc0 Hacer
		1:
			Esperar 1 Segundos
			Borrar Pantalla
			Escribir "Jugador 1, ¿qué eliges?: "
			Escribir "1. Piedra"
			Escribir "2. Papel"
			Escribir "3. Tijeras"
			Leer p1
			Borrar Pantalla
			Escribir "Jugador 2, ¿qué eliges?: "
			Escribir "1. Piedra"
			Escribir "2. Papel"
			Escribir "3. Tijeras"
			Leer p2
			Borrar Pantalla
			Segun p1 Hacer
				1:
					Si p2==1 Entonces
						Escribir "Piedra VS Piedra"
						Escribir "Es un empate"
						Esperar 1 Segundos
						Borrar Pantalla
					SiNo
						Si p2==2 Entonces
							Escribir "Piedra VS Papel"
							Escribir "Ha ganado el jugador 2"
							Esperar 1 Segundos
							Borrar Pantalla
						SiNo
							Escribir "Piedra VS Tijeras"
							Escribir "Ha ganado el jugador 1"
							Esperar 1 Segundos
							Borrar Pantalla
						FinSi
					FinSi
				2:
					Si p2==1 Entonces
						Escribir "Papel VS Piedra"
						Escribir "Ha ganado el jugador 1"
						Esperar 1 Segundos
						Borrar Pantalla
					SiNo
						Si p2==2 Entonces
							Escribir "Papel VS Papel"
							Escribir "Es un empate"
							Esperar 1 Segundos
							Borrar Pantalla
						SiNo
							Escribir "Papel VS Tijeras"
							Escribir "Ha ganado el jugador 2"
							Esperar 1 Segundos
							Borrar Pantalla
						FinSi
					FinSi
				3:
					Si p2==1 Entonces
						Escribir "Tijeras VS Piedra"
						Escribir "Ha ganado el jugador 2"
						Esperar 1 Segundos
						Borrar Pantalla
					SiNo
						Si num2==2 Entonces
							Escribir "Tijeras VS Papel"
							Escribir "Ha ganado el jugador 1"
							Esperar 1 Segundos
							Borrar Pantalla
						SiNo
							Escribir "Tijeras VS Tijeras"
							Escribir "Es un empate"
							Esperar 1 Segundos
							Borrar Pantalla
						FinSi
					FinSi
				De Otro Modo:
					Escribir "Dame una opcion valida"
					Esperar 1 Segundos
					Borrar Pantalla
			Fin Segun
		2:
			Esperar 1 Segundos
			Borrar Pantalla
			Escribir "Eligue que quieres jugar:"
			Escribir "1. Piedra"
			Escribir "2. Papel"
			Escribir "3. Tijeras"
			Leer opc1
			num<-Aleatorio(1,3)
			Escribir num
			Segun opc1 Hacer
				1:
					Escribir "Has eligido piedra"
					Si num==1 Entonces
						Escribir "Es un empate"
						Esperar 1 Segundos
						Borrar Pantalla
					SiNo
						Si num==2 Entonces
							Escribir "Has perdido"
							Esperar 1 Segundos
							Borrar Pantalla
						SiNo
							Escribir "Has ganado"
							Esperar 1 Segundos
							Borrar Pantalla
						FinSi
					FinSi
				2:
					Escribir "Has eligido papel"
					Si num==1 Entonces
						Escribir "Has ganado"
						Esperar 1 Segundos
						Borrar Pantalla
					SiNo
						Si num==2 Entonces
							Escribir "Es un empate"
							Esperar 1 Segundos
							Borrar Pantalla
						SiNo
							Escribir "Has perdido"
							Esperar 1 Segundos
							Borrar Pantalla
						FinSi
					FinSi
				3:
					Escribir "Has eligido tijeras"
					Si num==1 Entonces
						Escribir "Has perdido"
						Esperar 1 Segundos
						Borrar Pantalla
					SiNo
						Si num==2 Entonces
							Escribir "Has ganado"
							Esperar 1 Segundos
							Borrar Pantalla
						SiNo
							Escribir "Es un empate"
							Esperar 1 Segundos
							Borrar Pantalla
						FinSi
					FinSi
				De Otro Modo:
					Esperar 1 Segundos
					Borrar Pantalla
					Escribir "Dame una opcion valida"
					Esperar 1 Segundos
					Borrar Pantalla
			Fin Segun
		De Otro Modo:
			Escribir "Dime una opcion valida"
			Esperar 1 Segundos
			Borrar Pantalla
	FinSegun
Hasta Que opc0=3
Escribir "Gracias por jugar a mi juego"
Escribir "Hasta la proxima"
FinAlgoritmo