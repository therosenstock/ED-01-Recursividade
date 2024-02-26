package controller;

public class Exercicio03 {
    public Exercicio03(){
        super();
    }
    public int fatorial (int n){
        // condição de parada é 0, para obedecer não alterar o resultado na decrementação
        if(n <= 0){
            return 1;
        } else{
            return n * (fatorial(n-1));
        }
    }
}
