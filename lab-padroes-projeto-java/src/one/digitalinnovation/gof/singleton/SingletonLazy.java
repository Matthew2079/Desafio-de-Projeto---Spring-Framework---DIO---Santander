package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Preguiçoso".
 * 
 * @author Matthew2079
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null)
			instancia = new SingletonLazy();
		return instancia;
	}
	
	

}
