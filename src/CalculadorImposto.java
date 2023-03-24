
public class CalculadorImposto {

	private double totalImposto;
	
	public double getImposto() {
		return totalImposto;
	}

	public double calculaImposto(Tributavel t) {
		this.totalImposto += t.getValorImposto();
		return this.totalImposto;
	}
}
