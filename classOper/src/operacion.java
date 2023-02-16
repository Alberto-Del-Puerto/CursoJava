import javax.swing.JOptionPane;

public class operacion {
    //atributos
    int num1;
    int num2;
    int suma;
    int resta;
    double div;

    //metodos
    public void input(){
        num1= Integer.parseInt(JOptionPane.showInputDialog("num1: "));
        num2= Integer.parseInt(JOptionPane.showInputDialog("num1: "));

    }

    public void suma(){
        suma = num1+num2;
    }

    public void division(){
        div = (double )num1/num2;
    }

    public void print(){
        System.out.println("suma: "+suma);
        System.out.println("div: "+div);
    }

}
