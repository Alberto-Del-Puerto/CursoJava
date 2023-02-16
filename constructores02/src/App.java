public class App {
    public static void main(String[] args) throws Exception {

        personaje p1=new personaje();

        System.out.println(p1.nombre);
        System.out.println(p1.nivel);


        personaje p2=new personaje("link", 3);
        System.out.println(p2.nombre);
        System.out.println(p2.nivel);

        p2.atacar(3.5);
    }
}
