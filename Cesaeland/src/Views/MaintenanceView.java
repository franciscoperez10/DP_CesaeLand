package Views;

import Models.Atracao;
import Models.Venda;
import Repositories.RideRepository;
import Repositories.SaleRepository;

import java.io.FileNotFoundException;
import java.util.*;

public class MaintenanceView {
    public void maintenanceMenu()
    {
        char opcao = ' ';
        while (opcao != '0') {
            Scanner input = new Scanner(System.in)
            do {
                System.out.println("==== Menu Manutencao ====\n\n");
                System.out.println("1. Consultar Próximas Revisões");
                System.out.println("2. Consultar Histórico de Revisões\n");
                System.out.println("0. Sair\n");
                System.out.print("Opcao: ");
                opcao = input.nextLine().charAt(0);
            } while (opcao != '0' && opcao != '1' && opcao != '2');
            dispatcher(opcao);
        }
        
    }

    private void dispatcher(char opcao) {
        switch (opcao){
            case '1':
                consultNext();
                break;
            case '2':
                consultHistory();
                break;
            default:
                break;
        }
    }

    private void consultHistory() {

    }

    private void consultNext() throws FileNotFoundException {
        SaleRepository repo = new SaleRepository();
        Find3IdCloser50(countTickets(repo));
    }

    private void Find3IdCloser50(Map<Integer, Integer> countTickets) {

    }


    private Map<Atracao, Integer> countTickets(SaleRepository saleRepo, RideRepository rideRepo) {
        Map<Atracao, Integer> ticketsSoldMap = new HashMap<>();

        for(Atracao atracaoAtual: rideRepo.getRidesArray()){
            ticketsSoldMap.put(atracaoAtual,0);
        }

        for(Venda vendaAtual: saleRepo.getSalesArray()){
            for(Atracao atracaoAtual: rideRepo.getRidesArray()){
                if(vendaAtual.getAtracaoID()== atracaoAtual.getId()){
                    int numeroBilhetesVendidosAteAgora= ticketsSoldMap.get(atracaoAtual);
                    ticketsSoldMap.put(atracaoAtual,numeroBilhetesVendidosAteAgora+1);
                    break;
                }
            }
        }

        return ticketsSoldMap;
    }

}
