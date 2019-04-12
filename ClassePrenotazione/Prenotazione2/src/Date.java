
public class Date implements java.io.Serializable{
	private int giorno;
	private String mese;
	private int anno;
	
	public Date(int giorno, String mese, int anno) {
		super();
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}
	
	public Date() {
		
	}
	
	public Date(Date d) {
		super();
		this.giorno =d.giorno;
		this.mese =d.mese;
		this.anno =d.anno;
	}

	/**
	 * @return the giorno
	 */
	public int getGiorno() {
		return giorno;
	}

	/**
	 * @param giorno the giorno to set
	 */
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	/**
	 * @return the mese
	 */
	public String getMese() {
		return mese;
	}

	/**
	 * @param mese the mese to set
	 */
	public void setMese(String mese) {
		this.mese = mese;
	}

	/**
	 * @return the anno
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(int anno) {
		this.anno = anno;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "" + giorno + " " + mese + " " + anno + "";
	}
	
	
	
}
