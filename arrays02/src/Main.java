
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];
        int[] positivos = new int[8];
        int[] negativos = new int[8];

        int contPos = 0;
        int contNeg = 0;

        // Preenchendo o vetor original
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0) {
                positivos[contPos] = numeros[i];
                contPos++;
            } else if (numeros[i] < 0) {
                negativos[contNeg] = numeros[i];
                contNeg++;
            }
        }

        // Mostrando os numeros positivos
        System.out.println("\nVetor de numeros positivos:");
        for (int i = 0; i < contPos; i++) {
            System.out.print(positivos[i] + " ");
        }

        // Mostrando os numeros negativos
        System.out.println("\n\nVetor de numeros negativos:");
        for (int i = 0; i < contNeg; i++) {
            System.out.print(negativos[i] + " ");
        }

        sc.close();
    }
}

