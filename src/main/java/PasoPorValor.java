public class PasoPorValor {
    public static void main(String[] args) {
        
        int numero = 10;
        System.out.println("numero = " + numero);
        
        cambiarValor(numero);
        System.out.println("numero = " + numero);
    }

    private static void cambiarValor(int argumento) {
        argumento = 20;
        System.out.println("argumento = " + argumento);
    }
}
