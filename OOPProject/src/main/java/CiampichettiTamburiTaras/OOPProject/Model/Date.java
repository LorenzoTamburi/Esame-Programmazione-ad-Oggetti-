package CiampichettiTamburiTaras.OOPProject.Model;
/**
 * Classe che gestisce le partite in un determinato periodo
 */
public class Date {

	/**
	 * punteggio squadra in casa
	 */
	private int punteggioCasa;
	
	/**
	 * Punteggio squadra ospite
	 */
	private int punteggioOspite;
	
	/**
	 * Nome della squadra in casa
	 */
	private String squadraCasa;
	
	/**
	 * nome squadra ospite
	 */
	private String squadraOspite;
	
	/**
	 * data della partita
	 */
	private String dataPartita;
	
	
	/**
	 * Costruttore
	 */
	public Date(int punteggioCasa, int punteggioOspite, String squadraCasa, String squadraOspite, String dataPartita) {
		super();
		this.punteggioCasa=punteggioCasa;
		this.punteggioOspite=punteggioOspite;
		this.squadraCasa=squadraCasa;
		this.squadraOspite=squadraOspite;
		this.dataPartita=dataPartita;
		
	}

	public Date() {
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

	public String getDataPartita() {
		return dataPartita;
	}

	public void setDataPartita(String dataPartita) {
		this.dataPartita = dataPartita;
	}
	
	
}
