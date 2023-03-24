
public class Programador extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

}
