package application;
import java.util.ArrayList;

public class ArrayListOperatore {

	private ArrayList<Operatore> list;

	public ArrayListOperatore(/*ArrayList<Operatore> list*/) 
	{
		list = new ArrayList<Operatore>(100);
		this.list = list;
	}
	
	public void addOperatore(Operatore o)
	{
		list.add(o);
	}

	public boolean rimuoviOperatore(String codiceIdentificativo)
	{
		
		for(Operatore operatore : list)
		{
			if(operatore.getCodice_identificativo().compareTo(codiceIdentificativo)==0)
			{
				list.remove(operatore);
				return true ;
			}
		}
		return false;
	}
	
	public String ricercaOperatore(String codiceIdentificativo)
	{
		
		for(Operatore operatore : list)
		{
			if(operatore.getCodice_identificativo().compareTo(codiceIdentificativo)==0)
			{
				return operatore.toString() ;
			}
		}
		return null ;
	}

	@Override
	public String toString() {
		return "" + list +"";
	}
	
	
	
}
