package Electronicos;

import java.util.ArrayList;

public class Lista implements Consultables{
    ArrayList<Electronicos> electros;

    // Default constructor
    public Lista() {
        this.electros = new ArrayList<>();
    }

    // Overloaded constructor
    public Lista(ArrayList<Electronicos> electros) {
        this.electros = electros;
    }

    // Methods

    public void addNewElectronico(Electronicos electros) {
        this.electros.add(electros);
    }

    public void showElectronicos() {
        for(int i = 0; i < electros.size(); i++) {
            System.out.println(electros.get(i).getNombre() + "\t" + electros.get(i).getModelo() + "\t" + electros.get(i).getDescrip() +"\t$" + electros.get(i).getPrecio() +"\t");
        }
    }

    public void showElectronicoBuscado(String opcBuscar, String newNombre) {
        for(int i = 0; i < electros.size(); i++) {
            if (opcBuscar == electros.get(i).getNombre()){
                electros.get(i).setNombre(newNombre);
                System.out.println("Nombre modificado a: "+electros.get(i).getNombre());
            }
        }
    }
}

