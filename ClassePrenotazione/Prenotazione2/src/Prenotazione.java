
public class Prenotazione extends Cliente {

	private int numero_bagagli;
	private double peso_bagalgi;
	
	public Prenotazione(int numero_bagagli, double peso_bagalgi) 
	{
		this.numero_bagagli = numero_bagagli;
		this.peso_bagalgi = peso_bagalgi;
	}
	public Prenotazione() 
	{

	}
	public Prenotazione(Prenotazione p) 
	{
		this.numero_bagagli = p.numero_bagagli;
		this.peso_bagalgi = p.peso_bagalgi;
	}
	public int getNumero_bagagli() {
		return numero_bagagli;
	}
	public void setNumero_bagagli(int numero_bagagli) {
		this.numero_bagagli = numero_bagagli;
	}
	public double getPeso_bagalgi() {
		return peso_bagalgi;
	}
	public void setPeso_bagalgi(double peso_bagalgi) {
		this.peso_bagalgi = peso_bagalgi;
	}
	@Override
	public String toString() {
		return "Prenotazione [numero_bagagli=" + numero_bagagli + ", peso_bagalgi=" + peso_bagalgi + "]";
	}
	
	
}
