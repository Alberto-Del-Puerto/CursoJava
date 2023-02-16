public class personaje {
    // encansulamiento:

    private String nombre;
    private int nivel;

    //metodo: constructor
    public personaje(){
        this.nombre = "*****";
        this.nivel = 0;
    }

    // metodos: acceso , setters y getters
    // los metoso set seran para estableces o cargar un valor a cada atributo, nunca retornan valor
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    // get: son metodos para tomar el valor de los atributos,nunca reciben parametros

    public String getNombre(){
        return this.nombre;
    }

    public int getNivel(){
        return this.nivel;
    }




}
