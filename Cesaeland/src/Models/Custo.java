package Models;

public class Custo {

    private String atracaoID;
    private double custoManutencaoBilhete;
    private double custoFixoMes;

    public Custo(String atracao, double custoManutencaoBilhete, double custoFixoMes) {
        this.atracaoID = atracao;
        this.custoManutencaoBilhete = custoManutencaoBilhete;
        this.custoFixoMes = custoFixoMes;
    }

    public String getAtracaoID() {
        return atracaoID;
    }

    public double getCustoManutencaoBilhete() {
        return custoManutencaoBilhete;
    }

    public double getCustoFixoMes() {
        return custoFixoMes;
    }
}
