package vehiculos;

public class Camioneta extends Vehículo{
	private boolean volco;
	public static int CantidadCamionetas = 0;
	public Camioneta(boolean volco, String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.setVolco(volco);
		CantidadCamionetas += 1;
	}
	
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}
