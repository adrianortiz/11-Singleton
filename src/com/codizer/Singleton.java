package com.codizer;

/**
 * 
 * @author Adrian
 *
 */
public final class Singleton {
	private static final Singleton singleton = new Singleton();
	
	private Singleton(){
		System.out.println("Singleton activo");
	};
	
	
	/** 
	 * Evita la parte de tener que crear instancias
	 * 
	 * @return singleton
	 */
	public static Singleton getSingleto() {
		return singleton;
	}
}
