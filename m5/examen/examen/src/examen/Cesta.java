package examen;

import java.util.ArrayList;
import java.util.List;

public class Cesta {
	private String nCliente;
	private String direccion;
	private List<ProductoVendido> ListaProductoVendidos;
	
	public Cesta(String nCliente, String direccion) {
		
		this.nCliente = nCliente;
		this.direccion = direccion;
		ListaProductoVendidos = new ArrayList <ProductoVendido>();
	}
	
	
}
