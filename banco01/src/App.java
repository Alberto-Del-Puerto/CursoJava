import java.util.concurrent.CountDownLatch;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
     
        cuenta c1=new cuenta();

        String nombre, num;
        double saldo, dep;

        saldo=Double.parseDouble(JOptionPane.showInputDialog("saldo: "));
        num = JOptionPane.showInputDialog("num cuenta: ");
        nombre = JOptionPane.showInputDialog("nombre: ");
        dep = Double.parseDouble(JOptionPane.showInputDialog("ingresar el monto de dep:"));



        c1.entrada(saldo, num, nombre);

       c1.mostrar();

       c1.deposito(dep);

       c1.mostrar();


     
     




    }
}
