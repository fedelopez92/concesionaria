package concesionaria;

import java.text.DecimalFormat;

public class Auto implements Vehiculo{
	
	private String marca;
	private String modelo;
	private Double precio;
	private Integer puertas;
	private DecimalFormat df;
	
	public Auto(String marca, String modelo, Integer puertas, Double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.puertas = puertas;
		this.precio = precio;
		this.df = new DecimalFormat("$###,###.00");
	}
	
	@Override
	public String getMarca() {
		return this.marca;
	}
	@Override
	public String getModelo() {
		return this.modelo;
	}
	@Override
	public Double getPrecio() {
		return this.precio;
	}
	
	@Override
	public DecimalFormat getFormat() {
		return this.df;
	}
	
	public Integer getPuertas() {
		return this.puertas;
	}
	
	@Override
	public String toString() {
		return "Marca: " + this.marca + " // " + "Modelo: " + this.modelo + " // " + "Puertas: " + this.puertas + " // " + "Precio: " + this.df.format(this.precio);
	}
	
}
