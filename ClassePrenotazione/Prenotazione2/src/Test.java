import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)  {
		
		Date d1 = new Date(11,"Novembre",2001);
		Date d2 = new Date(16,"Dicembre",1999);
		Date d3 = new Date(05,"Marzo",2001);
		Date d4 = new Date(16,"Agosto",2001);
		Cliente c1 = null;
		Cliente c2 = null;
		Cliente c3 = null;
		Cliente c4 = null;
		try {
			c1 = new Cliente("Basini", "Alessio", "Italia", "Parma", d1 , "alessiobasini01@gmail.com", "abcd123");
		}
		catch(EccezioneException e) {
			System.out.print(e);
		}
		try {
			c2 = new Cliente("Zolesi", "Andrea", "Italia", "Fidenza", d2 , "zolesiandrea99@gmail.com", "abcd456");
			}
			catch(EccezioneException e) {
				System.out.print(e);
			}
		try {
			 c3 = new Cliente("Cordoni", "James", "Italia", "Piacenza", d3 , "cordonijames01@gmail.com", "abcd789");
			}
			catch(EccezioneException e) {
				System.out.print(e);
			}
		try {
			 c4 = new Cliente("Cavalli", "Aurora", "Italia", "Parma", d4, "cavalliaurora01@gmail.com", "abcd000");
			}
			catch(EccezioneException e) {
				System.out.print(e);
			}
		
		
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
		
		ArrayListCliente clienti = new ArrayListCliente();
		clienti.addCliente(c1);
		clienti.addCliente(c2);
	    clienti.addCliente(c3);
	    clienti.addCliente(c4);
		clienti.StampaLista();
		try {
			clienti.salvaDatiClienti();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c1.toStringCodice());
		System.out.println(c2.toStringCodice());
		System.out.println(c3.toStringCodice());
		System.out.println(c4.toStringCodice());
		
		
		/*Cliente cliente = new Cliente();
		Scanner loginCliente = new Scanner (System.in);
		System.out.println("Inserisci email");
		cliente.setEmail(loginCliente.nextLine());
		System.out.println("Inserisci password");
		cliente.setPassword(loginCliente.nextLine());
		System.out.println(cliente.toString());
		*/
		
	}

}
