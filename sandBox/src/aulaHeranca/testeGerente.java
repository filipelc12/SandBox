package aulaHeranca;

public class testeGerente {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Filipe");
		g1.setCpf("011.809.450-50");
		g1.setSalario(5000.0);
		
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
	}

}
