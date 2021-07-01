import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el nombre");
            String result = entrada.nextLine();
            
            int valor = 3;

            if (valor > 4) {
                System.out.println("Correcto!");
            } else if (valor <= 3) {
                System.out.println("Correcto valor menor o igual a 3");
            } else {
                System.out.println("Incorrecto");
            }

            if (result == "isr"){
                System.out.println("Es correcto");
            } else if (result.equals("isr")){
                System.out.println("Es correcto");
            } else {
                System.out.println("No es correcto");
            }

            if (result != "isr") {
                System.out.println("Son diferentes");
            } else {
                System.out.println("Son Iguales");
            }
        */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int result = entrada.nextInt();

        switch (result){
            case 1:
                // operación
                System.out.println("Caso 1 correcto");
                break;
            case 2:
                // operación
                System.out.println("Caso 2 correcto");
                break;
            default:
                // operación
                System.out.println("Ninguna de las anteriores");
        }

    }
}
