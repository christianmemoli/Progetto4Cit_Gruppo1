import java.util.Random;

public class  Cliente implements java.io.Serializable {

	private String cognome;
	private String nome;
	private String nazione_di_nascita;
	private String citta_di_nascita;
	private Date data_di_nascita;
	private String codice_identificativo;
	private String email;
	private String password;
	
	double casuale = Math.random();
	Random random = new Random(500);
	int miavar = random.nextInt();
	//int a = 70; // numero minimo
	//int b = 500; // numero massimo
//	int c = ((b-a) + 1);
	
	
	
	public Cliente()
	{
		
	}


	public Cliente(String cognome, String nome, String nazione_di_nascita, String citta_di_nascita,
			Date data_di_nascita,  String email, String password) throws EccezioneException {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.nazione_di_nascita = nazione_di_nascita;
		this.citta_di_nascita = citta_di_nascita;
		this.data_di_nascita = data_di_nascita;
		
		this.email = email;
		this.setCodice_identificativo();
		
		if(password.length()<6) {
			throw new EccezioneException("Non si e rispettata la lunghezza prevista per la creazione di una password");
		}
		else
			this.password = password;
	}


	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}


	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the nazione_di_nascita
	 */
	public String getNazione_di_nascita() {
		return nazione_di_nascita;
	}


	/**
	 * @param nazione_di_nascita the nazione_di_nascita to set
	 */
	public void setNazione_di_nascita(String nazione_di_nascita) {
		this.nazione_di_nascita = nazione_di_nascita;
	}


	/**
	 * @return the citta_di_nascita
	 */
	public String getCitta_di_nascita() {
		return citta_di_nascita;
	}


	/**
	 * @param citta_di_nascita the citta_di_nascita to set
	 */
	public void setCitta_di_nascita(String citta_di_nascita) {
		this.citta_di_nascita = citta_di_nascita;
	}


	/**
	 * @return the data_di_nascita
	 */
	public Date getData_di_nascita() {
		return data_di_nascita;
	}


	/**
	 * @param data_di_nascita the data_di_nascita to set
	 */
	public void setData_di_nascita(Date data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}


	/**
	 * @return the codice_identificativo
	 */
	public String getCodice_identificativo() {
		return codice_identificativo;
	}


	/**
	 * @param codice_identificativo the codice_identificativo to set
	 */
	public void setCodice_identificativo() {
		//double casuale = Math.random();
		Random random = new Random();
		int miavar = random.nextInt(500);
		this.codice_identificativo = nome + "" + cognome + "" + miavar;
		// this.codice_identificativo = ""; // Concateniamo nome + cognome + Numero random
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [cognome=" + cognome + ", nome=" + nome + ", nazione_di_nascita=" + nazione_di_nascita
				+ ", citta_di_nascita=" + citta_di_nascita +", data_di_nascita="	+ data_di_nascita.toString()+ ", email=" + email + ", password=" + password + "]"+"\n";
	}
	
	
	
	
	
	
	
	
}
