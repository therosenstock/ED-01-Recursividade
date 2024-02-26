package controller;

public class Exercicio04 {
    public Exercicio04(){
        super();
    }

    public int negativos (int tamanho, int [] v, int total){
        //quando chegar ao final do vetor, deve retornar o total de negativos no vetor
        if(tamanho < 0){
            return total;
        }else{
            if(v[tamanho] < 0){
                total++;
            }
            tamanho--;
            return negativos(tamanho, v, total);
        }
    }
}
