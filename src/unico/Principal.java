package unico;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Map compa = new HashMap<Integer , String>();
		
		String dni = null;
		String nombre;
		Integer clave;
		
		while(dni != "Salir") {
			System.out.println("Ingresa el Dni ('Salir' para parar): ");
			dni = teclado.nextLine();
			if(dni.equalsIgnoreCase("salir")) {
				break;
			}else {
				System.out.println("Ingresa el Nombre: ");
				nombre = teclado.nextLine();
				clave = calcularClave(dni);
				compa.put(clave, nombre);
				System.out.println("La clave " + clave + " está asociada al nombre " + compa.get(clave));
			}
		}

		System.out.println(compa);
		
	}

	private static Integer calcularClave(String dni) {
		Integer clave = 0;
		for(int i = 0; i<dni.length(); i++) {
			if(Character.isDigit(dni.charAt(i))) {
				clave += Character.getNumericValue(dni.charAt(i));
			}
		}
		return clave;
	}
	
	
	
}
