package Electronicos;

import Electronicos.Electronicos;

public class Telefono extends Electronicos{
    private String company;

    public Telefono(){
        super();
        this.company = "";
    };
    Telefono(String nombre, String modelo,double precio,String descrip,String company){
        super(nombre, modelo, precio, descrip);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
