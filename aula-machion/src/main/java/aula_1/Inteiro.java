package aula_1;

public class Inteiro {
    private int valor;

//    Construtor
//    Caso tenha regra de negócio, a regra fica no set e o construtor utiliza o setvalor então.
    public Inteiro(int valor) {
        this.setValor(valor);
    }
// Método de acesso
    public int getValor() {
        return this.valor;
    }
// Método modificador
    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return String.valueOf(this.valor);
    }

    public void incrementa() {
        this.valor++;
    }
}

