package Aula10.model;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Inteiros {

    private static final Logger logger = Logger.getLogger(Inteiros.class);
    private List<Integer> listaInteiros = new ArrayList<>();

    public Inteiros() {}

    public void adicionarInteiros(int inteiro){
        listaInteiros.add(inteiro);
    }

    public void contagem() throws Exception{
        if (listaInteiros.size() > 10){
            logger.info("A lista tem mais de 10 itens");
        } else if (listaInteiros.size() > 5){
            logger.info("A lista tem mais de 5 itens");
        } else if (listaInteiros.size() == 0){
            logger.error("A lista não contem elementos :(");
            throw new Exception();
        }
    }

    public void media(){
        int soma = 0;
        for (int i = 0; i < listaInteiros.size(); i++){
            soma += listaInteiros.get(i);
        }
        int media = soma / listaInteiros.size();
        logger.info("A média dos inteiros é " + media);
    }

    @Override
    public String toString() {
        return "Inteiros{" +
                "listaInteiros=" + listaInteiros +
                '}';
    }
}
