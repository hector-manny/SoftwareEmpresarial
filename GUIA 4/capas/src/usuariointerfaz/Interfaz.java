package usuariointerfaz;

import java.util.Scanner;
import datos.contacto;
import negocios.Agenda;

public class Interfaz {

	static Scanner entrada = new Scanner(System.in);
	static Agenda libro = new Agenda();
	
	public static void lectura() {
		System.out.println("Bienvenido");
		System.out.println("Elija una opción");
		
		imprimirMenu();
	}
	
	private static void validar() {
		System.out.println("Ingresar nuevo contacto");
		System.out.println("Ingrese la información del contacto");
		System.out.println("El nombre debe contener máximo 10 caracteres");
		System.out.println
	}
}
