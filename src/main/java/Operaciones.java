public class Operaciones {

    public static int suma (int a, int b){
        System.out.println("Metodo suma (int a, int b: ");
        return a + b;
    }

    public static double suma (int a, double b){
        System.out.println("Metodo suma sobrecargado (int a, double b: ");
        return  a + b;
    }

    public static double suma (double a, int b){
        System.out.println("Metodo suma sobrecargado (double a, int b: ");
        return a + b;
    }

    public static double suma (double a, double b){
        System.out.println("Metodo suma sobrecargado (double a, double b: ");
        return a + b;
    }
}