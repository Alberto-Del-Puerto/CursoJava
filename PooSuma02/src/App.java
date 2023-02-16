import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
// entrada de datos por Joptionpane

String palabra;

int num;

num= Integer.parseInt(  JOptionPane.showInputDialog("ingresa una numero"));

JOptionPane.showMessageDialog(null,"el num es: "+num);

    }
}
