import java.io.IOException;
import java.util.Scanner;
public class TestCompleto {

	private static int scelta;
	private static Scanner s;
	private static Prenotazione p;
	private static String codice_identificativo;
	private static Volo v;
	
	
	public static void main(String[] args) throws EccezioneException  {
		// TODO Auto-generated method stub

		s = new Scanner (System.in);
		String codice_identificativo = null ;
		String aereoporto_partenza = null ;
		String aereoporto_arrivo = null ;
		int giorno_volo = 0;
		String mese_volo = null;
		int anno_volo = 0;
		Float ora_partenza = null ;
		Float ora_arrivo = null;
		int numero_posti ;
		Float costo_volo ;	
		ArrayListVolo alv = new ArrayListVolo(/*null*/);
		v = new Volo();
		s = new Scanner (System.in);
		int numero_bagagli = 0  ;
		Double peso_bagagli = null ;	
		ArrayListPrenotazione alp = new ArrayListPrenotazione(/*null*/);
		p = new Prenotazione();
		codice_identificativo = null;
		String nome = null;
		String cognome = null;
		String email = null;
		String password = null;
		ArrayListOperatore alo = new ArrayListOperatore(/*null*/);
		Operatore op =new Operatore();	
		double peso;
		String nazione_di_nascita = null ;
		String citta_di_nascita = null;
		int giorno = 0;
		String mese = null;
		int anno = 0;
		ArrayListCliente alc = new ArrayListCliente(/*null*/);

			
System.out.println(" Inserire un numero per accedere al menù:");
System.out.println(" Il numero 0 corrisponde alla sezione voli");
System.out.println(" Il numero 1 corrisponde alla sezione clienti");
System.out.println(" Il numero 2 corrisponde alla sezione operatore");
System.out.println(" Il numero 3 corrisponde alla sezione prenotazioni");
System.out.println(" Un numero diverso da 0,1,2 e 3 per uscire dal menù:");

do
{
	scelta = s.nextInt();
	switch (scelta)
	{
		case 0:
		do
		{
			System.out.println(" Inserire un numero per accedere al menù dedicato alla sezione voli:");
			System.out.println(" Il numero 0 corrisponde all' aggiunta di un nuovo volo:");
			System.out.println(" Il numero 1 corrisponde al elenco di tutti i voli:");
			System.out.println(" Il numero 2 corrisponde alla rimozione di un volo mediante il suo codice identificativo:");
			System.out.println(" Il numero 3 corrisponde alla ricerca di un volo mediante il suo codice identificativo:");
			System.out.println(" Il numero 4 corrisponde al elenco di tutti i voli rimandenti dopo l'eliminazione:");
			System.out.println(" Un numero diverso da 0,1,2,3 e 4 per uscire dal menù:");

			scelta = s.nextInt();
			switch (scelta)
			{
	
				case 0 :
					System.out.println("Funzionalità di aggiunta di un nuovo volo:");
					System.out.println("Quante voli si volgiono inserire?");
					int dim=s.nextInt();
					for (int i = 0; i< dim ; i++)
					{
						System.out.println("inserire il codice del volo:");
						codice_identificativo = s.next();
						System.out.println("inserire aereoporto di arrivo del volo:");
						aereoporto_partenza = s.next();
						System.out.println("inserire aereoporto di destinazione del volo:");
						aereoporto_arrivo = s.next();
						System.out.println("inserire il giorno di partenza del volo:");
						giorno_volo=s.nextInt();
						System.out.println("inserire il mese di partenza del volo:");
						mese_volo=s.next();
						System.out.println("inserire l'anno di partenza del volo:");
						anno_volo=s.nextInt();
					Data d = new Data (giorno_volo, mese_volo, anno_volo);
						System.out.println("inserire l orario di partenza del volo:");
						ora_partenza=s.nextFloat();
						System.out.println("inserire l orario di arrivo del volo:");
						ora_arrivo=s.nextFloat();
					Orario o = new Orario (ora_partenza, ora_arrivo);
						System.out.println("inserire il numero di posti disponibili sul volo:");
						numero_posti = s.nextInt();
						System.out.println("inserire il costo del volo:");
						costo_volo = s.nextFloat();
					alv.addVolo(new Volo(codice_identificativo,aereoporto_partenza,aereoporto_arrivo,d,o,numero_posti,costo_volo));
						System.out.println(alv.toString());
					}
						System.out.println("Volo aggiunto correttamente"+"\n");
					break;
							
				case 1 :
						System.out.println("Elenco di tutti i voli contenuti nella collection:");
						System.out.println(alv.toString());
						System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
							
				case 2:
						System.out.println("Rimozione di un volo mediante il suo codice identificativo:"+"\n"+"inerire il codice identificativo del volo da rimuovere:");
						codice_identificativo = s.next();
						alv.rimuoviVolo(codice_identificativo);
						System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
							
				case 3:
						System.out.println("Ricerca di un volo mediante il suo codice identificativo:"+"\n"+"inerire il codice identificativo del volo da rimuovere:");
						codice_identificativo = s.next();
						System.out.println(alv.ricercaVolo(codice_identificativo));
						System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
							
				case 4:
						System.out.println("Elenco di tutti i voli rimanenti nella collection dopo l'eventuale rimozione:");
						System.out.println(alv.toString());
						System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
							
				default :
						System.out.println("Se si vuole uscire dal menù premere un tasto diverso da 0,1,2,3 o 4");
						scelta = s.nextInt();
					break;
			}
		
		}
		while(scelta == 0 || scelta == 1 || scelta ==2 || scelta == 3 || scelta == 4);
		System.out.println("Siete usciti dal menù grazie e buona giornata");
		break;
		
		case 1:
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
					int dim =s.nextInt();
					
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
		break;
		case 2:
			System.out.println(" Inserire un numero per accedere al menù:");
			System.out.println(" Il numero 0 corrisponde al aggiunta di un nuovo operatori:");
			System.out.println(" Il numero 1 corrisponde al elenco di tutti gli operatori:");
			System.out.println(" Il numero 2 corrisponde alla rimozione di un operatore mediante il suo codice identificativo:");
			System.out.println(" Il numero 3 corrisponde alla ricerca di un operatore mediante il suo codice identificativo:");
			System.out.println(" Il numero 4 corrisponde al elenco di tutti gli operatori rimandenti dopo l'eliminazione:");
			System.out.println(" Un numero diverso da 0,1,2,3 e 4 per uscire dal menù:");
			
			do
			{
				scelta = s.nextInt();
				switch (scelta)
				{
				case 0 :
					System.out.println("Quanti operatori si volgiono inserire?");
					 int dim=s.nextInt();
					
					for (int i = 0; i< dim ; i++)
					{
						System.out.println("inserire il nome del operatore:");
						nome = s.next();
						System.out.println("inserire il cognome del operatore:");
						cognome = s.next();
						System.out.println("inserire l'email del operatore:");
						email = s.next();
						System.out.println("inserire la password del operatore:");
						password = s.next();
						System.out.println("inserire il codice identificativo del operatore:");
						codice_identificativo = s.next();
						alo.addOperatore(new Operatore(nome, cognome, email, password, codice_identificativo));
						System.out.println(alo.toString());
					}
					System.out.println("Inserire un nuovo numero se si vuole accedere nuovamente al menù");
					break;
				case 1 :
					System.out.println("Elenco di tutti gli operatori contenuti nella collection:");
					System.out.println(alo.toString());
					System.out.println("Inserire un nuovo numero se si vuole accedere nuovamente al menù:");
					break;
				case 2:
					System.out.println("Rimozione di un operatore mediante il suo codice identificativo:");
					codice_identificativo =s.next();
					alo.rimuoviOperatore(codice_identificativo);
					System.out.println("Inserire un nuovo numero se si vuole accedere nuovamente al menù:");
					break;
				case 3:
					System.out.println("Ricerca di un operatore mediante il suo codice identificativo:");
					codice_identificativo =s.next();
					System.out.println(alo.ricercaOperatore(codice_identificativo));
					System.out.println("Inserire un nuovo numero se si vuole accedere nuovamente al menù:");
					break;
					
				case 4:
					System.out.println("Elenco di tutti gli operatori rimanenti nella collection dopo l'eventuale rimozione:");
					System.out.println(alo.toString());
					System.out.println("Inserire un nuovo numero se si vuole accedere nuovamente al menù:");
					scelta = s.nextInt();
					break;
					
				default :
					System.out.println("Se si vuole uscire dall menù premere un tasto diverso da 0,1,2,3 o 4");
					scelta = s.nextInt();
					break;
				}
				
			}while(scelta == 0 || scelta == 1 || scelta ==2 || scelta == 3);

			System.out.println("Siete usciti dal menù. grazie e buona giornata");
			break;
			
		case 3:
			System.out.println(" Inserire un numero per accedere al menù:");
			System.out.println(" Il numero 0 corrisponde all' aggiunta di una nuova prenotazione:");
			System.out.println(" Il numero 1 corrisponde al elenco di tutte le prenotazioni:");
			System.out.println(" Il numero 2 corrisponde alla rimozione di una prenotazione mediante il suo codice identificativo:");
			System.out.println(" Il numero 3 corrisponde alla ricerca di una prenotazione mediante il suo codice identificativo:");
			System.out.println(" Il numero 4 corrisponde al elenco di tutte le prenotazioni rimandenti dopo l'eliminazione:");
			System.out.println(" Un numero diverso da 0,1,2,3 e 4 per uscire dal menù:");
			
			do
			{
				scelta = s.nextInt();
				String Codice_identificativo;
				switch (scelta)
				{
				
				case 0 :
					System.out.println("Funzionalità di aggiunta di un nuovo volo:");
					System.out.println("Quante prenotazioni si volgiono inserire?");
					int dim=s.nextInt();
					for (int i = 0; i< dim ; i++)
					{peso_bagagli=0.0;
						System.out.println("inserire il numero di bagagli per il volo:");
						numero_bagagli = s.nextInt();
						if(numero_bagagli>=0)
						{
							for(int j=numero_bagagli;j>0 ;j--)
							{
								System.out.println("inserire il peso del bagaglio");	
								peso = s.nextDouble();	
								peso_bagagli=peso+peso_bagagli;
							}
							
							
						}
						p.setPeso_bagagli(peso_bagagli);
						alp.addPrenotazione(new Prenotazione(numero_bagagli,peso_bagagli));		
						System.out.println(alp.toString());
					}
					
					System.out.println("prenotazione aggiunta correttamente"+"\n"+"Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				case 1 :
					System.out.println("Elenco di tutte le prenotazioni contenuti nella collection:");
					System.out.println(alp.toString());
					System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				case 2:
					System.out.println("Rimozione di un prenotazione mediante il suo codice identificativo:"+"\n"+"inerire il codice identificativo del volo da rimuovere:");
					Codice_identificativo = s.next();
					alp.rimuoviPrenotazione(Codice_identificativo);
					System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				case 3:
					System.out.println("Ricerca di un prenotazione mediante il suo codice identificativo:"+"\n"+"inerire il codice identificativo del volo da rimuovere:");
					Codice_identificativo = s.next();
					System.out.println(alp.ricercaPrenotazione(Codice_identificativo));
					System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				case 4:
					System.out.println("Elenco di tutte le prenotazioni rimanenti nella collection dopo l'eventuale rimozione:");
					System.out.println(alp.toString());
					System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				default :
					System.out.println("Se si vuole uscire dal menù premere un tasto diverso da 0,1,2,3 o 4");
					scelta = s.nextInt();
					break;
				}
				
			}while(scelta == 0 || scelta == 1 || scelta ==2 || scelta == 3 || scelta == 4);
		
			System.out.println("Siete usciti dal menù grazie e buona giornata");
			break;
			default :
			System.out.println("Se si vuole uscire dal menù premere un tasto diverso da 0,1,2 o 3");
			scelta = s.nextInt();
			break;
		
		
	}
	
}
while(scelta == 0 || scelta == 1 || scelta ==2 || scelta == 3 || scelta == 4);
System.out.println("Siete usciti dal menù grazie e buona giornata");


try {
	alc.salvaDatiClienti();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

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
		
	}
}
