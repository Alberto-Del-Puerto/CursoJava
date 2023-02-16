import javax.swing.JOptionPane;

import netscape.javascript.JSObject;

public class App {
    public static void main(String[] args) throws Exception {
        int n1,n2,suma;
        n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa un num: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa un num: "));
        suma = n1+n2;

        JOptionPane.showMessageDialog(null,"la suma es "+ suma);
    }
}
