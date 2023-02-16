//encapsulamiento, metodos de acceso


public class auto {
    // atributos
    private String placa;
    private int modelo;

    //metodos
    public auto(){
        this.placa = "#####";
        this.modelo = 0;
    }

    // metodos de acceso:
    // setters : sirven para establecer los valores de los atributos, nunca retornan valor

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    //getters : sirve para tomar el valor de los atributos, nunca reciven valores

    public String getPlaca(){
        return this.placa;
    }

    public int getModelo(){
        return this.modelo;
    }




}
