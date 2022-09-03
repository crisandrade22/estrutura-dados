package aula_1;

import java.util.Random;
import java.util.Scanner;

//Alta coesão e baixo acoplamento
public class Vetor1 {
    static void geraVetor (int[] v, int limite) {
        Random random = new Random();
        for (int i = 0;  i < v.length ; i++) {
            v[i] = random.nextInt(limite);
        }
    }

    static void exibeVetor(int[] v) {
        System.out.println("\nvetor gerado: ");
        for (int i = 0;  i < v.length ; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

//    realizar a busca por valor no vetor.
    static boolean buscaNaUnha(int valorBuscar, int[] v) {
        int i = 0;
        while (i<v.length) {
            if (v[i] == valorBuscar) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] v;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o limite do vetor: ");
        int limite = scanner.nextInt();

        System.out.print("\nDigite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        System.out.print("Informe o valor que deseja procurar no vetor: ");
        int valorProcura = scanner.nextInt();

        v = new int[tamanho];
        geraVetor(v, limite);
        exibeVetor(v);
        if(buscaNaUnha(valorProcura, v)) {
            System.out.print("Valor Encontrado.");
        }
        else {
            System.out.print("Valor não Encontrado.");
        }

        scanner.close();
    }
}
