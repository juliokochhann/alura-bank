public class TesteGerente {

    public static void main(String[] args) {
        Gerente julio = new Gerente();
        julio.setNome("Julio");
        julio.setCpf("01234567809");
        julio.setSalario(5000.0);

        System.out.println(julio.getNome());
        System.out.println(julio.getCpf());
        System.out.println(julio.getSalario());

        julio.setSenha(2222);
        boolean autenticou = julio.autentica(2222);

        System.out.println(autenticou);

        System.out.println(julio.getBonificacao());
    }
}
