# Padrão de Desenvolvimento Factory

  O padrão de desenvolvimento Factory encapsula a criação de objetos, isso faz com  que as subclasses decidam que objeto criar.

### Exemplo de implementação

Acima temos um exemplo da implementação por Factory, onde cria-se produtos(abstratos e concretos) que executam as decisões tomadas na factory onde não sabemos qual vai ser chamado.



### Vantagens

O Factory nos oferece um meio de desligar a implementação de um Product. Adicionar ou alterar Products não ira afetar o Creator, pois eles não estão fortemente ligados.
