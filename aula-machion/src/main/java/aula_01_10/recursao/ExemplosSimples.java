package aula_01_10.recursao;

import java.sql.SQLOutput;

public class ExemplosSimples {
    static void imprime1aN(int i, int n) {
        System.out.println(i);
        if (i < n ) {
//            imprime1aN(i+1, n);
//            imprime1aN(++i, n);
            imprime1aN(i++, n);
        }
        System.out.println("Voltei para i = " + i);
    }

    public static void main(String[] args) {
        int n = 10;
        imprime1aN(1, n);
    }
}
