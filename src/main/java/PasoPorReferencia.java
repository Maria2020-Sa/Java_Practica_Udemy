public class PasoPorReferencia {
    public static void main(String[] args){
        Persona persona = new Persona();

        persona.cambiarNombre("Carlos");
        System.out.println("El nombre es = " + persona.obtenerNombre());

        modicarNombre(persona);
        System.out.println("El nombre modificado es = " + persona.obtenerNombre());
    }

    private static void modicarNombre(Persona personaArg) {
        personaArg.cambiarNombre("Fran");
    }
}
