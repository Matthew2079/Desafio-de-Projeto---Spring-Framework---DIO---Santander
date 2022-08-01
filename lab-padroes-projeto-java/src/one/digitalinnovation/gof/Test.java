package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgresivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Padrão Criacional - Singleton
		/* Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.*/
		System.out.println("Padrão Criacional - Singleton");
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy + "\n");

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager + "\n");
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder + "\n");
		
		System.out.println("---------------------------------------------" + "\n");
		

		// Padrão Comportamental - Strategy
		/* Simplificar a variação de algoritmos para a resolução de um mesmo problema.*/
		System.out.println("Padrão Comportamental - Strategy");
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgresivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		System.out.println("---------------------------------------------" + "\n");
		
		// Padrão Estrutural - Facade
		/* Prover uma interface que reduza a complexidade nas integrações com subsistemas. */
		System.out.println("Padrão Estrutural - Facade");
		
		Facade facade = new Facade();
		facade.migrarCliente("Mateus", "13552880");		
		
	}

}
