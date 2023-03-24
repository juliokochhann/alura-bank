
public class TestaAutenticavel {

	public static void main(String[] args) {
		
		Autenticavel g = new Gerente();
		Autenticavel c = new Cliente();
		Autenticavel adm = new Administrador();

		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(g);
		sistema.autentica(c);
		sistema.autentica(adm);
	}

}
