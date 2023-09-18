package org.example;

public class OperadoresCondicionales {

    public static void main(String[] args) {
        //OPERADORES CONDICIONALES:  AND - OR
        //AND &&: Solo da true si ambas variables son verdaderas, el resot es false.
        int a = 15;
        int valorMinimo = 0 , valorMaximo = 10;
        boolean b = (a >= valorMinimo && a <= valorMaximo);
        System.out.println("b = " + b);

        //OR ||  Solo da false si ambas variables son falsas, el resto es true.
        boolean vacaciones = false;
        boolean diaLibre = false;
        if (vacaciones || diaLibre){
            System.out.println("Puede asistir al evento");
        }
        else {
            System.out.println("Está ocupado");
        }
    }
}
