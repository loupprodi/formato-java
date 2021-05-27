
public class FormaTridimensional extends Forma 
{
	private String tipo;

	public FormaTridimensional(String f, String t) 
	{
		super(f);
		setTipo(t);
	}
	
	public void setTipo(String t)
	{
		tipo = t;
	}
	
	public String getTipo()
	{
		return tipo;
	}
	
	
	public String toString()
	{
		return String.format("%s \nTipo de forma Tridimensional: %s \n", super.toString(), getTipo());
	}

}
