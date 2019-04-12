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
		
		/*Orario o1 = new Orario(5.35,15);
		Orario o2 = new Orario(8.45,25);
		Orario o3 = new Orario(18.35,23.55);
		Orario o4 = new Orario(15.25,16);
		Orario o5 = new Orario(10.35,19.25);
		
		Data dt1 = new Data (1,"Febbario",2019);
		Data dt2 = new Data (26,"Aprile",2019);
		Data dt3 = new Data (18,"Dicembre",2019);
		Data dt4 = new Data (10,"Ottobre",2019);
		Data dt5 = new Data (30,"Novebre",2019);
		
		Volo volo1 = new Volo("123" ," Milano" , "Roma" , dt1, o1,  90, 500);
		Volo volo2 = new Volo("456" ," Torino" , "Barcellona" , dt2, o2,  10, 100);
		Volo volo3 = new Volo("789" ," Parma" , "Parigi" , dt3, o3,  250, 850);
		Volo volo4 = new Volo("000" ," Tokyo" , "Miami" , dt4, o4,  300, 600);*/

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

		/*alv.addVolo(volo1);
		alv.addVolo(volo2);
		alv.addVolo(volo3);
		alv.addVolo(volo4);*/
		
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


