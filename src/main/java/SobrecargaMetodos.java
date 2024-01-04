import dto.Operaciones;

public class SobrecargaMetodos {
    public static void main(String[] args) {

        System.out.println("Resultado 1: " + Operaciones.suma(3, 2));
        System.out.println("Resultado 2: " + Operaciones.suma(6, 2.3));
        System.out.println("Resultado 3: " + Operaciones.suma(5F, 'A'));
        System.out.println("Resultado 4: " + Operaciones.suma(9.3, 3.3));
    }
}
