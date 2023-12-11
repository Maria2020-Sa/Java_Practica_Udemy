package ejercicio_metodos_udemy;

public class Aritmetica {
    //atributos de la clase
    int a;
    int b;

    //Constructor vacío de la clase. Sirve para inicializar variables.
    public Aritmetica(){
        System.out.println("Ejecutando contructor vacio");
    }
    //Constructor con dos argumentos.
    public Aritmetica (int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con dos argumentos");
    }

    public int sumar (){
        return this.a + this.b;
    }

    public int restar (){
        return this.a - this.b;
    }

    public int multiplicar (){
        return this.a * this.b;
    }

    public int dividir (){
        return this.a / this.b;
    }
}
