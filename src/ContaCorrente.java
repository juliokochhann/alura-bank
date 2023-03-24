
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);
	}

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
	    super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		double tributo = super.getSaldo() * 0.01;
		return tributo;
	}

}
