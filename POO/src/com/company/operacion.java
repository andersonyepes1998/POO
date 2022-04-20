package com.company;

import java.util.Scanner;

public class operacion {

    //ATRIBUTOS
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //METODO

    //METODO PARA PEDIRLE AL USUARIO QUE NOS DIGITE DOS NUMEROS.

    public void leerNumeros(){
        Scanner inputData = new Scanner(System.in);
        System.out.println("Digite un numero por favor: ");
        numero1 = Integer.parseInt(inputData.nextLine());

        System.out.println("Digite un numero por favor: ");
        numero2 = Integer.parseInt(inputData.nextLine());
    }

    public void suma(){
        suma = numero1+numero2;
    }

    public void resta(){
        resta = numero1 - numero2;
    }

    public void multiplicacion(){
        multiplicacion = numero1 * numero2;
    }

    public void divicion(){
        division = numero1 / numero2;
    }

    public void mostrarResult(){
        System.out.println("el resultado de la suma es de: "+suma);
        System.out.println("\nel resultado de la resta es de: "+resta);
        System.out.println("\nel resultado de la multiplicacion es de: "+multiplicacion);
        System.out.println("\nel resultado de la division es de: "+division);
    }

}
