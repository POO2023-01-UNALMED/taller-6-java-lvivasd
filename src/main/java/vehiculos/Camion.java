package vehiculos;

public class Camion extends Vehículo{
	private int ejes;
	public static int CantidadCamiones = 0;
	public Camion(int ejes, String placa, String nombre, int precio, int peso, Fabricante fabricante) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.setEjes(ejes);
		CantidadCamiones += 1;
	}
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
