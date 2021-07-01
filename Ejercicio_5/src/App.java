public class App {
    public static void main(String[] args) throws Exception {
        
        // Ciclo de for

        /*
            for(int i = 0; i < 100; i++){
                System.out.println("numero es: " + i);
            }
        */

        // Ciclo del while

            /*
            var numero = 0;
            while (numero < 100){
                if (numero == 10){
                    break;
                }
                System.out.println("Numero while es : " + numero);
                numero++;
            }

            // Quiero solo imprimir desde el 100 hasta 120 y desde el 180 hasta el 200.

            do {  
                if ((numero >= 100) && (numero <= 120)){
                    System.out.println("Numero do while es : " + numero);
                    //continue;
                }
                numero++;
            } while (numero < 200);
        */

        var a = 5;
        var b = a++;

        System.out.println("valor de a : " + a);
        System.out.println("valor de b : " + b);

        var c = 5;
        var d = ++c;

        System.out.println("valor de c : " + c);
        System.out.println("valor de d : " + d);

    }
}
