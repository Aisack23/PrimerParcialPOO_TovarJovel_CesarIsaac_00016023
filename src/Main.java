import Electronicos.Electronicos;
import Electronicos.Laptop;
import Electronicos.Telefono;
import java.util.ArrayList;
import java.util.Scanner;
import Electronicos.Lista;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        int opc = 0;
        int opc_crear = 0;
        String opc_buscar;
        String newNombre;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(".:: E L E K T R O M A R T ::.");
            System.out.printf("SELECCIONA UNA OPCION:\n1.AGREGAR PRODUCTO\n2.MODIFICAR PRODUCTO\n3.LISTA DE PRODUCTOS\n4.SALIR\n>");
            try {
                opc = sc.nextInt();
            }catch (Exception e){
                System.out.println("Error--");
                break;
            }
            switch (opc){
               case 1://AGREGAR
                   Telefono tel = new Telefono();
                   System.out.println("Que tipo de Electronico desea Agregar: \n1.Telefono\n2.Laptop\n>");
                   opc_crear = sc.nextInt();
                   if (opc_crear == 1){
                       sc.nextLine();
                       System.out.print("NOMBRE: ");
                       tel.setNombre(sc.nextLine());
                       System.out.print("MODELO: ");
                       tel.setModelo(sc.nextLine());
                       System.out.print("DESCRIPCION: ");
                       tel.setDescrip(sc.nextLine());
                       System.out.print("PRECIO: ");
                       tel.setPrecio(sc.nextDouble());
                       System.out.print("COMPAÑIA: ");
                       tel.setCompany(sc.nextLine());
                       lista.addNewElectronico(tel);

                       sc.nextLine();
                   }else if(opc_crear == 2){
                       Laptop lap = new Laptop();
                       sc.nextLine();
                       System.out.print("NOMBRE: ");
                       lap.setNombre(sc.nextLine());
                       System.out.print("MODELO: ");
                       lap.setModelo(sc.nextLine());
                       System.out.print("DESCRIPCION: ");
                       lap.setDescrip(sc.nextLine());
                       System.out.print("PRECIO: ");
                       lap.setPrecio(sc.nextDouble());
                       System.out.print("SISTEMA OPERATIVO: ");
                       lap.setSo(sc.nextLine());
                       sc.nextLine();
                       lista.addNewElectronico(lap);

                   }else{
                       System.out.println("ERR- Ingrese una opcion valida");
                       opc_crear = 0;
                       break;
                   }
                   break;
               case 2://MODIFICAR
                   System.out.println("Ingrese el Nombre del producto a modificar:");
                   opc_buscar= sc.nextLine();
                   System.out.println("Ingrese el nuevo nombre del producto:");
                   newNombre=sc.nextLine();
                   sc.nextLine();
                   lista.showElectronicoBuscado(opc_buscar, newNombre);

                   break;
               case 3://CONSULTAR LISTA
                        lista.showElectronicos();
                   break;
               case 4://SALIR
                   break;
               default:
                   System.out.println("ERR- Ingrese una opcion valida");
                   opc = 0;
                   break;
           }


       }while (opc!=4);
    }
}