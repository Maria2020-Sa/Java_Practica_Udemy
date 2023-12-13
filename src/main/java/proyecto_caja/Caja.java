package proyecto_caja;

import ejercicio_metodos_udemy.Aritmetica;

public class Caja {

    //Atributos de la clase
    int ancho;
    int alto;
    int profundo;

    //Constructor vacío de la clase
    public Caja (){
        System.out.println("\nEjecutando constructor vacío");
    }

    //Constructor con 3 argumentos
    public Caja (int ancho, int alto, int profundo){
        this.ancho = alto;
        this.alto = profundo;
        this.profundo = ancho;
        System.out.println("\nEjecutando constructor con argumentos");
    }

    //Función para calcular el volumen
    public int formulaVolumen (){
        return this.ancho * this.alto * this.profundo;
    }
}
