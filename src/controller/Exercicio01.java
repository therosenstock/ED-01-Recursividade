package controller;

public class Exercicio01 {
    public Exercicio01() {
        super();
    }

    public int naturais(int n) {
        // Uma vez que naturais são números positivos, quando N chegar a ZERO
        // a função deve parar de injetar novos valores
        if(n == 0) {
            return 0;
        } else {
            int val = n - 1;
            return n + naturais(val);
        }
    }
}
