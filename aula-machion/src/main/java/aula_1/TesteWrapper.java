package aula_1;

public class TesteWrapper {

// Só é possível retornar um valor.
// Se recebessemos um i e um j, não seria possível retornar o valor de ambos.
// Uma alternativa é utilizar o wrapper Integer, depois do java 8 isso não foi mais possível.
    static void naoAltera(int i) {
        i = i * 10;
    }

//    Integers são imutáveis, portanto não funcionam para a alteração do valor do número.
    static void altera (Integer i) {
        int k = i.intValue();
    }
    static void alteraNovo(Inteiro i) {
        i.setValor(i.getValor()*10);
    }

    public static void main(String[] args) {
        int i = 10;

        System.out.println("Variável i antes do método não altera: " + i);
        naoAltera(i);
        System.out.println("Variável i depois do não altera: " + i);
        Inteiro inteiro = new Inteiro(i);
        alteraNovo(inteiro);
        System.out.println("Variável i depois do altera: " + inteiro.getValor());
    }
}
