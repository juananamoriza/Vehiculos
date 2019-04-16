package Vehiculos;

public class Motocicleta extends Vehiculo{
	
	private short numeroPlazas;
	

	public Motocicleta (short numPlazas)
	{
		super(numPlazas);
		super.setNumeroRuedas((short) 2);
	}
	
	public Motocicleta (String color)
	{
		super(color);
		super.setNumeroRuedas((short) 2);
	}
	
	public Motocicleta (String color,short cilin)
	{
		super(color, cilin);
		super.setNumeroRuedas((short) 2);
	}
	
	public Motocicleta (String color,short cilin,short poten)
	{
		super(color,cilin,poten);
		super.setNumeroRuedas((short) 2);
	}
	
	
	public short getNumeroPlazas()
	{
		return numeroPlazas;
	}
	public void setNumeroPlazas(short num)
	{
		numeroPlazas=num;
	}


//	public void verMoto ()
//	{
//		System.out.println("El camion es de color "+getColor());
//		System.out.println("Tiene "+getNumRuedas()+" numero de ruedas");
//		System.out.println("Con una cilindrada de"+getCilindrada());
//		System.out.println("Y una potencia de"+getPotencia());
//		System.out.println("Tiene "+numeroPlazas+" numero de plazas");
//	}
}
