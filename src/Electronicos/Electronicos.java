package Electronicos;

public abstract class Electronicos implements Consultables{
    private String nombre;
    private String modelo;
    private double precio;
    private String descrip;

    Electronicos (){};

    public Electronicos(String nombre, String modelo, double precio,String descrip) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.descrip = descrip;
    }

   

    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    //

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
