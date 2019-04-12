import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListCliente 
{
	private ArrayList<Cliente> list;

	public ArrayListCliente() 
	{
		list = new ArrayList<>(20);

	}
	
	public void addCliente(Cliente c)
	{
		list.add(c);
	}
	
	public boolean rimuoviCliente(String codice_identificativo)
	{
		/*for(int i=0; i<list.size();i++)
		{
			if(titolo == this.)
			{
				return true;
			}
		}*/
		for(Cliente cliente : list)
		{
			if(cliente.getCodice_identificativo().compareTo(codice_identificativo)==0)
			{
				list.remove(cliente);
				return false;
			}
		}
		return false;		
}
	
	public void salvaDatiClienti() throws java.io.IOException {
		ObjectOutputStream stream =
				new ObjectOutputStream(new FileOutputStream("registrazione.bin"));
		stream.writeObject(this.list);
		stream.close();
	}
	public void caricaDatiCliente() throws java.io.IOException {
		
		try
		{
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream("registrazione.bin"));
			list  = (ArrayList<Cliente>)stream.readObject();
			stream.close();
		}
		
		catch(IOException e)
		{
			// da rivedere
			
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void StampaLista()
	{
		System.out.println(this.list.size());
		for (Cliente cliente : list) {
			System.out.println(cliente.getCognome());
			System.out.println(cliente.getNome());
			System.out.println(cliente.getNazione_di_nascita());
			System.out.println(cliente.getCitta_di_nascita());
			System.out.println(cliente.getData_di_nascita());
			System.out.println(cliente.toStringCodice());
			System.out.println(cliente.getEmail());
			System.out.println(cliente.getPassword());
			
			
			System.out.println();
			System.out.println();
		}
	}
		
	
}
