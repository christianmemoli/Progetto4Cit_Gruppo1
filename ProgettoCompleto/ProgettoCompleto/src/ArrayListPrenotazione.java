import java.util.ArrayList;
public class ArrayListPrenotazione {

	private ArrayList<Prenotazione> list;
	public ArrayListPrenotazione(/*ArrayList<Operatore> list*/) 
	{
		list = new ArrayList<Prenotazione>(100);
		this.list = list;
	}
	
	public void addPrenotazione(Prenotazione p)
	{
		list.add(p);
	}

	public boolean CreaNuovaPrenotazione()
	{
		Prenotazione p = new Prenotazione();
		list.add(p);
		return true;
	}
	
	public boolean rimuoviPrenotazione(String Codice_identificativo)
	{
		
		for(Prenotazione Prenotazioni : list)
		{
			if(Prenotazioni.getCodice_identificativo().compareTo(Codice_identificativo)==0)
			{
				list.remove(Prenotazioni);
				return true ;
			}
		}
		return false;
	}
	
	public String ricercaPrenotazione(String Codice_identificativo)
	{
		
		for(Prenotazione Prenotazioni : list)
		{
			if(Prenotazioni.getCodice_identificativo().compareTo(Codice_identificativo)==0)
			{
				return Prenotazioni.toString() ;
			}
		}
		return null ;
	}
	
	

	@Override
	public String toString() {
		return "" + list +"";
	}
}
