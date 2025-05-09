package service;

public class Questao02 {

    public void perteceFibonacci(int numero){
        if(numero < 0)
            System.out.println("O numero "+numero+" não pertece a sequencia");

        int x = 0 , anterior = 1;
        boolean pertence = (numero == 0);

        while(anterior <= numero){
            if(anterior == numero){
                pertence = true;
                break;
            }
            int proximo = x + anterior;
            x = anterior;
            anterior = proximo;
        }

        if(pertence)
            System.out.println("O numero: "+numero+" pertence a senquencia de Fibonacci");
        else
            System.out.println("O numero: "+numero+" não pertence a senquencia de Fibonacci");
    }
}
