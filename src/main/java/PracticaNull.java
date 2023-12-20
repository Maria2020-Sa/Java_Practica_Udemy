public class PracticaNull {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Uma");
        System.out.println("Persona1 tiene de nombre: " + persona1.obtenerNombre());

        Persona persona2 = persona1;
        System.out.println("persona2 es igual a persona1= " + persona2.obtenerNombre());

        persona1 = null;
        if (persona1 != null) {
            System.out.println("El valor no es nulo es: " + persona1.obtenerNombre());
        }
        System.out.println("El valor de persona1 es nulo");
    }
}

class Persona{
    String nombre;

    Persona (String nombre){
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }
}