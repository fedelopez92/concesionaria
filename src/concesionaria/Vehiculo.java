package concesionaria;

import java.text.DecimalFormat;

public abstract class Vehiculo {
	
	protected String marca;
	protected String modelo;
	protected Double precio;
	protected DecimalFormat df;
	
	public Vehiculo(String marca, String modelo, Double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.df = new DecimalFormat("$###,###.00");
	}

	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public DecimalFormat getFormat() {
		return this.df;
	}

}
