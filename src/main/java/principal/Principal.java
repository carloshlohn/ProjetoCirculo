package principal;
import javax.swing.JOptionPane;
import model.Circulo;
public class Principal {

    public static void main(String[] args) {
        Circulo circ1 = new Circulo();
        
        circ1.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio:")));
        JOptionPane.showConfirmDialog(null,"A área do círculo é: " + circ1.getArea());
    }
    }
