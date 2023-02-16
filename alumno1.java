public class alumno1 {
    // atributos
    String nombre;
    int semestre;
    double promedio;
    
    public static void main(String[] args) {
        // creacion de objetos

        alumno1 a1 = new alumno1();  // se crea el objeto a1

        a1.nombre ="Majo";
        a1.semestre=4;
        a1.promedio= 8.3;

        System.out.println("nombre: "+a1.nombre);
        System.out.println("promedio: "+a1.promedio);
        System.out.println("senetres: "+a1.semestre);



    }

}
