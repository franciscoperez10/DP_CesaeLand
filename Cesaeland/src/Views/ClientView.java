package Views;

import Models.Atracao;

public class ClientView {

    public void menuCliente () {
        System.out.println("***** MENU CLIENTE *****");
        System.out.println("Insira o número do menu que quer consultar");
        System.out.println("1.Atrações Disponíveis");
        System.out.println("2.Atrações Favoritas");
        System.out.println("0. Sair");
    }

    public void consultarAtracoesDisponiveis () {
        System.out.println("**** ATRAÇÕES DISPONIVEIS *****");
        System.out.println("1. Consultar Atrações Disponíveis");
        System.out.println("2. Consultar Atrações Favoritas");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

        for (Atracao atracao : atracoes) {

            int minutos = atracao.getDuracaoSegundos() / 60;
            int segundos = atracao.getDuracaoSegundos() % 60;

            String duracao;
            if (segundos < 10) {
                duracao = minutos + ":0" + segundos;
            } else {
                duracao = minutos + ":" + segundos;

            }

            System.out.println(atracao.getId() + " | " + atracao.getAtracao() + " | " + atracao.getPrecoAdulto() + " | " + atracao.getPrecoCrianca() + " | " + duracao);

        }
    }
}
