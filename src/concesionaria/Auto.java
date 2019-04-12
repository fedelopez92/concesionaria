package concesionaria;


public class Auto extends Vehiculo{
	
	private Integer puertas;
	
	public Auto(String marca, String modelo, Integer puertas, Double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}
		
	@Override
	public String toString() {
		return "Marca: " + this.marca + " // " + "Modelo: " + this.modelo + " // " + "Puertas: " + this.puertas + " // " + "Precio: " + this.df.format(this.precio);
	}
	
}
