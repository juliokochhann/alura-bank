
public class TransfereConta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente contaJulio = new ContaCorrente(580, 350367670);
		
		contaJulio.setTitular(new Cliente());
		contaJulio.getTitular().setNome("Julio");
		contaJulio.getTitular().getEndereco().setNumero(208);
		
		System.out.println(contaJulio.getTitular().getNome());
		System.out.println(contaJulio.getTitular().getEndereco().getNumero());
		System.out.println(contaJulio.getTitular().getEndereco().getRua());	// rua não foi definido = null
		
		contaJulio.deposita(150);
		System.out.println(contaJulio.getSaldo());
		
		contaJulio.saca(20);
		System.out.println(contaJulio.getSaldo());
		
		ContaCorrente contaLuiza = new ContaCorrente(124, 123456789);
		contaLuiza.deposita(1000);
		contaLuiza.transfere(300, contaJulio);
		System.out.println(contaJulio.getSaldo());
		System.out.println(contaLuiza.getSaldo());
		
		// imprime total de contas criadas
		System.out.println(Conta.getTotal());
	}
}

// Os métodos diferem das funções (como nas linguagens procedurais)
// pois possuem um "sujeito" que invoca um método e realiza uma ação.
// Essa referência ao "sujeito" (instância do objeto) que invoca um método 
// é referenciada pelo "this" dentro do método em questão.
// Nas linguagens procedurais este "sujeito" tende a ser o "predicado", isto é,
// precisamos passar sua referência como um parâmetro da função.
// Ex.:
//								sujeito			predicado
// 		tranfere(double valor, Conta origem, Conta destino);
// Já em OOP:
//			sujeito								predicado
//		contaOrigem.transfere(double valor, Conta destino);
