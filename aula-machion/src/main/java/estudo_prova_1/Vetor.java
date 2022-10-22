package estudo_prova_1;

import java.util.Random;
import java.util.Scanner;

public class Vetor {
    public void exibeVetor(int[]vetor) {
        for(int i = 0; i<vetor.length; i++) {
            System.out.print(vetor[i] + " | ");
        }
        System.out.println();
    }

    public int[] criaVetor(int tamanho) {
        Random random = new Random();
        int[] vetor = new int[tamanho];

        for(int i = 0; i<vetor.length; i++) {
            vetor[i] = random.nextInt(10);
        }
        return vetor;
    }

    public int[] bubble(int[] vetor) {
        for(int i = 1; i < vetor.length; i++) {
            for(int j = 0; j < vetor.length - i; j++) {
                if(vetor[j] > vetor[j+1]) {
                    int auxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = auxiliar;
                }
            }
        }
        return vetor;
    }

    public int[] insertion(int[] vetor) {
        for(int j = 1; j < vetor.length; ++j) {
            int auxiliar = vetor[j];
            int i;
            for(i = j - 1; i >= 0 && vetor[i] > auxiliar; --i) {
                vetor[i+1] = vetor[i];
            }
            vetor[i+1] = auxiliar;
        }
        return vetor;
    }

    public int[] selection(int[] vetor) {
        for(int i = 0; i < vetor.length - 1; ++i) {
            int posicaoComparacao = i;
            for(int j = i+1; j < vetor.length; ++j) {
                if (vetor[j] < vetor[posicaoComparacao]) {
                    posicaoComparacao = j;
                }
            }
            int auxiliar = vetor[i];
            vetor[i] = vetor[posicaoComparacao];
            vetor[posicaoComparacao] = auxiliar;
        }
        return vetor;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();

        Vetor instanciaClasse = new Vetor();

        int[] vetor = instanciaClasse.criaVetor(tamanhoVetor);
        instanciaClasse.exibeVetor(vetor);
//        instanciaClasse.bubble(vetor);
//        instanciaClasse.exibeVetor(vetor);
//        instanciaClasse.insertion(vetor);
//        instanciaClasse.exibeVetor(vetor);
        instanciaClasse.selection(vetor);
        instanciaClasse.exibeVetor(vetor);
    }

}
