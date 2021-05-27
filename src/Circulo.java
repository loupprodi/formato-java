
public class Circulo extends FormaBidimensional implements Area
{
	
	private double raio;

	public Circulo(String f, String t, double r) 
	{
		super(f,t);
		setRaio(r);
	}
	
	public void setRaio (double r)
	{
		raio = r;
	}
	
	public double getArea()
	{
		return pi*(raio*raio);
	}
	
	public String toString()
	{
		return String.format("%s \n A Area do Circulo é: %.2f", super.toString(), getArea());
	}


}
