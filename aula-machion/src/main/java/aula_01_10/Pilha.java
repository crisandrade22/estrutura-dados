package aula_01_10;
public class Pilha {
    private int topo;
    private int[] dados;
    public Pilha(int capacidade) {
        this.topo = 0;
        this.dados = new int[capacidade];
    }
    public boolean estaVazia() {
        return this.topo == 0;
    }
    public boolean estaCheia() {
        return this.topo == dados.length;
    }

    public void push(int novo) {
        this.dados[this.topo++] = novo;
    }

    public int pop () {
        return this.dados[--this.topo];
    }

    public int popRetornaPenultimo() {
        --this.topo;
        --this.topo;
        return this.dados[this.topo];
    }

    public int elementoTopo() {
        return this.dados[this.topo-1];
    }
    public int tamanhoPilha() {
        return this.topo;
    }
    @Override
    public String toString() {
        String s = "";
        if(this.estaVazia()) {
            s = s + "está vazia.";
        } else {
            for(int i = this.topo - 1; i >= 0; i--) {
                s = s + this.dados[i] + " ";
            }
        }
        return s;
    }
}
