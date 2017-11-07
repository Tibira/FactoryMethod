# Padrão de Desenvolvimento Factory

  O padrão de desenvolvimento Factory encapsula a criação de objetos, isso faz com  que as subclasses decidam que objeto criar.

### Exemplo de implementação
```

public abstract class Pessoa {

    public String nome;
    public String sexo;
    
}


class Mulher extends Pessoa{
    public Mulher(String nome) {
		this.nome = nome;
		System.out.println("Olá Senhora " + this.nome);
	}
}


class Homem extends Pessoa{
    public Homem(String nome) {
		this.nome = nome;
		System.out.println("Olá Senhor " + this.nome);
	}
}

```
Acima temos um exemplo da implementação por Factory, onde cria-se produtos(abstratos e concretos) que executam as decisões tomadas na factory onde não sabemos qual vai ser chamado.

A classe Factory vai conter a logica para a criação de determinado objeto.

```
public class FactoryPessoa {

    public Pessoa getPessoa(String nome, String sexo) {
        if (sexo.equals("M")) {
            return new Homem(nome);
        } else if (sexo.equals("F")) {
            return new Mulher(nome);
        } else {

            return null;
        }

    }
}
```
O método principal vai adicionar um nome e um sexo para a classe Factory, fazendo com que ela crie o objeto necessario.
```
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
```


### Vantagens

O Factory nos oferece um meio de desligar a implementação de um Product. Adicionar ou alterar Products não ira afetar o Creator, pois eles não estão fortemente ligados.

[Site](https://www.devmedia.com.br/padrao-de-projeto-factory-method-em-java/26348)
