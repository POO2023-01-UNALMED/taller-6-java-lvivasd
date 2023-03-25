package vehiculos;

public class Automóvil extends Vehículo{
	private int puestos;
	public static int CantidadAutomóviles = 0;
	public Automóvil(int puestos, String placa, String nombre, int precio, int peso, Fabricante fabricante) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.setPuestos(puestos);
		CantidadAutomóviles += 1;
	}
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
