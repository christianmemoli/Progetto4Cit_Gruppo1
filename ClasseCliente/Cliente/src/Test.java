import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Test {
	private static int scelta;
	private static Scanner s;

	public static void main(String[] args) throws EccezioneException  {
		s = new Scanner (System.in);
		String cognome = null ;
		String nome = null ;
		String nazione_di_nascita = null ;
		String citta_di_nascita = null;
		String codice_identificativo = null;
		String email = null;
		String password = null;
		int giorno = 0;
		String mese = null;
		int anno = 0;
		
		ArrayListCliente alc = new ArrayListCliente(/*null*/);
		
		

		System.out.println("Quanti clienti si vogliono inserire?");
		int dim=s.nextInt();
		
		for (int i = 0; i< dim ; i++)
		{
			System.out.println("inserire il cognome del cliente:");
			cognome = s.next();
			System.out.println("inserire il nome del cliente:");
			nome = s.next();
			System.out.println("inserire la nazione di nascita del cliente:");
			nazione_di_nascita = s.next();
			System.out.println("inserire la citta di nascita del cliente:");
			citta_di_nascita=s.next();
			System.out.println("inserire il giorno di nascita:");
			giorno=s.nextInt();
			System.out.println("inserire il mese di nascita:");
			mese=s.next();
			System.out.println("inserire l'anno di nascita:");
			anno=s.nextInt();
			Date d = new Date (giorno, mese, anno);
			System.out.println("inserire l'email del cliente:");
			email=s.next();
			System.out.println("inserire la password del cliente:");
			password=s.next();
			
			
				Cliente nuovoCliente = new Cliente(cognome,nome,nazione_di_nascita,citta_di_nascita,d, email,password);
				System.out.println("Il codice identificativo del cliente è:"+nuovoCliente.getCodice_identificativo());
				alc.addCliente(nuovoCliente);
			
			System.out.println(alc.toString());
		}

			
		
		
		
		System.out.println(" Inserire un numero per accedere al menù:");
		System.out.println(" Il numero 0 corrisponde all' aggiunta di un nuovo cliente:");
		System.out.println(" Il numero 1 corrisponde al elenco di tutti i clienti:");
		System.out.println(" Il numero 2 corrisponde alla rimozione di un cliente mediante il suo codice identificativo:");
		System.out.println(" Il numero 3 corrisponde alla ricerca di un cliente mediante il suo codice identificativo:");
		System.out.println(" Il numero 4 corrisponde al elenco di tutti i clienti rimandenti dopo l'eliminazione:");
		System.out.println(" Un numero diverso da 0,1,2,3 e 4 per uscire dal menù:");
		
		do
		{
			scelta = s.nextInt();
			switch (scelta)
			{
			
			case 0 :
				System.out.println("Funzionalità di aggiunta di un nuovo cliente:");
				System.out.println("Quanti clienti si vogliono inserire?");
				dim =s.nextInt();
				
				for (int i = 0; i< dim ; i++)
				{
					System.out.println("inserire il cognome del cliente:");
					cognome = s.next();
					System.out.println("inserire il nome del cliente:");
					nome = s.next();
					System.out.println("inserire la nazione di nascita del cliente:");
					nazione_di_nascita = s.next();
					System.out.println("inserire la citta di nascita del cliente:");
					citta_di_nascita=s.next();
		
				
					System.out.println("inserire il giorno di nascita:");
					giorno=s.nextInt();
					System.out.println("inserire il mese di nascita:");
					mese=s.next();
					System.out.println("inserire l'anno di nascita:");
					anno=s.nextInt();
					Date d = new Date (giorno, mese, anno);
					System.out.println("inserire l'email del cliente:");
					email=s.next();
					System.out.println("inserire la password del cliente:");
					password=s.next();
				
				
					
					Cliente nuovoCliente = new Cliente(cognome,nome,nazione_di_nascita,citta_di_nascita,d, email,password);
					System.out.println("Il codice identificativo del cliente è:"+nuovoCliente.getCodice_identificativo());
					alc.addCliente(nuovoCliente);
					System.out.println(alc.toString());
				}

				System.out.println("Cliente aggiunto correttamente"+"\n"+"Inserire un nuovo numero per accedere nuovamente nel menù:");
				break;
				
			case 1 :
				System.out.println("Elenco di tutti i clienti contenuti nella collection:");
				System.out.println(alc.toString());
				System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
				break;
				
			case 2:
				System.out.println("Rimozione di un cliente mediante il suo codice identificativo:"+"\n"+"inerire il codice identificativo del cliente da rimuovere:");
				codice_identificativo = s.next();
				alc.rimuoviCliente(codice_identificativo);
				System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
				break;
				
			case 3:
				System.out.println("Ricerca di un cliente mediante il suo codice identificativo:"+"\n"+"inerire il codice identificativo del volo da rimuovere:");
				codice_identificativo = s.next();
				System.out.println(alc.ricercaCliente1(codice_identificativo));
				System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
				break;
				
			case 4:
				System.out.println("Elenco di tutti i clienti rimanenti nella collection dopo l'eventuale rimozione:");
				System.out.println(alc.toString());
				System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
				break;
				
			default :
				System.out.println("Se si vuole uscire dal menù premere un tasto diverso da 0,1,2,3 o 4");
				scelta = s.nextInt();
				break;
			}
			
		}while(scelta == 0 || scelta == 1 || scelta ==2 || scelta == 3 || scelta == 4);
	
		System.out.println("Siete usciti dal menù grazie e buona giornata");

	
	
	
		
		try {
			alc.salvaDatiClienti();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*System.out.println(c.toStringCodice());
		System.out.println(c.toStringCodice());
		System.out.println(c.toStringCodice());
		System.out.println(c.toStringCodice());
		*/
		
		
		System.out.println();
		System.out.println();
		
		
		Cliente cliente = new Cliente();
		Scanner loginCliente = new Scanner (System.in);
		System.out.println("Inserisci email: \n");
		cliente.setEmail(loginCliente.nextLine());
		String em;
		System.out.println("Inserisci password: \n");
		cliente.setPassword(loginCliente.nextLine());
		String ppssw;
		Autenticazione ctrllogin=new Autenticazione();
		//Cliente clienteloggato=ctrllogin.faiillogin(em,ppssw);
		
		
		
		
		
		
		
		
	}

}
