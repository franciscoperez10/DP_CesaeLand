package Models;

public class Custo {

    private int atracaoID;
    private double custoManutencaoBilhete;
    private double custoFixoMes;

    public Custo(int atracao, double custoManutencaoBilhete, double custoFixoMes) {
        this.atracaoID = atracao;
        this.custoManutencaoBilhete = custoManutencaoBilhete;
        this.custoFixoMes = custoFixoMes;
    }

    public int getAtracaoID() {
        return atracaoID;
    }

    public double getCustoManutencaoBilhete() {
        return custoManutencaoBilhete;
    }

    public double getCustoFixoMes() {
        return custoFixoMes;
    }
}
