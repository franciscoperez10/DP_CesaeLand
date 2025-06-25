package Views;

import Models.Venda;
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


    private Map<Integer, Integer> countTickets(SaleRepository repo) {
        Map<Integer, Integer> count = new HashMap<>();

        Venda[] vendas = repo.getSalesArray().toArray(new Venda[0]);

        for (Venda venda : vendas) {
            int atracaoId = venda.getAtracaoID();

            // Se o ID já estiver no mapa, incrementa o valor
            if (count.containsKey(atracaoId)) {
                count.put(atracaoId, count.get(atracaoId) + 1);
            } else {
                count.put(atracaoId, 1);
            }
        }
        return count;
    }

}
