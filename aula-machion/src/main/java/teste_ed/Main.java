package teste_ed;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroGerado = random.nextInt(60) + 1;
        System.out.println(numeroGerado);

    }
}
