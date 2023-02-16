import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // entradas de datos joptionpane

        String frase;

        frase= JOptionPane.showInputDialog("Ingresa una palabra");
        JOptionPane.showMessageDialog(null,"la palabra es: "+frase);

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("ingresa un num: "));
        JOptionPane.showMessageDialog(null,"el numero es: "+num);

    }
}
