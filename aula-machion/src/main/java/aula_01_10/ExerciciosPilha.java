package aula_01_10;

public class ExerciciosPilha {
// criar um método que somente empilha valores menores sobre maiores.
// exemplo válido 2, 4, 7, 9
// exemplo não válido 2, 4, 9, 7

//    i equivale ao número a ser empilhado
    boolean empilhaHanoi(int i, Pilha p) {
        if(p.estaCheia()) {
            return false;
        }
        Pilha pilhaAuxiliar = new Pilha(p.tamanhoPilha());
//    peek retorna o elemento que está no topo.
        while (p.peek() < i) {
            pilhaAuxiliar.push(p.pop());
        }
        p.push(i);

        while(!pilhaAuxiliar.estaVazia() && p.peek() < i) {
            p.push(pilhaAuxiliar.pop());
        }
        return true;
    }

//    um analista brincalhão resolveu pregar uma peça, ele alterou o método
//    pop(): ao invés de desempilhar o último número ele desempilha o penúltimo
//    refaça este procedimento, utilizando pilhas auxiliares, se necessário.
    public static void main(String[] args) {

    }
}
