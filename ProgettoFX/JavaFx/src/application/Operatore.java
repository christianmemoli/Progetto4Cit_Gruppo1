package application;

public class Operatore {

	private String nome ;
	private String cognome ;
	private String email ;
	private String passwordl ;
	private String codice_identificativo;
	
	
	

	public Operatore(String nome, String cognome, String email, String passwordl, String codice_identificativo) {
		//costruttore di parametrizzato
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.passwordl = passwordl;
		this.codice_identificativo = codice_identificativo;
	}

	public Operatore() 
	{
		//costruttore di default
	}
	
	public Operatore(Operatore o) {
		//costruttore di copia
		this.nome = o.nome;
		this.cognome = o.cognome;
		this.email = o.email;
		this.passwordl = o.passwordl;
		this.codice_identificativo = o.codice_identificativo;}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordl() {
		return passwordl;
	}

	public void setPasswordl(String passwordl) {
		this.passwordl = passwordl;
	}

	public String getCodice_identificativo() {
		return codice_identificativo;
	}

	public void setCodice_identificativo(String codice_identificato) {
		this.codice_identificativo = codice_identificativo;
	}

	@Override
	public String toString() {
		return "Operatore [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", passwordl=" + passwordl
				+ ", codice_identificativo=" + codice_identificativo + "]"+"\n";
	}

	

	
}
