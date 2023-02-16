import javax.swing.JOptionPane;

public class tarjeta {
    //atributos 
    String num;
    String nombre;
    double saldo;




    //metodos

    public void entradas(String _num, String _nombre, double _saldo){
        num = _num; 
        nombre = _nombre;
        saldo = _saldo;
    }




    // crear un metodo deposito que recibe el monto a 
    // a depositar y lo sume al saldo.

    public void deposito (double dep){
        saldo = saldo +dep;
    }





}
