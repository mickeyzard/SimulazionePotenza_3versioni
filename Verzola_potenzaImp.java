package potenza;

/**
 * @author Francis Yuan Verzola
 * 
 */

public class Verzola_potenzaImp {

	public static void main(String[] args) {
		
		System.out.println("28/10/24 - Stampa Potenza - Francis Yuan Verzola -");
		System.out.println("Lo scopo di questo programma è di svolgere la potenza di un numero predefinito"
				+ " e stampare il risultato");
		System.out.println("Funzionamento: per eseguire il calcolo della potenza utilizzo un ciclo for"
				+ " dove ripeto il ciclo per il numero dell'esponente, e moltiplico il risultato (che è uguale a 1)"
				+ " per la base.");
		
	//Inizializzazione delle variabili
		int result = 1, base= 2, exponent = 4;
		
		//Calcolo
			for(int i = 0; i< exponent; i++) {
					result = base * result;
				}
			//Stampa
				System.out.println();
				System.out.println("La base " + base + " con la potenza di " + exponent + " e': " + result);
				System.out.println("Programma terminato!");
				
				}
		
		}
		
		
	


