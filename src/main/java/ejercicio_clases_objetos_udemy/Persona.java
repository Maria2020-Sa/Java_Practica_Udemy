package ejercicio_clases_objetos_udemy;

public class Persona {
    //atributos de la clase.
    String nombre;
    String apellido;
    int edad;

    //metodo de la clase. Lo usaran los objetos.
    public void desplegarAtributos (){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("edad = " + edad + "\n");
    }
}
