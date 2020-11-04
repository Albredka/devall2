package examen;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
	protected String id;
	protected List<ProductoEnStock> listaProductosEnStock;
	
	public Seccion(String id) {
		this.id = id;
		this.listaProductosEnStock = new ArrayList<ProductoEnStock>();
	}
	
	
}
