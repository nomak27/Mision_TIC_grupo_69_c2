import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // llamamos la clase Scanner para realizar la entrada por consola
        var sc = new Scanner(System.in);

        // Impresión por consola
        System.out.println("Ingrese el numero entero : ");

        // Obtenemos el numero entero digitado en la consola
        var numero = sc.nextInt();

        // Impresión del resultado llamando a la función numeroDoble.
        System.out.println("El numero doble de "+ numero + " es : " + numeroDoble(numero));
        // Impresion del resultado llamando a la función numeroTriple.
        System.out.println("El numero triple de " + numero + " es : " + numeroTriple(numero));

        System.out.println("------------------------");
        System.out.println(numeroRespuesta(numero));

        System.out.println("------------------------");
        System.out.println("El numero doble de "+ numero + " es : " + calcularNumero(numero,2));
        System.out.println("El numero triple de " + numero + " es : " + calcularNumero(numero,3));
        
    }

    public static int numeroDoble(int numero){
        return numero*2;
    }

    public static int numeroTriple(int numero){
        return numero*3;
    }

    public static String numeroRespuesta(int numero){
        String result = "El numero doble de " + numero + " es : " + (numero*2);
        result += "\n El numero triple de " + numero + " es : " + (numero*3); 

        return result;
    }

    public static int calcularNumero(int numero,int veces){
        return numero * veces;
    }

}
