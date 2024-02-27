# CarLocation - Sistema de Gerenciamento de Carros

## Descrição
Este é um simples sistema de gerenciamento de carros em Java, utilizando a interface gráfica do JOptionPane para interação com o usuário. O programa exibe uma lista de carros disponíveis com informações detalhadas, como nome, velocidade máxima, cor, marca, importado, valor e tipo de combustível.

## Instruções de Uso
1. Execute o programa Java chamado `fonte.java`.
2. Uma caixa de diálogo perguntará se você gostaria de ver os carros disponíveis. Selecione "Sim" para visualizar a lista de carros.
3. Uma nova caixa de diálogo será exibida, mostrando os carros disponíveis com detalhes como nome, velocidade máxima, cor, marca, importado, valor e tipo de combustível.
4. Se o usuário optar por ver os carros e, em seguida, indicar que gostou de algum carro, o programa pode ser modificado para incluir ações específicas para essa situação.

## Estrutura do Código
- `Car.java`: Definição da classe `Car` com atributos e um construtor para representar um carro.
- `fonte.java`: Programa principal que cria instâncias da classe `Car` e exibe uma lista de carros usando `JOptionPane`.

## Exemplo de Uso
```java
Car carro1 = new Car("Fusca", 120, "Azul", "Volkswagen", false, 20000.0, "Gasolina");
Car carro2 = new Car("Civic", 180, "Prata", "Honda", false, 50000.0, "Etanol");
Car carro3 = new Car("Mustang", 250, "Vermelho", "Ford", true, 80000.0, "Gasolina");
Car carro4 = new Car("Gol", 130, "Branco", "Volkswagen", false, 25000.0, "Flex");
Car carro5 = new Car("Corolla", 170, "Preto", "Toyota", false, 55000.0, "Gasolina");
