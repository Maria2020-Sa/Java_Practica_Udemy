package ejercicio_metodos_udemy;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Variable Local.
        int operandoA = 6;
        int operandoB = 2;

        //Creamos un objeto de la clase Aritmetica enviando argumentos.
        Aritmetica aritmetica = new Aritmetica(operandoA, operandoB);

        //Imprimimos los valores de los operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimimos el resultado de la suma
        System.out.println("\nEl resultado de la suma es: " + aritmetica.sumar());

        //Imprimimos resultado de la resta
        System.out.println("\nEl resultado de la resta es: " + aritmetica.restar());

        //Imprimimos resultado de la multiplicacion
        System.out.println("\nEl resultado de la multiplicación es: " + aritmetica.multiplicar());

        //Imprimimos resultado de la división
        System.out.println("\nEl resultado de la division es: " + aritmetica.dividir());
    }
}
