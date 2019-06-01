package application;
import java.util.Scanner;
public class TestPrenotazione {

	private static int scelta;
	private static Scanner s;
	private static Prenotazione p;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			s = new Scanner (System.in);
			int numero_bagagli = 0  ;
			Double peso_bagagli = null ;	
			ArrayListPrenotazione alp = new ArrayListPrenotazione(/*null*/);
			p = new Prenotazione();
			

			System.out.println("Quante prenotazioni si volgiono inserire?");
			int dim=s.nextInt();
			double peso;
			
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
					dim=s.nextInt();
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

		}
	}

