package proyecto_caja;

public class PruebaCaja {
    public static void main(String[] args) {

        Caja caja = new Caja (3, 2, 6);

        System.out.println("El volumen es: " + caja.formulaVolumen());
    }
}
