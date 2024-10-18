package com;

import com.clases.ComputadoraPortatil;
import com.clases.Televisor;
import com.clases.TiendaElectronica;

public class Aplicacion {

	public static void main(String[] args) {
		
		TiendaElectronica tienda = new TiendaElectronica();
		
		Televisor televisor1 = new Televisor("Televisor Samsung", 260000, 10, 32, "1366 x 768 pixeles");
		Televisor televisor2 = new Televisor("Televisor Philips", 350000, 15, 43, "1920x1080 pixeles");
		
		ComputadoraPortatil computadora1 = new ComputadoraPortatil("Notebook Gamer", 1099990, 5, "Lenovo", 16, "15IAX9");
		ComputadoraPortatil computadora2 = new ComputadoraPortatil("Notebook", 599990, 12, "Acer", 8, "ASPIRE 3 A315-24P-R8SM-1");
		
		tienda.agregarProducto(televisor1);
		tienda.agregarProducto(televisor2);
		tienda.agregarProducto(computadora1);
		tienda.agregarProducto(computadora2);
		
		/* Ventas */
		
		tienda.ventaProducto(computadora1.getNombre());
		tienda.ventaProducto(televisor1.getNombre());
		tienda.ventaProducto(televisor2.getNombre());
		tienda.ventaProducto(computadora2.getNombre());
		
		tienda.mostrarInventario();
	}

}
