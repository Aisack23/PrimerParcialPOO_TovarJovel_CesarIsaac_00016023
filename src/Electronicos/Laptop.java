package Electronicos;

import Electronicos.Electronicos;

public class Laptop extends Electronicos {
    private String so;
    public Laptop(){
        super();
    }

    Laptop(String nombre, String modelo, double precio,String descrip, String so){
        super(nombre, modelo, precio, descrip);
        this.so = so;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }


}
