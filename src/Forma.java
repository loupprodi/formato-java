
public abstract class Forma 
{
	private String forma;
	protected double pi = 3.14;
	
	public Forma (String f)
	{
		setForma(f);
	}
	
	public void setForma(String f)
	{
		forma = f;
	}
	
	public String getForma()
	{
		return forma;
	}
	
	
	public String toString()
	{
		return String.format("Tipo de forma: %s \n", getForma());
	}
	
}
