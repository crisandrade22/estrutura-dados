package aula_1;

import java.util.Date;
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

    static int buscaBinaria(int x, int v[]) {
        //devolver uma posição onde x aparece ou -1 caso não seja encontrado o valor.
        int ini = 0;
        int fim = v.length - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            System.out.println("ini: " + ini + " fim: " + fim + " meio: " + meio);
            if(v[meio] == x )
                return meio;
            if(x > v[meio])
                ini = meio + 1;
            else
                fim = meio - 1;
        }
        System.out.println("ini: " + ini + " fim: " + fim);
        return -1;
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

                long ini = new Date().getTime();
//                exibeVetor(v, "Vetor gerado.");
                bubble(v);
                long fim = new Date().getTime();
                System.out.println("Para o vetor tamanho " + n + " o bubble demorou " + (fim - ini) + " milissegundos" +
                        ".");
                System.out.print("Digite um valor para a busca: ");
                int x = scanner.nextInt();

                int posicao = buscaBinaria(x, v);
                if (posicao < 0) {
                    System.out.println(x + " não aparece no vetor.");
                } else {
                    System.out.println(x + "aparece na posição: " + posicao);
                }
//                exibeVetor(v, "Vetor ordenado");
            }
        } while(n > 0);
    }
}
