package CarLocation;

import javax.swing.JOptionPane;

public class fonte {

    public static void main(String[] args) {
        Car carro1 = cadastrarCarro();
        exibirDetalhesCarro(carro1);
    }

    private static Car cadastrarCarro() {
        Car carro = new Car();

        carro.setNome(lerString("Qual o nome do carro: "));
        carro.setVelocidadeMax(lerInteiro("Insira a velocidade máxima do carro: "));
        carro.setCor(lerString("Qual a cor do carro: "));
        carro.setMarca(lerString("Qual é a marca do carro: "));
        carro.setImportado(lerBooleano("O carro é importado?"));
        carro.setValor(lerDouble("Qual é o valor do carro?"));
        carro.setCombustivel(lerString("Qual o tipo de combustível?"));
        carro.setEmprestado(lerBooleano("O carro está emprestado?"));
        carro.setCambio(lerString("O câmbio do carro é manual ou automático?"));
        carro.setNumeroPortas(lerInteiro("Quantas portas tem o carro?"));
        carro.setAno(lerInteiro("Qual o ano do carro?"));
        carro.setPlaca(lerString("Qual a placa do carro?"));
        carro.setCombustivelMax(lerInteiro("Qual a quantidade máxima de combustível que o carro suporta?"));
        carro.setId(lerShort("Qual o ID do carro?"));

        return carro;
    }

    private static void exibirDetalhesCarro(Car carro) {
        JOptionPane.showMessageDialog(null, "Detalhes do Carro:\n" + carro);
    }

    private static String lerString(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    private static int lerInteiro(String mensagem) {
        return Integer.parseInt(lerString(mensagem));
    }

    private static double lerDouble(String mensagem) {
        return Double.parseDouble(lerString(mensagem));
    }

    private static boolean lerBooleano(String mensagem) {
        return Boolean.parseBoolean(lerString(mensagem));
    }

    private static short lerShort(String mensagem) {
        return Short.parseShort(lerString(mensagem));
    }
}
