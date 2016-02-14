package com.codizer;

/**
 * 
 * @author Adrian
 *
 */
public class main {

	/**
	 * Patrones de Diseño
	 * 
	 * Singleton (Instancia única)
	 * 
	 * 1- Crear una clase de tipo final
	 * 2- Generar una instancia del objeto private static final
	 * 3- contructor de tipo privado
	 * 4- Se creá un getter public static que retorna el objeto
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Singleton single1 = Singleton.getSingleto();
		
		Singleton single2 = Singleton.getSingleto();
		Singleton single3 = Singleton.getSingleto();
		Singleton single4 = Singleton.getSingleto();
		Singleton single5 = Singleton.getSingleto();
	}

}
