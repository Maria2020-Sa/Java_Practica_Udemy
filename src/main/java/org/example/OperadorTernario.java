package org.example;

public class OperadorTernario {
    //Operadores Ternarios: nos puede ayudar para simplificar una estructura del tipo if / else
    public static void main(String[] args) {
        boolean resultado = (3 > 1) ? true : false;
        System.out.println("resultado = " + resultado);

        int numero = 7;
        String parImpar = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println(numero + " = " + parImpar);
    }

}