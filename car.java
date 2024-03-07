package CarLocation;

class Car {
    private String nome;
    private int velocidadeMax;
    private String cor;
    private String marca;
    private boolean importado;
    private double valor;
    private String combustivel;
    private boolean emprestado;
    private String cambio;
    private int numeroPortas;
    private int ano;
    private String placa;
    private int combustivelMax;
    private short id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCombustivelMax() {
        return combustivelMax;
    }

    public void setCombustivelMax(int combustivelMax) {
        this.combustivelMax = combustivelMax;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    

    @Override
    public String toString() {
        return "Car [nome=" + nome + ", velocidadeMax=" + velocidadeMax + ", cor=" + cor + ", marca=" + marca
                + ", importado=" + importado + ", valor=" + valor + ", combustivel=" + combustivel + ", emprestado="
                + emprestado + ", cambio=" + cambio + ", numeroPortas=" + numeroPortas + ", ano=" + ano + ", placa="
                + placa + ", combustivelMax=" + combustivelMax + ", id=" + id + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((placa == null) ? 0 : placa.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (placa == null) {
            if (other.placa != null)
                return false;
        } else if (!placa.equals(other.placa))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    

}
