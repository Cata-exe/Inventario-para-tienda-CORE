package com.clases;
import java.util.ArrayList;

public class TiendaElectronica {
	private ArrayList<ProductoElectrodomestico> listaDeProductos;

	public TiendaElectronica() {
		this.listaDeProductos = new ArrayList<>();
	}
	
	public void agregarProducto(ProductoElectrodomestico Producto) {
		listaDeProductos.add(Producto);
	}
	
	public void mostrarInventario() {
		for (ProductoElectrodomestico inventarioTienda : listaDeProductos) {
			inventarioTienda.mostrarInformacion();
		}
	}
	
	public ProductoElectrodomestico buscarProducto(String nombre) {
		for (ProductoElectrodomestico inventarioTienda : listaDeProductos) {
			if(inventarioTienda.getNombre() == nombre) {
				return inventarioTienda;
			}
		}
		return null;
	}
	
	public void ventaProducto(String nombreProducto) {
		ProductoElectrodomestico producto = buscarProducto(nombreProducto);
		if(producto.getCantidadDisponible() > 0) {
			producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
			System.out.println(producto.getCantidadDisponible());
		}
		else {
			System.out.println("Producto agotado");
		}
				
	}
}
