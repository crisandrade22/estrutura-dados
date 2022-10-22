package estudo_prova_1;

public class PilhaParaEstudo {
    private int topo;
    private int[] dados;

    public PilhaParaEstudo(int capacidade) {
        this.topo = 0;
        this.dados = new int[capacidade];
    }

    public boolean estaVazia() {
        return this.topo == 0;
    }

    public boolean estaCheia() {
        return this.topo == dados.length;
    }

    public void push(int numero) {
        this.dados[this.topo++] = numero;
    }

    public int pop() {
        return this.dados[--this.topo];
    }

    public int peek() {
        return this.topo--;
    }

    public int tamanhoPilha() {
        return this.topo;
    }

    @Override
    public String toString() {
        String s = "";
        if(this.estaVazia()) {
            s = s + " está vazia.";
        } else {
            for(int i = this.topo - 1; i >= 0; i--) {
                s = s + this.dados[i] + " ";
            }
        }
        return s;
    }
}
