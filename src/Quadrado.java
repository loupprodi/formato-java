
public class Quadrado extends FormaBidimensional implements Area
{
	private double lado;

	public Quadrado(String f, String t, double l) 
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
		return lado*lado;
	}
	
	public String toString()
	{
		return String.format("%s \n A Area do Quadrado é: %.2f", super.toString(), getArea());
	}

}
