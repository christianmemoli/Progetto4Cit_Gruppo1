import java.util.ArrayList;

public class ArrayListVolo {

	private ArrayList<Volo> list;

	public ArrayListVolo(/*ArrayList<Operatore> list*/) 
	{
		list = new ArrayList<Volo>(100);
		this.list = list;
	}
	
	public void addVolo(Volo v)
	{
		list.add(v);
	}

	public boolean CreaNuovoVolo(String codice_volo, String aeroporto_di_partenza, String aeroporto_di_arrivo, Data data_volo,
			Orario ora_partenza, int numero_posti, float costo_volo)
	{
		Volo v = new Volo(codice_volo,aeroporto_di_partenza,aeroporto_di_arrivo,data_volo, ora_partenza,numero_posti,costo_volo);
		list.add(v);
		return true;
	}
	
	public boolean rimuoviVolo(String codice_volo)
	{
		
		for(Volo voli : list)
		{
			if(voli.getCodice_volo().compareTo(codice_volo)==0)
			{
				list.remove(voli);
				return true ;
			}
		}
		return false;
	}
	
	public String ricercaVolo(String codice_volo)
	{
		
		for(Volo voli : list)
		{
			if(voli.getCodice_volo().compareTo(codice_volo)==0)
			{
				return voli.toString() ;
			}
		}
		return null ;
	}

	@Override
	public String toString() {
		return "" + list +"]";
	}
	
	
}
