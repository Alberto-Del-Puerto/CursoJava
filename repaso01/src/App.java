import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    
        tarjeta t1 = new tarjeta();
        String num,nombre;
        double saldo;

        num=JOptionPane.showInputDialog("num: ");
        nombre = JOptionPane.showInputDialog("nombre: ");
        saldo = Double.parseDouble(JOptionPane.showInputDialog("saldo: "));


        t1.entradas(num, nombre, saldo);
        t1.deposito(2000);





        System.out.println("num cuenta: "+t1.num +" nombre: "+t1.nombre+ " saldo: "+t1.saldo);






    }
}
