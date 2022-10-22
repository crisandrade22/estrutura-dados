package aula_01_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExerciciosPilha {
// criar um método que somente empilha valores menores sobre maiores.
// exemplo válido 2, 4, 7, 9
// exemplo não válido 2, 4, 9, 7

    //    i equivale ao número a ser empilhado
//    peek retorna o elemento que está no topo.
    boolean empilhaHanoi(int i, Pilha p) {
        if (p.estaCheia()) {
            return false;
        } else {
            Pilha pilhaAuxiliar = new Pilha(p.tamanhoPilha());
            while (!p.estaVazia() && p.elementoTopo() < i) {
                pilhaAuxiliar.push(p.pop());
            }
            p.push(i);

            while (!pilhaAuxiliar.estaVazia()) {
                p.push(pilhaAuxiliar.pop());
            }
            return true;
        }
    }

//    um analista brincalhão resolveu pregar uma peça, ele alterou o método
//    pop(): ao invés de desempilhar o último número ele desempilha o penúltimo
//    refaça este procedimento, utilizando pilhas auxiliares, se necessário.
    void brincalhao(int i, Pilha pilha) {
        Pilha pilhaAuxiliar = new Pilha(pilha.tamanhoPilha());

        while (!pilha.estaVazia() && pilha.elementoTopo() < i) {
            if (pilha.estaVazia()) {
                pilha.push(i);
            } else if (pilha.elementoTopo() < i && !pilha.estaCheia()) {
                pilhaAuxiliar.push(pilha.pop());
            }
        }
        pilha.push(i);

        while (!pilhaAuxiliar.estaVazia()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }

    int popRetorna(Pilha pilha) {

        if(pilha.tamanhoPilha() > 1) {
            int auxiliar = pilha.elementoTopo();
            int retorna = pilha.popRetornaPenultimo();
            pilha.push(auxiliar);
            return retorna;
        } else {
            return pilha.pop();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Pilha pilhaHanoi = new Pilha(6);
        ExerciciosPilha exerciciosPilha = new ExerciciosPilha();

        for(int i = 0; i<6; i++) {
            exerciciosPilha.empilhaHanoi(random.nextInt(6), pilhaHanoi);
        }
        System.out.println("Pilha Hanoi");
        System.out.println(pilhaHanoi.toString());

//        Pilha testePenultimo = new Pilha(4);
//        testePenultimo.push(2);
//        testePenultimo.push(4);
//        testePenultimo.push(9);
//        testePenultimo.push(7);
//
//        System.out.println(testePenultimo.toString());
//
//        System.out.println("Elemento topo: " + testePenultimo.elementoTopo());
//
//        System.out.println("Pop penultimo: " + testePenultimo.popRetornaPenultimo());
//        System.out.println("Pop: " + testePenultimo.pop());

        Pilha pilha = new Pilha(4);
        List<Integer> listaBrincalhao = new ArrayList<>(List.of(2, 4, 9, 7));

        for (Integer numero : listaBrincalhao) {
            exerciciosPilha.brincalhao(numero, pilha);
        }
        System.out.println("\nPilha organizada: " + pilha.toString());
        System.out.println("Pop: " + exerciciosPilha.popRetorna(pilha));
        System.out.println("Pop: " + exerciciosPilha.popRetorna(pilha));
        System.out.println("Pop: " + exerciciosPilha.popRetorna(pilha));
        System.out.println("Pop: " + exerciciosPilha.popRetorna(pilha));
        System.out.println(pilha.toString());
    }
}
