package aula_1;

import java.util.Random;
import java.util.Scanner;

public class Aula17 {
    static Scanner scanner;
    static Random random;

    static void geraVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(v.length * 10);
        }
    }
    static boolean buscaBinaria(int x, int v[], Inteiro contBinaria) {
        int ini = 0;
        int fim = v.length - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            contBinaria.incrementa();
//            System.out.println("ini: " + ini + " fim: " + fim + " meio: " + meio);
            if (v[meio] == x) {
                return true;
            }
            if (x > v[meio]) {
                ini = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
//        System.out.println("ini: " + ini + " fim: " + fim);
        return false;
    }

    static boolean buscaSimples(int x, int[] v, Inteiro contSimples) {
        int i = 0;
        while (i < v.length) {
            contSimples.incrementa();
            if (v[i] == x) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void selection(int[] v) {
        for (int i = 0; i < v.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < v.length; ++j)
                if (v[j] < v[min]) min = j;
            int x = v[i];
            v[i] = v[min];
            v[min] = x;
        }
    }
    static void exibeVetor(int[] v, String msg) {
        System.out.println("\n" + msg);
        for(int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();

        Inteiro contSimples = new Inteiro(0);
        Inteiro contBinaria = new Inteiro(0);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] v = new int[tamanho];
        geraVetor(v);
//        exibeVetor(v, "Vetor Sem Ordenacao");
        System.out.print("Digite o valor para busca: ");
        int n = scanner.nextInt();
        if (buscaSimples(n, v, contSimples)) {
            System.out.print("\nValor encontrado pela busca.");
        } else {
            System.out.println("\nValor não encontrado pela busca.");
        }
        System.out.println("\nForam realizadas " + contSimples + " buscas simples.");

        selection(v);
//        exibeVetor(v,"Vetor Ordenado");

        if (buscaBinaria(n, v, contBinaria)) {
            System.out.print("\nValor encontrado pela busca.");
        } else {
            System.out.println("\nValor não encontrado pela busca.");
        }
        System.out.println("\nForam realizadas " + contBinaria + " buscas binárias.");
    }
}
