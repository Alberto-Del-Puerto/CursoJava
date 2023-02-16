
//constructor: es el metodo de la clase que se encarga de inicializar los atributos de la misma.


public class personaje {
    // atributos 
    String nombre;
    int nivel;


    //métodos

    // constructor  sin parametros

    public personaje(){
        this.nombre = "*****";
        this.nivel = 0;

    }

    // sobrecarga de metodos: es cuando se define un mismo metodo dos veces o mas, con distintos parametros
    // constructor con parametros

    public personaje(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
    }


    public void atacar(int num){
        System.out.println(this.nombre+ " esta lanzando "+ num+" flechas" );
    }

    public void atacar(double num){
        System.out.println(this.nombre+ " esta lanzando "+ num+" flechas" );

    }

}
