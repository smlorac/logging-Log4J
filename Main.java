package Aula10;

import Aula10.model.Inteiros;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        BasicConfigurator.configure();

        Inteiros lista = new Inteiros();

        lista.adicionarInteiros(1);
        lista.adicionarInteiros(2);
        lista.adicionarInteiros(3);
        
        //testando se deu certo a lista
        System.out.println(lista.toString());

        //até esse ponto não aparece nada
        lista.contagem();
        lista.media();

        lista.adicionarInteiros(5);
        lista.adicionarInteiros(6);
        lista.adicionarInteiros(10);

        //aqui aparece
        lista.contagem();

        Inteiros lista2 = new Inteiros();

        //pra gerar erro
        lista2.contagem();

    }
}
