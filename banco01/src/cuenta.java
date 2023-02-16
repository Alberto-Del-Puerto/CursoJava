import javax.swing.JOptionPane;

public class cuenta {
    //atributos
    double saldo;
    String num;
    String nombre;


    //metodos

    public void entrada(double _saldo, String _num, String _nombre){
       saldo = _saldo;
       num = _num;
       nombre = _nombre;
    }

    public void mostrar(){
        System.out.println(nombre+" "+num+" "+saldo);
    }

    public void deposito(double dep){
        saldo += dep;
    }



}
