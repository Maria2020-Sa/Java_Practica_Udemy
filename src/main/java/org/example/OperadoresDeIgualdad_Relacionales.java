package org.example;

public class OperadoresDeIgualdad_Relacionales {

    public static void main(String[] args) {
        //Operadores de igualdad:
        //El == se usa en datos primitivos y compara su valor.
        int a = 3, b = 2;
        boolean c = (a == b);
        System.out.println("a == b? = " + c);

        boolean c2 = (a != b);
        System.out.println("a != b? = " + c2);

        //Si se usa el == en objetos compara el lugar de la memoria por lo que dará false. Ejemplo:
        String cadena1 = new String("Hola");
        String cadena2 = new String("Hola");
        System.out.println("*Uso de == con objetos, compara la ubicación de memoria =" + (cadena1 == cadena2));

        //Solo hay una excepción con el == al usarlo con objetos, por ejemplo si se asigna directamente el valor a la variable, este lo guarda en cache y compara los valores.
        String cadena3 = "Hola";
        String cadena4 = "Hola";
        System.out.println("*Excepción del uso == con objetos = " + (cadena3 == cadena4)); //true

        //Para comparar objetos se utiliza equals que compara los valores. Ejemplo:
        System.out.println("*Compara solo objetos = " + (cadena1.equals(cadena2))); //true

        //Operdadores Relacionales:
        boolean d = a <= b;
        System.out.println("d = " + d);

        if (a % 2 == 0){
            System.out.println("El nùmero es par");
        }
        else {
            System.out.println("El nùmero es impar");
        }

        int edad = 10;
        int adulto = 18;
        if (edad >= adulto){
            System.out.println("Es adulto");
        }
        else {
            System.out.println("Es menor de edad");
        }
    }
}
