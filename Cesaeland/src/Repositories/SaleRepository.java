package Repositories;

public class SaleRepository {
    private ArrayList<Venda> vendaArray;

    public SalesRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();

        this.vendaArray = csvFR.VendaFileReader("Files/Cesaeland_vendas.csv");
    }

    public ArrayList<Venda> getSalesArray() {
        return vendaArray;
    }
}
