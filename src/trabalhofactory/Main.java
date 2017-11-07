package trabalhofactory;
public class Main {
    public static void main(String args[]) {
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Carlos";
		String sexo = "M";
		factory.getPessoa(nome, sexo);
                
                FactoryPessoa factory2 = new FactoryPessoa();
		nome = "Maria";
		sexo = "F";
		factory2.getPessoa(nome, sexo);
	}
}