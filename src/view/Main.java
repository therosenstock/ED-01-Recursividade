package view;

import controller.Exercicio01;
import controller.Exercicio02;

public class Main {
    // ctrl + 1 = gera variavel
    // ctrll+ f11 = run
    // f11 = debug
    public static void main(String[] args) {

/*        Exercicio01 exe1 = new Exercicio01();
        int resultado01 = exe1.naturais(7);
        System.out.println("Resultado da soma da função Naturais: "+resultado01);*/

        Exercicio02 exe2 = new Exercicio02();
        int [] vetor = {10, 9, 0, 5, 8, 2};
        int tamanho = vetor.length - 1;
        int menor = vetor[tamanho];
        int resultado02 = exe2.menorValor(vetor, tamanho, menor);
        System.out.println("Resultado da função menorIndice: " + resultado02);

    }
}
