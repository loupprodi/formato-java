import java.lang.Math;
 
public class Tetraedo extends FormaTridimensional implements Area, Volume 
{
	private double aresta;

	public Tetraedo(String f, String t, double a) 
	{
		super(f, t);
		setAresta(a);
	}
	
	public void setAresta (double a)
	{
		aresta = a;
	}
	
	public double getArea()
	{
		return ((aresta*aresta)*Math.sqrt(3));
	}
	
	public double getVolume()
	{
		return ((((aresta*aresta)* Math.sqrt(3))/4)*((aresta*Math.sqrt(6))/3))/3; 
	}
	
	public String toString()
	{
		return String.format("%s \nO valor da Area do tetraedo é %.2f \nO Volume é %.2f", super.toString(), getArea(), getVolume());
	}

}
