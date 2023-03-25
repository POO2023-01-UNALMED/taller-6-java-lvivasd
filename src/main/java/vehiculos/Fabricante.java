package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fabricante {
	private String nombre;
	private String pais;
	static ArrayList<Fabricante> fabricantes_lista = new ArrayList<Fabricante>();
	static Map<String, Integer> fabricantes = new HashMap<>();
	
	public Fabricante(String nombre, String pais) {
		this.setNombre(nombre);
		this.setPais(pais);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public String fabricaMayorVentas() {
		int mayor = 0;
		String fabricante = null;
		for(Map.Entry<String, Integer> entry: fabricantes.entrySet()) {
			if (entry.getValue() >  mayor) {
				mayor = entry.getValue();
				fabricante = entry.getKey();
			}
		}
		return fabricante;
	}
}
