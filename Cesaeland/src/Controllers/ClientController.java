package Controllers;

import Models.Atracao;
import Repositories.RideRepository;
import Repositories.SaleRepository;
import Views.ClientView;

import java.util.ArrayList;
import java.util.Scanner;


public class ClientController {

    private RideRepository rideRepository;
    private SaleRepository saleRepository;
    private ClientView view;

    public ClientController(RideRepository rideRepository, SaleRepository saleRepository, ClientView view) {
        this.rideRepository = rideRepository;
        this.saleRepository = saleRepository;
        this.view = view;
    }

    public void menuCliente() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("***** MENU CLIENTE *****");
            System.out.println("Insira o número do menu que quer consultar");
            System.out.println("1.Atrações Disponíveis");
            System.out.println("2.Atrações Favoritas");
            System.out.println("0. Sair");


            switch (opcao) {
                case 1:
                    consultarAtracoesDisponiveis();
                    break;
                case 2:
                    consultarAtracoesFavoritas();
                    break;
                case 0:
                    System.out.println("A sair do menu Cliente.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void consultarAtracoesFavoritas() {
        System.out.println("Atração mais procurada pelos adultos: ");
        System.out.println("Atração mais procurada pelas crianças: ");

    }

    public void consultarAtracoesDisponiveis() {
        ArrayList<Atracao> atracoes = rideRepository.getRidesArray();
        System.out.println("ID | Atrações | Preço dos Bilhetes | Duração da Atração");

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


