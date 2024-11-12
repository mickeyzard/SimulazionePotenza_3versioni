package potenzaProc;

/**
 * @author Francis Yuan Verzola
 * 
 */

public class Verzola_potenzaProc {

	public static void main(String[] args) {
		Verzola_potenzaProc potenza = new Verzola_potenzaProc();
		potenza.calcolo();
		potenza.stampa();
	}
	
	//Inizializzazione delle variabili fuori dal main
	private int exponent = 4;
	private int base = 2;
	private int result = 1;
	
	//Metodo stampa
	public void stampa() {
		System.out.println("28/10/24 - Stampa Potenza - Francis Yuan Verzola -");
		System.out.println("Lo scopo di questo programma è di svolgere la potenza di un numero predefinito"
				+ " e stampare il risultato");
		System.out.println("Funzionamento: per eseguire il calcolo della potenza utilizzo un ciclo for"
				+ " dove ripeto il ciclo per il numero dell'esponente, e moltiplico il risultato (che è uguale a 1)"
				+ " per la base.");
		System.out.println();
		System.out.println("La base " + base + " con la potenza di " + exponent + " e': " + result);
		System.out.println("Programma terminato!");
	}
	
	//Metodo calcolo
		public void calcolo() {
				for(int i = 0; i< exponent; i++) {
					result = base * result;
				}
	
			}
			

}




