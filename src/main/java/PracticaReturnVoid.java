
//Return usando tipos Primitivos y la palabra Void.

public class PracticaReturnVoid {
    public static void main(String[] args) {
        sumarSinRetornar(3,5);

        int resultado = sumarConRetorno(10, 5);
        System.out.println("resultado = " + resultado);
    }

    private static void sumarSinRetornar(int a, int b) {
        System.out.println("Suma sin retorno: " + (a + b));
    }

    private static int sumarConRetorno (int a, int b){
        if (a == 0 && b == 0){
            System.out.println("Todos los valores son cero!...");
            return 0;
        }
        System.out.println("Los valores son distintos de cero: ");
        return a + b;
    }
}
