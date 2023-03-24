
public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		// Tributavel t = cc;
		CalculadorImposto ci = new CalculadorImposto();
		
		cc.deposita(200);
		System.out.println("Saldo: " + cc.getSaldo());
		ci.calculaImposto(cc);
		System.out.println("Imposto: " + ci.getImposto());
	}

}
