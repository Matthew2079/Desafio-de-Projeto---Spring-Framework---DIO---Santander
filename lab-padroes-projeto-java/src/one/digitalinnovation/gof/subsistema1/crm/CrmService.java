package one.digitalinnovation.gof.subsistema1.crm;

public class CrmService {
	
	public CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM: ");	
		System.out.println("Nome: " + nome);
		System.out.println("CEP: " + cep);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
	}

}
