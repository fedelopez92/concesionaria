package concesionaria;


public class Moto extends Vehiculo {

	private String cilindrada;
	
	public Moto(String marca, String modelo, String cilindrada, Double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		return "Marca: " + this.marca + " // " + "Modelo: " + this.modelo + " // " + "Cilindrada: " + this.cilindrada + " // " + "Precio: " + this.df.format(this.precio);
	}

	
	
	
	
	
	
}
