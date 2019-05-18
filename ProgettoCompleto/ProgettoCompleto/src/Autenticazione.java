import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Autenticazione extends Cliente{
	
	
	private Cliente c ;
	public void RegistrazioneCliente(String cognome, String nome, String nazione_di_nascita, String citta_di_nascita,
			Date data_di_nascita, String email, String password) throws EccezioneException
	{
		
	 c = new Cliente(cognome, nome, nazione_di_nascita, citta_di_nascita, data_di_nascita, email, password);
	 
    	
	}
	
	// Scrivo su file binario.
	public void salvaDatiCliente() throws java.io.IOException {
			ObjectOutputStream stream =
					new ObjectOutputStream(new FileOutputStream("registrazione.bin"));
			stream.writeObject(this.c);
			stream.close();
		}
	/*
	public void caricaDatiCliente() throws java.io.IOException {
		ObjectInputStream stream =
				new ObjectInputStream(new FileInputStream("registrazione.bin"));
		try {
			this.c = (Cliente)stream.readObject();
		}
		//catch(ClassNotFoundException exception) {
		}
		stream.close();
	}*/
	
	/*public Cliente loginCliente(String email, String password, String codice_identificativo){
		HashMap<Integer,Cliente> utenti = new HashMap<Integer,Cliente>();
		Cliente d = null;
		utenti.put(1, d);
		utenti.remove(getCodice_identificativo());
		if(utenti.containsKey(getCodice_identificativo())){
			return utenti.get(codice_identificativo);
		}
		return null;
	}
	*/

}


