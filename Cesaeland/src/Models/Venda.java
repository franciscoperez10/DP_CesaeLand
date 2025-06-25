package Models;

public class Venda {

    private String atracaoID;
    private int data;
    private String tipoCliente;

    public Venda(String atracao, int data, String tipoCliente) {
        this.atracaoID = atracao;
        this.data = data;
        this.tipoCliente = tipoCliente;
    }

    public String getAtracaoID() {
        return atracaoID;
    }

    public int getData() {
        return data;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
