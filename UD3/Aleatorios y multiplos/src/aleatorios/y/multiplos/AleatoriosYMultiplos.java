package aleatorios.y.multiplos;

/**
 *
 * @author aidan
 */
public class AleatoriosYMultiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            int num = (int) (Math.random() * (100)) + 1;
            numeros[i] = num;

        }
        calculaMultiplos(numeros, 2);
        calculaMultiplos(numeros, 3);
        calculaMultiplos(numeros, 5);
    }

    public static void calculaMultiplos(int[] num, int valor) {
        String result = "";
        int contador = 0;
        for (int i = 0; i < num.length; i++) {
            if (contador == 0) {
                if (num[i] % valor == 0) {
                    // result=String.valueOf(num[i]);
                    result = result + num[i];
                    contador++;
                    continue;
                }
            } else {
                if (num[i] % valor == 0) {
                    result = result + "," + num[i];

                }
            }
        }
        if (result.isEmpty()) {
            System.out.println("No hay multiplos de " + valor);
        } else {
            System.out.println("Los multiplos de " + valor + " son: " + result);
        }
    }

}
//Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
//(ambos incluidos) y que los muestre por pantalla. A continuación, el programa deberá mostrar por
//separado los múltiplos de 2, de 3 y de 5.
