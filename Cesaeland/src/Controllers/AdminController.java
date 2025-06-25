package Controllers;

import Models.Atracao;
import Models.Custo;
import Models.Venda;
import Repositories.CostRepository;
import Repositories.RideRepository;
import Repositories.SaleRepository;

import java.io.FileNotFoundException;

public class AdminController {
    private SaleRepository salesRepository;
    private RideRepository rideRepository;
    private CostRepository costRepository;

    public AdminController() throws FileNotFoundException {
        this.salesRepository = new SaleRepository();
        this.rideRepository = new RideRepository();
        this.costRepository = new CostRepository();
    }

    public double totalVendas() {

        double totalVendas = 0;
        double preco = 0;

        for(Venda vendaAtual : this.salesRepository.getSalesArray()){
            for(Atracao atracaoAtual : this.rideRepository.getRidesArray()){

                if(vendaAtual.getTipoCliente().equals("adulto") && atracaoAtual.getId() == vendaAtual.getAtracaoID()){
                    preco += atracaoAtual.getPrecoAdulto();
                }
                if(vendaAtual.getTipoCliente().equals("crianca") && atracaoAtual.getId() == vendaAtual.getAtracaoID()){
                    preco += atracaoAtual.getPrecoAdulto();
                }
            }
        }
        return totalVendas;
    }

    public double lucro(){
        double lucro;
        double custo = 0;

        for(Venda vendaAtual : this.salesRepository.getSalesArray()){
            for(Custo custoAtual : this.costRepository.getCostsArray()){

                if(vendaAtual.getAtracaoID() == custoAtual.getAtracaoID()){
                    custo += custoAtual.getCustoManutencaoBilhete();
                }
            }
        }

        for (Custo custoAtual : this.costRepository.getCostsArray()){
            custo += custoAtual.getCustoFixoMes();
        }


        lucro = totalVendas() - custo;
        return lucro;
    }

    public void TotalVendasLucroMes(){

        this.salesRepository.getSalesArray();

    }




































}
