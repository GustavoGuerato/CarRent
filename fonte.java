package CarLocation;

import javax.swing.JOptionPane;

public class fonte {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("qual o nome do carro: ");

        String InputVelocity = JOptionPane.showInputDialog("insira a velocidade max do carro: ");
        int velocity = Integer.parseInt(InputVelocity);

        String cor = JOptionPane.showInputDialog("qual a cor do carro: ");

        String marca = JOptionPane.showInputDialog("qual é a marca do carro: ");

        String inputImportado = JOptionPane.showInputDialog("O carro é importado? (true/false)");
        boolean carroImportado = Boolean.parseBoolean(inputImportado);

        if (carroImportado) {
            JOptionPane.showMessageDialog(null, "O carro escolhido é importado");
        } else {
            JOptionPane.showMessageDialog(null, "O carro não é importado");
        }

        String InputValor = JOptionPane.showInputDialog("qual é o valor do carro? ");
        double valor = Double.parseDouble(InputValor);

        String combustivel = JOptionPane.showInputDialog("qual o tipo de combustivel? ");

        String inputEmprestado = JOptionPane.showInputDialog("o carro está emprestado? (true/false)");
        boolean emprestado = Boolean.parseBoolean(inputEmprestado);
        if (emprestado) {
            JOptionPane.showMessageDialog(null, "O carro escolhido está emprestado");
        } else {
            JOptionPane.showMessageDialog(null, "O carro não está emprestado");
        }

        String cambio = JOptionPane.showInputDialog("o camnio do carro é manual ou automatico? ");

        String inputPortas = JOptionPane.showInputDialog("quantas portas tem o carro? ");
        int portasCarro = Integer.parseInt(inputPortas);

        String inputAno = JOptionPane.showInputDialog("qual o ano do carro? ");
        int ano = Integer.parseInt(inputAno);
        
        String placa = JOptionPane.showInputDialog("qual a placa do carro? ");

        String inputCombustivel = JOptionPane.showInputDialog("qual a quantidade maxima que o carro aguenta? ");
        int combustivelMax = Integer.parseInt(inputCombustivel);

        String inputId = JOptionPane.showInputDialog("qual o id do carro? ");
        short id = Short.parseShort(inputId);

        Car carro1 = new Car();


        carro1.setNome(nome);
        carro1.setVelocidadeMax(velocity);
        carro1.setCor(cor);
        carro1.setMarca(marca);
        carro1.setImportado(carroImportado);
        carro1.setValor(valor);
        carro1.setCombustivel(combustivel);
        carro1.setEmprestado(emprestado);
        carro1.setCambio(cambio);
        carro1.setNumeroPortas(portasCarro);
        carro1.setAno(ano);
        carro1.setPlaca(placa);
        carro1.setCombustivelMax(combustivelMax);
        carro1.setId(id);

    }
}
