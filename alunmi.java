public class alunmi {
    // atributos

    String id;
    String nombre;
    int semestre;
    double promedio;

    // metodos:

    public static void main(String[] args) {
       // creacion de un objeto
       alunmi a1 =  new alunmi();

       a1.id = "023456";
       a1.nombre = "Majo";
       a1.semestre = 4;
       a1.promedio = 8.7;

       System.out.println("nombre: "+a1.nombre);
       System.out.println("id: "+a1.id);
       System.out.println("semestre: "+a1.semestre);
       System.out.println("promedio: "+a1.promedio);



    }


}
