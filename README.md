## Grupo
Tibiriçá dos Santos

Láudrin Rei Garralaga

Caiã Ceron

# Padrão de Desenvolvimento Factory

O padrão Factory Method encapsula a criação de objetos, no entanto, a diferença é que neste padrão encapsula-se a criação de objetos deixando as subclasses decidirem quais objetos criar.
### Diagrama de clase

![Diagrama de classe do Factory](http://videos.web-03.net/artigos/Higor_Medeiros/PadraoFactoryMethod/PadraoFactoryMethod1.jpg)

No diagrama de classe acima temos a classe de criador abstrata que é a Creator que define um método fábrica abstrata que as subclasses implementam para criar um produto (factoryMethod) e pode possuir um ou mais métodos com seus devidos comportamentos que chamarão o factoryMethod. Normalmente o método factoryMethod do Creator também possui um Product abstrato que é produzido por uma subclasse (ConcreteCreator).

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

Usando o Factory Method temos o nosso código de criação em um objeto ou método, evitando assim a duplicação e além disso temos um local único para fazer manutenção.

O padrão também nos dá um código flexível e extensível para o futuro.

### Desvantagens

Alto número de classes, podendo sobrecarregar o sistema.

### Bibliografia

[Site explicando mais detalhadamente sobre o Factory](https://www.devmedia.com.br/padrao-de-projeto-factory-method-em-java/26348)
