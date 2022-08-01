package one.digitalinnovation.gof.strategy;

public class ComportamentoAgresivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente.....");
	}

}
