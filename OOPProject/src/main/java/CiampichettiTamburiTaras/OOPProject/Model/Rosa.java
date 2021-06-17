package CiampichettiTamburiTaras.OOPProject.Model;
/**
 * Costruttore che restituisce lo staff sportivo di una squadra
 */
public class Rosa {
	
	/**
	 * Nome del giocatore o allenatore
	 */
	private String nome;
	
	/**
	 * Nazionalità del giocatore o allenatore
	 */
	private String nazionalità;
	
	/**
	 * Ruolo (giocatore o allenatore)
	 */
	private String ruolo;
	
	public Rosa(String nome, String nazionalità, String ruolo) {
		
		super();
		this.nome=nome;
		this.nazionalità=nazionalità;
		this.ruolo=ruolo;
	}
	
	public Rosa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazionalità() {
		return nazionalità;
	}

	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

}
