package controller;

public class Exercicio02 {
    public Exercicio02() {
        super();
    }

    public int menorValor (int [] v, int tamanho, int menor) {
        // A função começa no último indíce e decrementa até 0, que impede que estoure
        // um erro e retorna enfim o menor valor após as comparações
        if(tamanho == 0){
            return menor;
        } else {
            tamanho--;
            int atual = v[tamanho];
            if(menor > atual){
                menor = atual;
            }
            return menorValor(v, tamanho, menor);
        }

    }
}
