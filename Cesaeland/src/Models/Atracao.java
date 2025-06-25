package Models;

public class Atracao {

    private int id;
    private int atracao;
    private double precoAdulto;
    private double precoCrianca;
    private int duracaoSegundos;

    public Atracao(int id, int atracao, double precoAdulto, double precoCrianca, int duracaoSegundos) {
        this.id = id;
        this.atracao = atracao;
        this.precoAdulto = precoAdulto;
        this.precoCrianca = precoCrianca;
        this.duracaoSegundos = duracaoSegundos;
    }

    public int getId() {
        return id;
    }

    public String getAtracao() {
        return atracao;
    }

    public double getPrecoAdulto() {
        return precoAdulto;
    }

    public double getPrecoCrianca() {
        return precoCrianca;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }
}
