package org.example;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 3;
        int b =-a;
        System.out.println("b = " + b);

        boolean c = true;
        boolean c2 = !c;
        System.out.println("c = " + c);
        System.out.println("c2 = " + c2);

        //incrementos:
        //preincremento
        int d = ++a;
        System.out.println("d = " + d);
        System.out.println("a = " + a);

        //posincremento
        int d2 = a ++;
        System.out.println("d2 = " + d2);
        System.out.println("a = " + a);

        //decremento:
        //predecremento
        int e = --a;
        System.out.println("a = " + a);
        System.out.println("e = " + e);
    }
}
