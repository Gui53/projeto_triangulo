
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Variáveis
        double base, altura, area;

        //entrada
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura:"));

        //Processamento
        area = (base * altura) / 2.0;

        //Saída
        JOptionPane.showMessageDialog(null, "A area é: " + area);
    }
}
