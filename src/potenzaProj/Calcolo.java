package potenzaProj;

public class Calcolo {
	
	//Inizializzazione delle variabili e della visibilità
	public int exponent = 4;
	public int base = 2;
	private int result = 1;
	
	//Metodo calcolo()
		public void calcolo() {
				for(int i = 0; i< exponent; i++) {
					result = result * base;
				}
	
			}
		
	//Metodo getResult() che ti ritorna il valore del risultato
 		public int getResult() {
			return result;
		}

}

		


