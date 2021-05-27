
public class Cubo extends FormaTridimensional implements Area, Volume 
{
	private double lado;

	public Cubo(String f, String t, double l) 
	{
		super(f, t);
		setLado(l);
	}
	
	public void setLado(double l)
	{
		lado = l;
	}
	
	public double getArea()
	{
		return 6*(lado*lado);
	}
	
	public double getVolume()
	{
		return lado*lado*lado;
	}
	
	public String toString()
	{
		return String.format("%s \nO valor da Area do cubo é %.2f \nO Volume é %.2f", super.toString(), getArea(), getVolume());
	}

}
