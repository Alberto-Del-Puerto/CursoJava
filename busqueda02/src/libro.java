public class libro {
    private String titulo;
    private double precio;
    private int year;
    public libro(String titulo, double precio, int year) {
        this.titulo = titulo;
        this.precio = precio;
        this.year = year;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

  

    

}
