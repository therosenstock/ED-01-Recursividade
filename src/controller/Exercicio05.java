package controller;

public class Exercicio05 {
    public Exercicio05(){
        super();
    }

    public double serieFracao (int n, double total){
        if(n == 1){
            return 1;
        } else{
            return (double) 1 /n + serieFracao(n-1, total);
        }
    }
}
