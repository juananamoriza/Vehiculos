package Vehiculos;

public class Camion extends Vehiculo {

	private short numeroEjes;

	public Camion (short numRuedas) 
	{
		super (numRuedas);
	}

	public Camion (String color, short numRuedas) 
	{
		super (color, numRuedas);
	}

	public Camion (String color, short numRuedas, short cilin) 
	{
		super(color, numRuedas, cilin);
	}

	public Camion (String color, short numRuedas, short cilin, short poten) 
	{
		super(color,numRuedas,cilin,poten);
	}

	public Camion (String col, short numRuedas, short numEjes, short cilin, short poten) 
	{
		super (col, numRuedas, cilin, poten);
		this.numeroEjes = numEjes;
	}
	
	

	public short setNumeroEjes ( )
	{
		return numeroEjes;
	}

	public void getNumeroEjes (short numEjes) 
	{
		this.numeroEjes = numEjes;
	}

}

