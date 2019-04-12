package concesionaria;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		//Crea instancias de la clase "Auto"
		Auto a1 = new Auto("Peugeot", "206", 4, 200000.00);
		Auto a2 = new Auto("Peugeot", "208", 5, 250000.00);
		
		//Crea instancias de la clase "Moto"
		Moto m1 = new Moto("Honda", "Titan", "125c", 60000.00);
		Moto m2 = new Moto("Yamaha", "YBR", "160c", 80500.50);
		
		try {
			
			//Crea una lista de veh�culos
			List<Vehiculo> listaVehiculos = Arrays.asList(a1, m1, a2, m2);
			
			//Recorre la lista de veh�culos y la muestra por consola
			for(Vehiculo v : listaVehiculos) {
				System.out.println(v);
			}
			
			
			System.out.println("=============================");
			
			
			//Busca el veh�culo m�s caro y lo asigna a un objeto "Vehiculo"
			Vehiculo vMax = listaVehiculos.stream()
									.max(Comparator.comparingDouble(Vehiculo::getPrecio))
									.get();

			//Muestra por consola el veh�culo
			System.out.println("Veh�culo m�s caro: " + vMax.getMarca() + " " + vMax.getModelo());
			
			
			
			//Busca el veh�culo m�s barato y lo asigna a un objeto "Vehiculo"
			Vehiculo vMin = listaVehiculos.stream()
					.min(Comparator.comparingDouble(Vehiculo::getPrecio))
					.get();
			
			//Muestra por consola el veh�culo
			System.out.println("Veh�culo m�s barato: " + vMin.getMarca() + " " + vMin.getModelo());
			
			
			//Recorre la lista de veh�culos y muestra solo los modelos que contienen 'Y'
			for(Vehiculo v : listaVehiculos) {
				if(v.getModelo().toUpperCase().indexOf('Y') != -1) {
					System.out.println("Veh�culo que contiene en el modelo la letra 'Y': " + v.getMarca() + " " + v.getModelo() + " " + v.getFormat().format(v.getPrecio()));
				}
			}
		}
		catch(Exception e) {
		
			System.out.println(e.getMessage());
		}
		
		

	}
}
