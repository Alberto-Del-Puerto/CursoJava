import javax.swing.JOptionPane;

// diseñe un programa que pueda almacenar una serie de libros (titulo, año, precio).
// ademas debe de indicar el libro de menor precio.


public class App {
    public static void main(String[] args) throws Exception {
        String titulo;

        double precio, precioMenor;
        int year, numLibros, indiceMenor=0;

        numLibros = Integer.parseInt(JOptionPane.showInputDialog("ingresa el num de libros: "));

        // arreglo de objetos:
        libro lista[] = new libro[numLibros];

        // cargar los datos

        for(int i=0;i<lista.length;i++){
            titulo=JOptionPane.showInputDialog("ingresa titulo: ");
            precio = Double.parseDouble(JOptionPane.showInputDialog("ingresa precio: "));
            year = Integer.parseInt(JOptionPane.showInputDialog("ingresa el año"));

            lista[i] = new libro(titulo, precio, year);

        }

        //mostrar los datos

        for(int i=0; i<lista.length;i++){
            System.out.println("titulo: "+lista[i].getTitulo()+"  year: "+lista[i].getYear() +"  precio: "+lista[i].getPrecio() ); 
        }

        // busqueda

        precioMenor = lista[0].getPrecio();

        for(int i=1; i<lista.length;i++){
            if(precioMenor>lista[i].getPrecio()){
                precioMenor = lista[i].getPrecio();
                indiceMenor = i;
            }
        }

        // imprimo el libro economico

        System.out.println("titulo: "+lista[indiceMenor].getTitulo()+ "año: "+lista[indiceMenor].getYear()+ "precio: "+lista[indiceMenor].getPrecio());






    }
}
