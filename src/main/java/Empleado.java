public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private int contadorEmpleado;

    public Empleado (String nombre, double sueldo){
        super (nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado (){
        return this.idEmpleado;
    }

    public double getSueldo () {
        return this.sueldo;
    }

    public void setSueldo (double sueldo){
        this.sueldo = sueldo;
    }

    public int getContadorEmpleado (){
        return this.contadorEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\t\tEmpleado {" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + ", contadorEmpleado=" + contadorEmpleado + '}';
    }
}
