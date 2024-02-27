package CarLocation;

import javax.swing.JOptionPane;

public class fonte {
    public static void main(String[] args) {
        Car carro1 = new Car("Fusca", 120, "Azul", "Volkswagen", false, 20000.0, "Gasolina");
        Car carro2 = new Car("Civic", 180, "Prata", "Honda", false, 50000.0, "Etanol");
        Car carro3 = new Car("Mustang", 250, "Vermelho", "Ford", true, 80000.0, "Gasolina");
        Car carro4 = new Car("Gol", 130, "Branco", "Volkswagen", false, 25000.0, "Flex");
        Car carro5 = new Car("Corolla", 170, "Preto", "Toyota", false, 55000.0, "Gasolina");

        
        String mensagem = "Temos esses carros:\n\n" +
                "1. " + carro1.nome + "\n" +
                "2. " + carro2.nome + "\n" +
                "3. " + carro3.nome + "\n" +
                "4. " + carro4.nome + "\n" +
                "5. " + carro5.nome;
        int opcao = JOptionPane.showConfirmDialog(null,"voce gostaria de ver nossos carros disponiveis?");

        if (opcao == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,mensagem);
            int opcao2 = JOptionPane.showConfirmDialog(null,"voce gostou de algum carro? ");
            if (opcao2 == JOptionPane.YES_OPTION) {

            }
        }else{
            System.out.println("fechando o programa.");
        }
    }
}
