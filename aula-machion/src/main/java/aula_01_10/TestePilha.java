package aula_01_10;

import java.util.Scanner;

public class TestePilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a capacidade da pilha: ");
        int capacidade = scanner.nextInt();

        Pilha pilha = new Pilha(capacidade);

        if (pilha.estaVazia()) {
            System.out.println("Pilha está vazia.");
        } else {
            System.out.println("Pilha não está vazia.");
        }
        if (pilha.estaCheia()) {
            System.out.println("Pilha está cheia.");
        } else {
            System.out.println("Pilha não está cheia.");
        }

        int i = 10;
        while(!pilha.estaCheia()) {
            pilha.push(i++);
            System.out.println(pilha);
        }

        System.out.println("Peek: " + pilha.elementoTopo());

        while(!pilha.estaVazia()) {
            System.out.println(pilha.pop());
        }
        System.out.println(pilha);
        scanner.close();
    }
}

