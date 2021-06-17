package CiampichettiTamburiTaras.OOPProject.Model;

/**
 * Classe che gestisce la classifica
 * 
 */
public class Classifica {
	/**
	 * posizione della squadra
	 */
	private int posizione;
	
	/**
	 * nome della squadra
	 */
	private String nomeSquadra;
	
	/**
	 * partite giocate dalla squadra
	 */
	private int partiteGiocate;
	
	/**
	 * punti totalizzati dalla squadra
	 */
	private int punti;
	
	/**
	 * gol fatti dalla squadra
	 */
	private int golFatti;
	
	/**
	 * gol subiti dalla squadra
	 */
	private int golSubiti;
	
	/**
	 * differenza fra gol fatti e gol subiti
	 */
	private int differenzaReti;
	
	/**
	 * tipo di classifica da visualizzare
	 */
	private int tipoClassifica;
	
	/**
	 * Costruttore senza parametri
	 */
	public Classifica() {
		super();
	}
	
	/**
	 * Costruttore della classe
	 */
	public Classifica(String nomeLega, int posizione, String nomeSquadra, int partiteGiocate,
			int punti, int golFatti, int golSubiti, int differenzaReti, int tipoClassifica) {
		super();
	 	this.posizione = posizione;
		this.nomeSquadra = nomeSquadra;
		this.partiteGiocate = partiteGiocate;
		this.punti = punti;
		this.golFatti = golFatti;
		this.golSubiti = golSubiti;
		this.differenzaReti = differenzaReti;
		this.tipoClassifica = tipoClassifica;
	}
	
	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	public String getNomeSquadra() {
		return nomeSquadra;
	}

	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}

	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	public int getGolFatti() {
		return golFatti;
	}

	public void setGolFatti(int golFatti) {
		this.golFatti = golFatti;
	}

	public int getGolSubiti() {
		return golSubiti;
	}

	public void setGolSubiti(int golSubiti) {
		this.golSubiti = golSubiti;
	}

	public int getDifferenzaReti() {
		return differenzaReti;
	}

	public void setDifferenzaReti(int differenzaReti) {
		this.differenzaReti = differenzaReti;
	}

	public int getTipoClassifica () {
		return tipoClassifica;
	}
	
	public void setTipoClassifica (int tipoClassifica) {
		this.tipoClassifica = tipoClassifica;
	}
}
