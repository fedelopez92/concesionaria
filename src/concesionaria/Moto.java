package concesionaria;

import java.text.DecimalFormat;

public class Moto implements Vehiculo {

	private String marca;
	private String modelo;
	private Double precio;
	private String cilindrada;
	private DecimalFormat df;
	
	
	public Moto(String marca, String modelo, String cilindrada, Double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
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
	
	public String getCilindrada() {
		return cilindrada;
	}
	
	@Override
	public String toString() {
		return "Marca: " + this.marca + " // " + "Modelo: " + this.modelo + " // " + "Cilindrada: " + this.cilindrada + " // " + "Precio: " + this.df.format(this.precio);
	}

	
	
	
	
	
	
}
