public class alumno {
    // atributos
    
    String nombre;
    String id;
    int semestre;

    public static void main(String[] args) {
        alumno a1=new alumno();

        a1.nombre = "Majo";
        a1.id = "072345";
        a1.semestre = 5;

        System.out.println("nombre: "+a1.nombre);
        System.out.println("id: "+a1.id);
        System.out.println("semestre: "+a1.semestre);

    }

}
