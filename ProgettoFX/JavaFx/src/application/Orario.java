package application;

public class Orario implements java.io.Serializable  {

	private Float orario_partenza;
	private Float orario_arrivo;
	
	
	public Orario(Float orario_partenza, Float orario_arrivo) 
	{
		super();
		this.orario_partenza = orario_partenza;
		this.orario_arrivo = orario_arrivo;
	}
	
	public Orario() 
	{
		
	}
	public Orario(Orario o) 
	{
		this.orario_partenza = o.orario_partenza;
		this.orario_arrivo = o.orario_arrivo;
	}

	public Float getOrario_partenza() {
		return orario_partenza;
	}

	public void setOrario_partenza(Float orario_partenza) {
		this.orario_partenza = orario_partenza;
	}

	public Float getOrario_arrivo() {
		return orario_arrivo;
	}

	public void setOrario_arrivo(Float orario_arrivo) {
		this.orario_arrivo = orario_arrivo;
	}

	@Override
	public String toString() {
		return "[orario_partenza=" + orario_partenza + ", orario_arrivo=" + orario_arrivo + "]";
	}
	
	
}
