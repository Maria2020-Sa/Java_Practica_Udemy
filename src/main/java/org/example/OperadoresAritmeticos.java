package org.example;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //operadores aritmeticos:
        int a = 3, b = 2;

        int resultado = a + b;
        System.out.println("resultado suma= " + resultado);
        System.out.println("resultado concatenado = " + resultado + a + b);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        System.out.println("resultado resta = " + (a - b));

        resultado = a * b;
        System.out.println("resultado multiplicación = " + resultado);

        float resultado2 = 3F / b;
        System.out.println("resultado división = " + resultado2);

        resultado = 2 % b;
        System.out.println("resultado modulo = " + resultado);

        if (resultado == 0){
            System.out.println("El número es par");
        }
        else {
            System.out.println("El nùmero es impar");
        }
    }

}
