package com.company;
import java.util.Scanner;
public class Main {

    //OBJECTOS
    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);

        Coche cars1 = new Coche();

        cars1.color = "Blanco";
        cars1.marca = "Mercedez Bens";
        cars1.km = 0;

        //System.out.println("El color del coche numero 1 es de: "+cars1.color);
        //System.out.println("La marca del coche numero 1 es de: "+cars1.marca);
        //System.out.println("El kilometraje de mi coche es de: "+cars1.km);

        Coche cars2 = new Coche();

        cars2.color = "negro";
        cars2.marca = "chevrolet";
        cars2.km = 6000;

        //System.out.println("\nEl color del coche numero 2 es de: "+cars2.color);
        //System.out.println("La marca del coche numero 2 es de: "+cars2.marca);
        //System.out.println("El kilometraje de mi coche es de: "+cars2.km);


        operacion op = new operacion();
        op.leerNumeros();
        op.suma();
        op.resta();
        op.multiplicacion();
        op.divicion();
        op.mostrarResult();
    }
}
