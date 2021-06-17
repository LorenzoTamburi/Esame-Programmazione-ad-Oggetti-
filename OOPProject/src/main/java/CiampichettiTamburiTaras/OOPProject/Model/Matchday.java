package CiampichettiTamburiTaras.OOPProject.Model;
/**
 * Classe che si occupa della partita di un determinato giorno
 */
public class Matchday {

	/**
	 * Gol sefgnati dalla squadra in casa
	 */
	private int punteggioCasa;
	
	/**
	 * Gol segnati dalla squadra ospite
	 */
	private int punteggioOspite;
	
	/**
	 * Nome squadra ospite
	 */
	private String squadraCasa;
	
	/**
	 * Nome squadra ospite
	 */
	private String squadraOspite;
	
	/*
	 * Costruttore
	 */
	public Matchday (int punteggioCasa, int punteggioOspite, String squadraCasa, String squadraOspite) {
		
		super();
		this.punteggioCasa=punteggioCasa;
		this.punteggioOspite=punteggioOspite;
		this.squadraCasa=squadraCasa;
		this.squadraOspite=squadraOspite;
	}
	
	public Matchday() {
		super();
	}

	public int getPunteggioCasa() {
		return punteggioCasa;
	}

	public void setPunteggioCasa(int punteggioCasa) {
		this.punteggioCasa = punteggioCasa;
	}

	public int getPunteggioOspite() {
		return punteggioOspite;
	}

	public void setPunteggioOspite(int punteggioOspite) {
		this.punteggioOspite = punteggioOspite;
	}

	public String getSquadraCasa() {
		return squadraCasa;
	}

	public void setSquadraCasa(String squadraCasa) {
		this.squadraCasa = squadraCasa;
	}

	public String getSquadraOspite() {
		return squadraOspite;
	}

	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}
	
	
}

