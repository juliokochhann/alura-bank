
public abstract class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;	// Composição
    private static int total;	// static faz do atributo um membro da classe
    							// e não mais da instância. Logo, toda instância
    							// se refere ao mesmo atributo
    
    // Construtor
    public Conta(int agencia, int numero, Cliente titular) {
    	Conta.total++;
        this.agencia = agencia;
        this.numero  = numero;
        this.titular = titular;
        
        if (agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if (numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
        
//        System.out.println("Criando uma conta. Agencia: " + this.agencia + 
//        					" Numero: " + this.numero);
    }
    
    // Construtor alternativo
    public Conta(int agencia, int numero) {
    	this(agencia, numero, null);	// Aceita criar uma nova conta sem informar o titular
    }
    
    public void deposita(double valor) {
    	this.saldo += valor; // this faz uma referência à instância do objeto
    						// que invocou o método
    }
    
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 

        this.saldo -= valor;       
    }
    
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {	// Método da classe
		// Aqui o this não pode ser usado! 
		return Conta.total;
	}
}

// No Java é possível fazer a chamada de um construtor dentro de outro, 
// e faz-se isso para evitar duplicações de códigos e regras. Afinal, uma 
// regra aplicada em um construtor normalmente será a mesma para o outro caso. 
// Para isso usa-se o this( ) passando os parâmetros correspondentes ao 
// construtor que se queira chamar.
