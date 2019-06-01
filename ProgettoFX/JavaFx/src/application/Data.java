package application;

public class Data implements java.io.Serializable {

	private int giorno;
	private String mese;
	private int anno;
	
	
	public Data(int giorno, String mese, int anno) 
	{
		super();
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}
	
	public Data()
	{

	}
	
	public Data(Data d)
	{
		super();
		this.giorno = d.giorno;
		this.mese = d.mese;
		this.anno = d.anno;
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public String getMese() {
		return mese;
	}

	public void setMese(String mese) {
		this.mese = mese;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "[giorno=" + giorno + ", mese=" + mese + ", anno=" + anno + "]";
	}	
	
	
	
}
