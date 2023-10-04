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
        //preincremento:
        int d = ++a;
        System.out.println("d preincremento: incrementa en 1 el valor de a y se asigna a d= " + d);
        System.out.println("a preincremento a(3)+1 = " + a);

        //posincremento:
        int d2 = a++;
        System.out.println("d2 posincremento: " + d2 + " (el valor de la variable a primero se asigna a d2 (4) y luego incrementa en 1 la variable a (4+1=5)");
        System.out.println("a++ posincremento= " + a);

        //decremento:
        //predecremento:
        int e = --a;  //
        System.out.println("--a predecremento= " + a); // 4
        System.out.println("e predecremento= " + e); // 4

        //posdecremento:
        int f = a--;
        System.out.println("f posdecremento= " + f); //4
        System.out.println("a-- posdecremento= " + a); //3
    }
}
