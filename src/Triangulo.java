
public class Triangulo extends FormaBidimensional implements Area
{
	private double base;
	private double altura;

	public Triangulo(String f, String t, double b, double h) 
	{
		super(f, t);
		setBase(b);
		setAltura(h);
	}
	
	public void setBase(double b)
	{
		base = b;
	}
	public void setAltura(double h)
	{
		altura = h;
	}
	
	public double getArea()
	{
		return (base*altura)/2;
	}
	
	public String toString()
	{
		return String.format("%s \n A Area do Triangulo é: %.2f", super.toString(), getArea());
	}

}
