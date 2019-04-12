
public class Date 
{
	private int giorno;
	private int mese;
	private int anno;
	
	public Date()
	{
	
	}
	
	public Date(int giorno,int mese,int anno)
	{
		this.giorno=giorno;
		this.mese=mese;
		this.anno=anno;
	}
	
	public int getGiorno()
	{
		return giorno;
	}
	
	public int getMese()
	{
		return mese;
	}
	
		public int getAnno()
	{
			return anno;
	}
		
	public String toString() 
	{
		return (""+giorno+":"+mese+":"+anno);
	}
	
	
}
