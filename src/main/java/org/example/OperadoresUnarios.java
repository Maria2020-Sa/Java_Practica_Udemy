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
        //preincremento: la variable d modifica su valor de 3 y se asigna 4.
        int d = ++a;
        System.out.println("d preincremento se modifica y toma el valor de a(3) +1= " + d);
        System.out.println("a preincremento a(3)+1 = " + a);

        //posincremento: la variable d2 no modifica su valor sigue valiendo 4 solo modifica la variable a.
        int d2 = a++;
        System.out.println("d2 posincremento no se modifica tiene el valor de a inicial que es 4= " + d2);
        System.out.println("a++ posincremento= " + a);

        //decremento:
        //predecremento:
        int e = --a;  // e == (1-5) es decir que e == 4 al igual que a == 4
        System.out.println("--a predecremento= " + a); // 4
        System.out.println("e predecremento se modifica y toma el valor de a -1= " + e); // 4

        //posdecremento:
        int f = a--; // f == 4   a == 4-1 == 3
        System.out.println("f posdecremento no se modifica tiene el valor de a inicial que es 4= " + f); //4
        System.out.println("a-- posdecremento= " + a); //3
    }
}
