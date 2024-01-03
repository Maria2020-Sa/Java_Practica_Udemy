public class Empleado extends Persona {
    private int sueldo;

    //Constructor de la clase padre
    public Empleado (String nombre, int edad) {
        super (nombre, edad);
    }

    //Sobrecarga de constructor
    public Empleado (String nombre, int edad, int sueldo){
        this(nombre, edad); //Reutilizar el codigo del constructor con dos arg. que tenemos dentro de la misma clase, con la palabra this.
        //super (nombre, edad); //Inicializa directamente los valores del constructor clase padre, solo se puede usar una de las dos.
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\t\tEmpleado {" +
                "sueldo=" + sueldo +
                '}';
    }
}
