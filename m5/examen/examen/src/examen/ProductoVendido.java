package examen;

public class ProductoVendido extends Producto {
	
	private int unidadesVendidas;

	public ProductoVendido(String id, String nombre, String fabricante, 
			double precioUnidadEU, int unidadesVendidas) {
		
		super(id, nombre, fabricante, precioUnidadEU);
		this.unidadesVendidas = unidadesVendidas;
	}
	
	
}
