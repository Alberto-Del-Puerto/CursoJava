import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        operacion oper = new operacion();

        int n1,n2;

        int suma, resta;


        n1 = Integer.parseInt(JOptionPane.showInputDialog("num 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("num 2: "));


        suma = oper.suma(n1,n2);
        resta= oper.resta(n1,n2);
        oper.print(suma,resta);




    }
}
