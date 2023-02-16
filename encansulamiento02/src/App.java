import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        personaje p1=new personaje();
        String nombre;

        System.out.println(p1.getNombre());
        System.out.println(p1.getNivel());


        nombre=JOptionPane.showInputDialog("nombre: ");

        p1.setNombre(nombre);
        p1.setNivel(3);

        System.out.println(p1.getNombre());
        System.out.println(p1.getNivel());

       



    }
}
