package usuariointerfaz;

import java.util.Scanner;
import datos.contacto;
import negocios.Agenda;

public class Interfaz {

	static Scanner entrada = new Scanner(System.in);
	static Agenda libro = new Agenda();
	
	public static void lectura() {
		System.out.println("Bienvenido");
		System.out.println("Elija una opci�n");
		
		imprimirMenu();
	}
	
	private static void validar() {
		System.out.println("Ingresar nuevo contacto");
		System.out.println("Ingrese la informaci�n del contacto");
		System.out.println("El nombre debe contener m�ximo 10 caracteres");
		System.out.println
	}
}
