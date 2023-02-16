import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        operacion oper=new operacion();
        int n1,n2;

        n1=Integer.parseInt(JOptionPane.showInputDialog("num1: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("num2: "));

        System.out.println("suma: "+oper.suma(n1, n2));
        System.out.println("resta: "+oper.resta(n1, n2));
        System.out.println("mult: "+oper.mult(n1, n2));
        System.out.println("div: "+oper.div(n1, n2));



    }
}
