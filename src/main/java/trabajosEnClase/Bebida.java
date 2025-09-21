package trabajosEnClase;
//Crear un objeto con atributos, constructor y metodos
public class Bebida {

    private String nombre;
    private int contenido;
    private String sabor;

    public Bebida(String nombre, int contenido, String sabor) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean refrescar(){
        return true;
    }

}
