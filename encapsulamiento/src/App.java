import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        auto a1=new auto();

        String placa;

        placa=JOptionPane.showInputDialog("ingresar num placa: ");



        a1.setPlaca(placa);
        a1.setModelo(2022);

        System.out.println(a1.getPlaca());
        System.out.println(a1.getModelo());


     



    }
}
