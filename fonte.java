package CarLocation;

import javax.swing.JOptionPane;

public class fonte {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("qual o nome do carro: ");
        
        String InputVelocity = JOptionPane.showInputDialog("insira a velocidade max do carro: ");
        int velocity = Integer.parseInt(InputVelocity);

        String cor = JOptionPane.showInputDialog("qual a cor do carro: ");

        
    }
}
