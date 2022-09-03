package aula_1;

import java.util.Random;
import java.util.Scanner;

public class Ordenacao {
    static Scanner scanner;
    static Random random;

    static void geraVetor(int[] v) {
        for(int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(v.length * 10);
        }
    }
    static void exibeVetor(int[] v, String msg) {
        System.out.println("\n" + msg);
        for(int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    static void bubble(int[] v) {
        for(int i = 1; i < v.length; i++) {
            for(int j = 0; j < v.length - i; j++) {
                if(v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();

        int n;

        do {
            System.out.print("Digite o tamanho do vetor: ");
            n = scanner.nextInt();
            if(n > 0) {
                int[] v = new int[n];
                geraVetor(v);
                exibeVetor(v, "Vetor gerado.");
                bubble(v);
                exibeVetor(v, "Vetor ordenado");
            }
        } while(n > 0);
    }
}
