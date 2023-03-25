package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	public static int CantidadAutomoviles = 0;
	public Automovil(int puestos, String placa, String nombre, int precio, int peso, Fabricante fabricante) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.setPuestos(puestos);
		CantidadAutomoviles += 1;
	}
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
