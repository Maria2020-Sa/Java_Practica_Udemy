package org.example;

public class PractVar {

    public static void main(String[] args) {

        //byte Short int long
        byte byteValor = 127;
        System.out.println("byteValor= " + byteValor);

        System.out.println("bit tipo byte= " + Byte.SIZE);
        System.out.println("byte tipo byte= " + Byte.BYTES);
        System.out.println("Valor mínimo tipo byte= " + Byte.MIN_VALUE);
        System.out.println("Valor máximo tipo byte= " + Byte.MAX_VALUE);

        short shortValor = 32767;
        System.out.println("shortValor =" + shortValor);

        System.out.println("bit tipo Short= " + Short.SIZE);
        System.out.println("byte tipo Short= " + Short.BYTES);
        System.out.println("Valor mínimo tipo Short= " + Short.MIN_VALUE);
        System.out.println("Valor máximo tipo Short= " + Short.MAX_VALUE);

        int intValor = 2147483647;
        System.out.println("intValor =" + intValor);

        System.out.println("bit tipo int= " + Integer.SIZE);
        System.out.println("byte tipo int= " + Integer.BYTES);
        System.out.println("Valor mínimo tipo int= " + Integer.MIN_VALUE);
        System.out.println("Valor máximo tipo int= " + Integer.MAX_VALUE);

        long longValor = 9223372036854775807L; //Debemos tener cuidado con el tipo de la variable pero también con el tipo del Literal ya que si no espesificamos con una L al final que es de tipo lon, siempre se lee del tipo int.
        System.out.println("longValor = " + longValor);

        System.out.println("bit tipo long= " + Long.SIZE);
        System.out.println("byte tipo long= " + Long.BYTES);
        System.out.println("Valor mínimo tipo long= " + Long.MIN_VALUE);
        System.out.println("Valor máximo tipo long= " + Long.MAX_VALUE);

        //float double

        float floatValor = 3.4028235E38F;
        System.out.println("floatValor= " + floatValor);

        System.out.println("bit tipo float= " + Float.SIZE);
        System.out.println("byte tipo float= " + Float.BYTES);
        System.out.println("Valor mínimo tipo float= " + Float.MIN_VALUE);
        System.out.println("Valor máximo tipo float= " + Float.MAX_VALUE);

        double doubleValor = 1.7976931348623157E308D;
        System.out.println("doubleValor = " + doubleValor);

        System.out.println("bit tipo double= " + Double.SIZE);
        System.out.println("byte tipo double= " + Double.BYTES);
        System.out.println("Valor mínimo tipo double= " + Double.MIN_VALUE);
        System.out.println("Valor máximo tipo double= " + Double.MAX_VALUE);

        //char
        char charVar = 'a';
        System.out.println("charVar = " + charVar);

        System.out.println("bit tipo char= " + Character.SIZE);
        System.out.println("byte tipo char= " + Character.BYTES);
        System.out.println("Valor mínimo tipo char= " + Character.MIN_VALUE);
        System.out.println("Valor máximo tipo char= " + Character.MAX_VALUE);

        //boolean
        boolean booleanValor = false;

        //por defecto interpreta que es true, no es necesario aclararlo en el if.
        if (booleanValor) {
            System.out.println("El valor es verdadero");
        } else {
            System.out.println("El valor es falso");
        }

        System.out.println("");

        int edad = 10;
        boolean esAdulto = edad >= 18;

        if (esAdulto) {
            System.out.println("La persona es adulta");
        } else {
            System.out.println("No es adulto");
        }
    }
}
