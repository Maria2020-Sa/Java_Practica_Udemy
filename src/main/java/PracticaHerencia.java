import java.util.Date;

public class PracticaHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ("Maria", 20000);
        empleado1.setGenero('F');
        empleado1.setEdad(32);
        empleado1.setDireccion("Calle 9 y España");
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Fran");
        cliente1.setEdad(33);
        cliente1.setGenero('M');
        System.out.println("cliente1 = " + cliente1);
    }
}