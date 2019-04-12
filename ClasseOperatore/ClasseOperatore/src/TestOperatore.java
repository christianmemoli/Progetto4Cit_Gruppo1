import java.util.Scanner;
public class TestOperatore {

	private static Scanner s;
	private static String codice_identificativo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		s = new Scanner (System.in);
		int scelta;
		codice_identificativo = null;
		String nome = null;
		String cognome = null;
		String email = null;
		String password = null;
		ArrayListOperatore alo = new ArrayListOperatore(/*null*/);
		Operatore o =new Operatore();
		
		/*Operatore operatore1 = new Operatore("alessio","basini","ale@basini.com","1234","1");
		Operatore operatore2= new Operatore("fabio","pino","fabio@d.com","567","2");
		Operatore operatore3 = new Operatore("marco","rossi","mario@rossi.com",  "890", "3");
		Operatore operatore4 = new Operatore("mao","rsi","mario@rom",  "8880", "4");
		
		alo.addOperatore(operatore1);
		alo.addOperatore(operatore2);
		alo.addOperatore(operatore3);
		alo.addOperatore(operatore4);
		
		//System.out.println(operatore1.toString());
		//System.out.println(operatore2.toString());
		//System.out.println(operatore3.toString());*/
		
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
				dim=s.nextInt();
				
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
		
	}

}
