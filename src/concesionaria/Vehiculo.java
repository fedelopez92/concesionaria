package concesionaria;

import java.text.DecimalFormat;

public interface Vehiculo {
	
	public String getMarca();
	
	public String getModelo();
	
	public Double getPrecio();
	
	public DecimalFormat getFormat();
	
}
