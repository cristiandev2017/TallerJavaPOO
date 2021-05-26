package paquete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String tipo_electro,nombre,procedencia;
        int tamanio,entrada,capacidad, entrada_2=0 ;
        String sintoniza;
        double acumulador;

        Scanner sc = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("Digite 1 para Continuar o 2 si desea salir");
        System.out.println("****************************");
        entrada_2 = sc.nextInt();
        while (entrada_2 != 2){
            System.out.print("Porfavor ingrese el tipo de electro");
            tipo_electro = sc.next();
            System.out.print("Por favor ingrese la procedencia");
            procedencia =sc.next();

            //1.Entrada despues de llenar la base
            System.out.println("****************************");
            System.out.println("Digite el electrodomestico que desea calcular");
            System.out.println("1. Para Televisor");
            System.out.println("2. Para Nevera");
            System.out.println("3. Para otro electrodomestico");
            System.out.println("****************************");
            entrada = sc.nextInt();

            switch(entrada)
            {
                case 1 :
                    System.out.println("Seleccionaste televisor");
                    System.out.println("Porfavor ingrese el nombre");
                    nombre = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Ingrese el tamaño");
                    tamanio = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese si sintoniza TDT  | no");
                    sintoniza = sc.next();
                    //Lo instancio
                    Televisor tel = new Televisor( tipo_electro, nombre, procedencia, tamanio, sintoniza);
                    tel.calcularPrecio();
                    System.out.println(tel.getPrecio());
                    break;
                case 2 :
                    System.out.println("Seleccionaste Nevera");
                    System.out.println("Porfavor ingrese el nombre");
                    nombre = sc.next();
                    sc.nextLine();
                    System.out.println("Ingrese la capacidad");
                    capacidad = sc.nextInt();

                    //Lo instancio
                    Nevera nev = new Nevera(tipo_electro,nombre,procedencia,capacidad);
                    nev.calcularPrecio();
                    System.out.println(nev.getPrecio());
                    break;

                case 3:
                    System.out.println("Porfavor ingrese el nombre");
                    nombre = sc.nextLine();
                    sc.nextLine();
                   //Lo instancio
                    Electrodomestico elect = new Electrodomestico( tipo_electro, nombre, procedencia);
                    elect.calcularPrecio();
                    System.out.println(elect.getPrecio());
                    break;
                case 4:
                    break;
                default :
                    System.out.println("No ha seleccionado una opcion valida");
            }
            System.out.println("****************************");
            System.out.println("Digite 1 para Continuar o 2 si desea salir");
            System.out.println("****************************");
            entrada_2 = sc.nextInt();
        }
    }
}
