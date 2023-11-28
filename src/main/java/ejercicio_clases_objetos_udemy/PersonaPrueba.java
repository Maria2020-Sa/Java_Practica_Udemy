package ejercicio_clases_objetos_udemy;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Maria";
        persona1.apellido = "Saracho";
        persona1.edad = 32;

        persona1.desplegarAtributos();

        Persona persona2 = new Persona ();
        persona2.nombre = "Francisco";
        persona2.apellido = "Romero";
        persona2.edad = 33;

        persona2.desplegarAtributos();
    }
}
