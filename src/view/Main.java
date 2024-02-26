package view;

import controller.*;

public class Main {
    // ctrl + 1 = gera variavel
    // ctrll+ f11 = run
    // f11 = debug
    public static void main(String[] args) {

        Exercicio01 exe1 = new Exercicio01();
        int resultado01 = exe1.naturais(7);
        System.out.println("Resultado da soma da função Naturais: "+resultado01);

        Exercicio02 exe2 = new Exercicio02();
        int [] vetor2 = {10, 9, -80, 5, 8, 2};
        int tamanho2 = vetor2.length - 1;
        int menor = vetor2[tamanho2];
        int resultado02 = exe2.menorValor(vetor2, tamanho2, menor);
        System.out.println("Resultado da função menorIndice: " + resultado02);

        Exercicio03 exe3 = new Exercicio03();
        int resultado03 = exe3.fatorial(5);
        System.out.println("Resultado da função fatorial: "+ resultado03);

        Exercicio04 exe4 = new Exercicio04();
        int [] vetor4 = {-1, -9, 8, -2, -40, 60};
        int tamanho4 = vetor4.length-1;
        int resultado4 = exe4.negativos(tamanho4, vetor4, 0);
        System.out.println("Resultado da função negativos: "+ resultado4);

        Exercicio05 exe5 = new Exercicio05();
        double resultado5 = exe5.serieFracao(3, 0);
        System.out.println("Resultado da função serieNegativa: "+resultado5);
    }
}
