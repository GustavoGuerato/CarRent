package CarLocation;

class Car {
    String nome;
    int velocidadeMax;
    String cor;
    String marca;
    boolean importado;
    double valor;
    String combustivel;
    boolean emprestado;

    
    public Car(String nome, int velocidadeMax, String cor, String marca, boolean importado, double valor, String combustivel, boolean emprestado) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
        this.cor = cor;
        this.marca = marca;
        this.importado = importado;
        this.valor = valor;
        this.combustivel = combustivel;
        this.emprestado = emprestado;
    }
}
