public class PracticaReturnObject {
    public static void main(String[] args) {
        Suma s = crearObjetoSuma();
        System.out.println("El resultado es: " + s.sumar());
    }

    public static Suma crearObjetoSuma (){
        return new Suma(5, 8);
    }
}

//Creo otra clase, debe ser por fuera del bloque de la clase public y no puede ser public:
class Suma {
    //Variables de clase
    int a;
    int b;

    //Creo el constructor que recibe argumentos
    public Suma (int a, int b){
        //Inicializo las variables
        this.a = a;
        this.b = b;
    }

    //Creo el metodo
    public int sumar (){
        return this.a + this.b;
    }
}

