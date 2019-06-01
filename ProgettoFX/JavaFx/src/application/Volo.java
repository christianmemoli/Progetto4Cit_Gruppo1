package application;


public class Volo implements java.io.Serializable {
	
	private String codice_volo;
	private String aeroporto_di_partenza;
	private String aeroporto_di_arrivo;
	private Data data_volo;
	private Orario ora_partenza;
	private int numero_posti;
	private float costo_volo;
	
	public Volo() 
	{
		
	}

	public Volo(String codice_volo, String aeroporto_di_partenza, String aeroporto_di_arrivo, Data data_volo,
			Orario ora_partenza, int numero_posti, float costo_volo) {
		super();
		this.codice_volo = codice_volo;
		this.aeroporto_di_partenza = aeroporto_di_partenza;
		this.aeroporto_di_arrivo = aeroporto_di_arrivo;
		this.data_volo = data_volo;
		this.ora_partenza = ora_partenza;
		this.numero_posti = numero_posti;
		this.costo_volo = costo_volo;
	}

	/**
	 * @return the codice_volo
	 */
	public String getCodice_volo() {
		return codice_volo;
	}

	/**
	 * @param codice_volo the codice_volo to set
	 */
	public void setCodice_volo(String codice_volo) {
		this.codice_volo = codice_volo;
	}

	/**
	 * @return the aeroporto_di_partenza
	 */
	public String getAeroporto_di_partenza() {
		return aeroporto_di_partenza;
	}

	/**
	 * @param aeroporto_di_partenza the aeroporto_di_partenza to set
	 */
	public void setAeroporto_di_partenza(String aeroporto_di_partenza) {
		this.aeroporto_di_partenza = aeroporto_di_partenza;
	}

	/**
	 * @return the aeroporto_di_arrivo
	 */
	public String getAeroporto_di_arrivo() {
		return aeroporto_di_arrivo;
	}

	/**
	 * @param aeroporto_di_arrivo the aeroporto_di_arrivo to set
	 */
	public void setAeroporto_di_arrivo(String aeroporto_di_arrivo) {
		this.aeroporto_di_arrivo = aeroporto_di_arrivo;
	}

	/**
	 * @return the data_volo
	 */
	public Data getData_volo() {
		return data_volo;
	}

	/**
	 * @param data_volo the data_volo to set
	 */
	public void setData_volo(Data data_volo) {
		this.data_volo = data_volo;
	}

	/**
	 * @return the ora_partenza
	 */
	public Orario getOra_partenza() {
		return ora_partenza;
	}

	/**
	 * @param ora_partenza the ora_partenza to set
	 */
	public void setOra_partenza(Orario ora_partenza) {
		this.ora_partenza = ora_partenza;
	}

	/**
	 * @return the ora_arrivo
	 */

	/**
	 * @return the numero_posti
	 */
	public int getNumero_posti() {
		return numero_posti;
	}

	/**
	 * @param numero_posti the numero_posti to set
	 */
	public void setNumero_posti(int numero_posti) {
		this.numero_posti = numero_posti;
	}

	/**
	 * @return the costo_volo
	 */
	public float getCosto_volo() {
		return costo_volo;
	}

	/**
	 * @param costo_volo the costo_volo to set
	 */
	public void setCosto_volo(float costo_volo) {
		this.costo_volo = costo_volo;
	}

	@Override
	public String toString() {
		return "Volo [codice_volo=" + codice_volo + ", aeroporto_di_partenza=" + aeroporto_di_partenza
				+ ", aeroporto_di_arrivo=" + aeroporto_di_arrivo + ", data_volo=" + data_volo + ", ora_partenza="
				+ ora_partenza + ", numero_posti=" + numero_posti + ", costo_volo="
				+ costo_volo +" €]"+"\n";
	}
	
}