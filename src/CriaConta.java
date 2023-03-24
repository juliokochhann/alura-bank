
public class CriaConta {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Conta Poupança
		ContaPoupanca primeiraConta = new ContaPoupanca(580, 350367670);
		
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		ContaPoupanca segundaConta = primeiraConta;	// Cria mais uma referência para o mesmo objeto ContaPoupanca
		
		segundaConta.deposita(50);
		System.out.println("Primeira conta tem " + primeiraConta.getSaldo());
		System.out.println("Segunda conta tem " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta);	// Imprime o endereço de memória do objeto criado
		
		System.out.println(primeiraConta.getAgencia());	// Imprime 0, pois todos atributos
														// são inicializados com um valour default
		
		if (primeiraConta == segundaConta)
			System.out.println("Temos um objeto do tipo ContaPoupanca e duas referências para ele");
	}
}
