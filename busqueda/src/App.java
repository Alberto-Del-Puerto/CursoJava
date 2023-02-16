import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String titulo;
        double precio, precioMin;
        int numLibros, indiceMin=0;

        numLibros = Integer.parseInt(JOptionPane.showInputDialog("ingrese el num de libros: "));

        libro lista[] = new libro[numLibros];

        for(int i=0;i<lista.length;i++){
            titulo = JOptionPane.showInputDialog("titulo: ");
            precio = Double.parseDouble(JOptionPane.showInputDialog("precio: "));

            lista[i] = new libro(titulo, precio);

        }


        for(int i= 0; i<lista.length;i++){
            System.out.println("titulo: "+lista[i].getTitulo() +"   precio: "+lista[i].getPrecio());
        }


        //busqueda:
        precioMin = lista[0].getPrecio();

        for(int i =1; i<lista.length;i++){
            if(precioMin>lista[i].getPrecio()){
                precioMin = lista[i].getPrecio();
                indiceMin=i;

            }
        }

        System.out.println("el libro mas barato es: ");
        System.out.println("titulo: "+lista[indiceMin].getTitulo() +"   precio: "+lista[indiceMin].getPrecio());

        







    }
}
