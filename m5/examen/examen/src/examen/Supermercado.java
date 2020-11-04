package examen;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private Almacen almacen;
	private List<Seccion> listaSecciones;
	private List<Cesta> listaCestas;
	
	public Supermercado(Almacen almaceniones) {

		this.almacen = almacen;
		this.listaSecciones = new ArrayList <Seccion>();
		this.listaCestas = new ArrayList <Cesta>();
	}
	
	public Supermercado() {

		this.almacen = new Almacen();
		this.listaSecciones = new ArrayList<Seccion>();
		this.listaCestas = new ArrayList<Cesta>();
	}
	
	
	public ArrayList<ProductoEnStock> productosDeSeccionEnStock(String idSeccion){
		
		for (Seccion sec:listaSecciones) {
			if (sec.id = idSeccion) {
				
			}
		}
	}
	

}
