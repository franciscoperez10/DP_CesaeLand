package Models;

public class Venda {

    private int atracaoID;
    private int data;
    private String tipoCliente;

    public Venda(int atracao, int data, String tipoCliente) {
        this.atracaoID = atracao;
        this.data = data;
        this.tipoCliente = tipoCliente;
    }

    public int getAtracaoID() {
        return atracaoID;
    }

    public int getData() {
        return data;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
