
public class Esfera extends FormaTridimensional implements Area, Volume
{
	private double raio;

	public Esfera(String f, String t, double r) 
	{
		super(f, t);
		setRaio(r);
	}
	
	public void setRaio(double r)
	{
		raio = r;
	}
	
	public double getArea()
	{
		return 4*pi*(raio*raio);
	}
	
	public double getVolume()
	{
		return ((4*pi*(raio*raio*raio))/3);
	}
	
	public String toString()
	{
		return String.format("%s \nO valor da Area da esfera é %.2f \nO Volume é %.2f", super.toString(), getArea(), getVolume());
	}




}
