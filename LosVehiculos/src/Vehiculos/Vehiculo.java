package Vehiculos;

public class Vehiculo {

		private String color;
		private short numeroRuedas;
		private int cilindrada;
		private short potencia;

		public Vehiculo (String col)
		{
			this.color = col;
		}

		public Vehiculo (short numRuedas)
		{
			this.numeroRuedas = numRuedas;
		}

		public Vehiculo (int cilin) 
		{
			this.cilindrada = cilin;
		}

		public Vehiculo (String col, short numRuedas) 
		{
			this.color = col;
			this.numeroRuedas = numRuedas; 
		}

		public Vehiculo (String col, short numRuedas, short cilin) 
		{
			this.color = col;
			this.numeroRuedas = numRuedas;
			this.cilindrada = cilin;
		} 

		public Vehiculo (String col, short numRuedas, short cilin, short pot)
		{
			this.color = col;
			this.numeroRuedas = numRuedas;
			this.cilindrada = cilin;
			this.potencia = pot;
		}


		public String getColor ( ) 
		{
			return color;
		}
		
		public short getNumRuedas ( ) 
		{
			return numeroRuedas;
		} 
		
		 public int getCilindrada ( )
		 {
			 return cilindrada;
		 }

		 public short getPotencia ( ) 
		 {
			 return potencia;
		 }

		 public void setColor (String col) 
		 {
			 this.color = col;
		 } 
		 public void setNumeroRuedas (short numRuedas) 
		 {
			 this.numeroRuedas = numRuedas;
		 } 
}


