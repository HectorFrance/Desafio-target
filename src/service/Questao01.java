package service;

public class Questao01 {
    int k = 0, indice = 13 , soma = 0;

    public void loopQuestão(){
        while(k<indice){
            k = k+ 1;
            soma = soma + k;
        }
        System.out.println("O resultado final da soma é: "+soma);
    }

}
