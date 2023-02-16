import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        int num1, num2;

        
        num1= Integer.parseInt(JOptionPane.showInputDialog("num1: "));
        num2 =Integer.parseInt(JOptionPane.showInputDialog("num2: "));
    




        operacion oper = new operacion();

        
        oper.suma(num1, num2);
        oper.print();

    }
}
