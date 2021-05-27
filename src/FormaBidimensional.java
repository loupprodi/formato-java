
public class FormaBidimensional extends Forma 
{
	private String tipoForma;

	public FormaBidimensional(String f, String t)
	{
		super(f);
		setTipo(t);
	}
	
	public void setTipo(String t)
	{
		tipoForma = t;
	}
	
	public String getTipo()
	{
		return tipoForma;
	}
	
	
	public String toString()
	{
		return String.format("%s \nTipo de forma Bidimensional: %s \n", super.toString(), getTipo());
	}
	
}
