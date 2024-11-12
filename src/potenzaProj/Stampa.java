package potenzaProj;



public class Stampa {
	
	//Metodo stampa
	public void stampa() {
		
		//Istanza dell'oggetto della classe Calcolo
		Calcolo calcolo = new Calcolo();
		
		//Chiamo metodo calcolo()
		calcolo.calcolo();
		
		//Stampa
		System.out.println("28/10/24 - Stampa Potenza - Francis Yuan Verzola -");
		System.out.println("Lo scopo di questo programma è di svolgere la potenza di un numero predefinito"
				+ " e stampare il risultato");
		System.out.println("Funzionamento: per eseguire il calcolo della potenza utilizzo un ciclo for"
				+ " dove ripeto il ciclo per il numero dell'esponente, e moltiplico il risultato (che è uguale a 1)"
				+ " per la base.");
		System.out.println();
		System.out.println("La base " + calcolo.base + " con la potenza di " + calcolo.exponent + " e': " + calcolo.getResult() );
		System.out.println("Programma terminato!");
		
	}
}
