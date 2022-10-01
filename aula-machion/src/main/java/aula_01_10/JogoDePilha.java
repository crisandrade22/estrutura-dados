package aula_01_10;

import java.util.Random;

public class JogoDePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha(12);
        Random random = new Random();

        do {
            if(random.nextInt() % 2 == 0) {
                if(!p.estaCheia())
                    p.push(random.nextInt(10));
                else {
                    System.out.println("Pilha cheia! Não dá para fazer o push.");
                }
            } else {
                if(!p.estaVazia())
                    System.out.println(p.pop() + " foi desempilhado.");
                else {
                    System.out.println("Pilha vazia, não dá para fazer o pop.");
                }
            }

        System.out.println(p.toString());
        } while (!p.estaVazia());
    }
}
