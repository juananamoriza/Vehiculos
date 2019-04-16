package Vehiculos;

public class Prueba {

	public static void ver(Vehiculo h) {
		
		System.out.println(h.toString());
		
	}
	
	public static void main(String[] args) {
		
		Motocicleta m = new Motocicleta("Rojo", (short)100, (short)100);
		Camion c = new Camion((short) 4);
		Vehiculo h = new Vehiculo(100);
		
		ver(m);
		ver(c);
		ver(h);
		
	}
	
}
