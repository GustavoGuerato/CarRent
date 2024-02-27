# CarLocation - Sistema de Locação de Carros

## Descrição do Projeto

O projeto **CarLocation** é um sistema simples de locação de carros, implementado em Java. Ele permite visualizar uma lista de carros disponíveis, escolher um carro e verificar se o cliente gostou do veículo.

## Estrutura do Projeto

### 1. Classe `Car`

A classe `Car` representa a estrutura de um carro e possui os seguintes atributos:

- `nome` (String): Nome do carro.
- `velocidadeMax` (int): Velocidade máxima do carro em km/h.
- `cor` (String): Cor do carro.
- `marca` (String): Marca do carro.
- `importado` (boolean): Indica se o carro é importado (true) ou nacional (false).
- `valor` (double): Valor do carro em reais.
- `combustivel` (String): Tipo de combustível utilizado pelo carro.
- `emprestado` (boolean): Indica se o carro está emprestado no momento (true) ou disponível (false).

A classe possui um construtor para inicializar os atributos.

### 2. Classe `fonte`

A classe `fonte` contém o método `main` que serve como ponto de entrada do programa. Nela são criados cinco objetos do tipo `Car`, representando diferentes carros disponíveis para locação. O usuário é então questionado se deseja visualizar a lista de carros e, caso afirmativo, é exibida a lista. Após a visualização, o usuário pode indicar se gostou de algum carro.

## Como Executar o Programa

O programa é executado a partir da classe `fonte`. Ao ser executado, ele exibe uma janela de diálogo perguntando se o usuário gostaria de ver os carros disponíveis. Se a resposta for afirmativa, a lista de carros é exibida. Em seguida, o usuário pode indicar se gostou de algum carro.

## Requisitos

- Java Development Kit (JDK) instalado.

## Contribuição

Contribuições são bem-vindas! Se você identificar melhorias ou correções que podem ser feitas no código, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Autores

- [Seu Nome]

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

---

