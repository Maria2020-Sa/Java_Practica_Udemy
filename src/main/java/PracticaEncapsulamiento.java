public class PracticaEncapsulamiento {
    public static void main(String[] args) {

        Persona persona1 = new Persona ("Maria", 5000, false);
        System.out.println("persona1 = " + persona1.toString() + Persona.apellido);

        Persona.apellido = "Saracho";

        Persona persona2 = persona1;
        persona2.setNombre("Eugenia");
        persona2.setSueldo(5689);
        persona2.setEliminado(true);
        System.out.println("persona2 = " + persona2.toString() + Persona.apellido);

    }
}
