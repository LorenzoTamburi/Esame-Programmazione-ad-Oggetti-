package CiampichettiTamburiTaras.OOPProject.Model;

/**
 * Classe che gestisce la classifica marcatori
 * 
 */
public class ClassificaMarcatori {
	
	/**
	 * Nome del marcatore
	 */
	private String marcatori;
	
	/**
	 * Squadsra in cui milita il giocatore
	 */
	private String squadre;
	
	/**
	 * Gol segnati dal marcatore
	 */
	private int numeroGol;
	
	/**
	 * Costruttore della classe
	 */
	public ClassificaMarcatori( String marcatori,  String squadre,  int numeroGol) {
		super();
		this.marcatori=marcatori;
		this.squadre=squadre;
		this.numeroGol=numeroGol;
	}
	
	public ClassificaMarcatori() {
		super();
	}
	
	public String getMarcatori() {
		return marcatori;
	}

	public String getSquadre() {
		return squadre;
	}

	public void setSquadre(String squadre) {
		this.squadre = squadre;
	}

	public int getNumeroGol() {
		return numeroGol;
	}

	public void setNumeroGol(int numeroGol) {
		this.numeroGol = numeroGol;
	}

	public void setMarcatori(String marcatori) {
		this.marcatori = marcatori;
	}
}
