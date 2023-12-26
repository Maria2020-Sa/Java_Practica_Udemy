public class Persona {

    private String nombre;//se asocia con un objeto (instancia)
    private int idPersona;//se asocia con un objeto (instancia)
    private static int contadorPersonas;

    public Persona (String nombre){
        this.nombre = nombre;
        this.idPersona = ++contadorPersonas;
    }

    public String getNombre (){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona (){
        return this.idPersona;
    }

    public static int getContadorPersonas () {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "ID Persona Nª: " + idPersona + ", Nombre: " + nombre + ", Contador Personas: " +contadorPersonas;
    }
}