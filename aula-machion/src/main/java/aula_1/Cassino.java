package aula_1;

import java.util.Random;
import java.util.Scanner;

public class Cassino {
    static Random random;
    static Scanner scanner;
    static void simulaLancamentos(int[]v) {
        for(int i =0; i<v.length; i++) {
            v[i] = random.nextInt(6 )+ 1;
        }
    }

    static void megasena(int v[]) {
        v[0] = random.nextInt(60) + 1;
        int i = 1;
        while (i < 6) {
            int n = random.nextInt(60) + 1;
            int j = i - 1;
            boolean achei = false;
            while(j >= 0 && !achei) {
                if(v[j] == n) {
                    achei = true;
                }
                else {
                    j--;
                }
            if(achei){
                v[i++] = n;
                }
            }
        }
    }
    static void exibeLancamentos(int[]v) {
//        System.out.print("\n" + msg);
        for(int i =0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    static void contagem(int[] v, int[] c) {
        for (int i = 0; i < v.length; i++) {
            c[v[i]]++;
        }
    }
    static int menu() {
        System.out.println("Escolha seu jogo");
        System.out.println("1 - Dados");
        System.out.println("2 - Megasena");
        System.out.println("-->");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();

        System.out.print("Digite o número de lançamentos: ");
        int l = scanner.nextInt();
        int[] v = new int[l];
        simulaLancamentos(v);
        exibeLancamentos(v);
        int[] c = new int[7];
        contagem(v,c);
        exibeLancamentos(c);
        estatistica(c);

        //Criar método para mostrar o vetor de contagem melhor.

    }

    private static void estatistica(int[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.println((i + 1 )+ " : " + c[i]);
        }
        System.out.println();
    }
}
