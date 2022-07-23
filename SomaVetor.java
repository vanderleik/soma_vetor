import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    /**
     * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
     * - Imprimir todos os elementos do vetor
     * - Mostrar na tela a soma e a média dos elementos do vetor
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double soma, media;
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.println();
        soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        System.out.printf("SOMA = %.1f ", soma);

        System.out.println();
        media = soma / n;
        System.out.printf("MÉDIA = %.1f ", media);

        sc.close();
    }
}
