package control;

public class ExcecaoClientes extends Exception {
    private static final long serialVersionUID = 1L;

	public ExcecaoClientes (String msg)
	{	super(msg);
	}
	
	public ExcecaoClientes()
	{	}
}