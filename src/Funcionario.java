
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	// protected double salario; Usar com a implementacao comentada na classe Gerente
	private double salario;
	
	// Método sem corpo/implementação
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}

// Uma classe abstrata representa um conceito, algo abstrato, e o compilador 
// não permite instanciar um objeto dessa classe. Para instanciar é preciso 
// criar primeiro uma classe filha não abstrata.
// No entanto, ainda podemos ter um ou mais construtores implementados que podem
// ser chamados nas classes filhas através do super();
