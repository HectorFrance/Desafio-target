package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Qeustao03 {

    static class FaturamentoDiario{
        int dia;
        float valor;
    }

    public void lerFaturamento(){
        try {
            Gson gson = new Gson();
            FileReader leitor = new FileReader("src/Utils/dados.json");
            Type listType = new TypeToken<List<FaturamentoDiario>>() {}.getType();
            List<FaturamentoDiario> faturamentos  = gson.fromJson(leitor, listType);
            leitor.close();


            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamentos = 0.0;
            int diasValidos = 0;

            for (FaturamentoDiario dia : faturamentos) {
                if (dia.valor > 0.0) {
                    if (dia.valor < menorFaturamento) menorFaturamento = dia.valor;
                    if (dia.valor > maiorFaturamento) maiorFaturamento = dia.valor;
                    somaFaturamentos += dia.valor;
                    diasValidos++;
                }
            }

            double media = somaFaturamentos / diasValidos;
            int diasAcimaDaMedia = 0;

            for (FaturamentoDiario dia : faturamentos) {
                if (dia.valor > media) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.printf("Menor faturamento: R$ %.2f\n", menorFaturamento);
            System.out.printf("Maior faturamento: R$ %.2f\n", maiorFaturamento);
            System.out.println("Dias com faturamento acima da média: "+ diasAcimaDaMedia);

        } catch (FileNotFoundException e) {
            System.out.println("Falha ao localizar Arquivo");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(("Falha ao carregar Arquivo: "+e.getMessage()));
        }
    }
}
