package aula_1;

import java.util.Random;
import java.util.Scanner;

public class CassinoProfessora {
    static Random random;
    static Scanner scanner;
    static void simulaLancamentos (int[] v) {
        for(int i = 0;i < v.length; i++)
            v[i] = random.nextInt(6) + 1;
    }
    static void megasena (int v[]) {
        v[0] = random.nextInt(60) + 1;
        int i = 1;
        while (i<6) {
            int n = random.nextInt(60) + 1;
            int j = i-1;
            boolean achei = false;
            while (j>=0 && !achei)
                if (v[j] == n)
                    achei=true;
                else
                    j--;
            if (!achei)
                v[i++] = n;
        }
    }
    static void exibeVetor (int[] v, String msg) {
        System.out.println("\n" + msg);
        for(int i=0; i < v.length; i++)
            System.out.print(v[i] + " ");
        System.out.println();
    }
    static void contagem (int[] v, int[] c ) {
        for (int i = 0; i < v.length; i++) {
            c[v[i]]++;
        }
    }

    static void permutacao(int[]v) {
        v[0] = random.nextInt(v.length) + 1;
        int i = 1;
        while(i < v.length) {
            int n = random.nextInt(v.length) + 1;
            int j = i - 1;
            boolean achei = false;
            while(j >=0 && !achei) {
                if(v[j] == n) {
                    achei = true;
                    System.out.print("x");
                }
                else {
                    j--;
                }
            }
            if(!achei) {
                v[i++] = n;
                System.out.print(".");
            }
        }
    }
    static int menu () {
        System.out.println("Escolha seu jogo");
        System.out.println("1 - dados");
        System.out.println("2 - megasena");
        System.out.println("3 - gera permutacao");
        System.out.println("4 - sair");
        System.out.println("--> ");
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        scanner = new Scanner (System.in);
        random = new Random();
        int op;

        do {
            op = menu();

            switch (op) {
                case 1: {
                    System.out.print("Digite o número de lancamentos: ");
                    int l = scanner.nextInt();
                    int[] v = new int[l];
                    simulaLancamentos(v);
                    exibeVetor(v, "Lista de lançamentos.");
                    int[] c = new int[7];
                    contagem(v, c);
                    exibeVetor(c, "Frequência de valores.");
                    break;
                }
                case 2: {
                    int[] v = new int[6];
                    megasena(v);
                    exibeVetor(v, "Veja o seu jogo");
                    break;
                }
                case 3: {
                    System.out.print("Digite o tamanho da permutação: ");
                    int p = scanner.nextInt();
                    int[] v = new int[p];
                    permutacao(v);
                    exibeVetor(v, "Permutação");
                }

                case 4:
                    System.out.println("Obrigado, volte sempre!");
                    break;
                default:
                    System.out.println("opção Inválida.");
            }
        }while(op != 4);
        scanner.close();
    }
}
