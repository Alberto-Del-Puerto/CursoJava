public class auto {
    // atributos 
    String numPlaca;
    int modelo;

    //métodos
    // constructor: inicializar los atributos de la clase
    public auto(){
        this.numPlaca = "*****";
        this.modelo = 0;
    }


    //sobrecarga de metodos
    public auto(String numPlaca, int modelo){
        this.numPlaca = numPlaca;
        this.modelo = modelo;
    }


    public void acelerar(int km){
        System.out.println("el auto esta acelerando a: "+km +"km/hrs");
    }
    //sobrecarga
    public void acelerar(double km){
        System.out.println("el auto esta acelerando a: "+km+"km/hrs");
        

    }




}
