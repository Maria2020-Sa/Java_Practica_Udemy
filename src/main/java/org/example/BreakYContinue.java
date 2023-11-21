package org.example;

public class BreakYContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 20 ; i++) {
            //Imprimir solo numero pares
            if (i % 2 != 0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
