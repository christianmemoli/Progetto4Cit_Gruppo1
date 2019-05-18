
public class Prenotazione extends Cliente {

	private int numero_bagagli;
	private double peso_bagagli;
	
	public Prenotazione(int numero_bagagli, double peso_bagagli) 
	{
		this.numero_bagagli = numero_bagagli;
		this.peso_bagagli = peso_bagagli;
	}
	public Prenotazione() 
	{

	}
	public Prenotazione(Prenotazione p) 
	{
		this.numero_bagagli = p.numero_bagagli;
		this.peso_bagagli = p.peso_bagagli;
	}
	public int getNumero_bagagli() {
		return numero_bagagli;
	}
	public void setNumero_bagagli(int numero_bagagli) {
		this.numero_bagagli = numero_bagagli;
	}
	public double getPeso_bagagli() {
		return peso_bagagli;
	}
	public void setPeso_bagagli(double peso_bagagli) {
		this.peso_bagagli = peso_bagagli;
	}
	
	public Double pesoTotaleBagagli( )
	{
		double peso_totale_bagagli=0;
		
		if(this.getNumero_bagagli()>=0)
		{
			for(int j=this.getNumero_bagagli();j>0 ;j--)
			{
				peso_totale_bagagli=peso_totale_bagagli+this.getPeso_bagagli();
			}
		}
		return peso_totale_bagagli;
	}
	
	
	@Override
	public String toString() {
		return "Prenotazione numero_bagagli=" + numero_bagagli + ", peso_bagagli=" + peso_bagagli + "\n";
	}
	
	
}
