package application;
import java.util.Scanner;


public class TestVolo {

	private static int scelta;
	private static Scanner s;
	private static Volo v;

	public static void main(String[] args) {
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

		
		System.out.println(" Inserire un numero per accedere al menù:");
		System.out.println(" Il numero 0 corrisponde all' aggiunta di un nuovo volo:");
		System.out.println(" Il numero 1 corrisponde al elenco di tutti i voli:");
		System.out.println(" Il numero 2 corrisponde alla rimozione di un volo mediante il suo codice identificativo:");
		System.out.println(" Il numero 3 corrisponde alla ricerca di un volo mediante il suo codice identificativo:");
		System.out.println(" Il numero 4 corrisponde al elenco di tutti i voli rimandenti dopo l'eliminazione:");
		System.out.println(" Un numero diverso da 0,1,2,3 e 4 per uscire dal menù:");
		
		do
		{
			scelta = s.nextInt();
			switch (scelta)
			{
			
			case 0 :
				System.out.println("Funzionalità di aggiunta di un nuovo volo:");
				System.out.println("Quante voli si volgiono inserire?");
				dim=s.nextInt();
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
				System.out.println("Volo aggiunto correttamente"+"\n"+"Inserire un nuovo numero per accedere nuovamente nel menù:");
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
			
		}while(scelta == 0 || scelta == 1 || scelta ==2 || scelta == 3 || scelta == 4);
	
		System.out.println("Siete usciti dal menù grazie e buona giornata");

	}
	}


