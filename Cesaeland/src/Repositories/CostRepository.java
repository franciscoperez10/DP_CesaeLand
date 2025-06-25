package Repositories;

public class CostRepository {
    private ArrayList<Custo> custoArray;

    public RideRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();

        this.custoArray = csvFR.CustoFileReader("Files/Cesaeland_custos.csv");
    }

    public ArrayList<Custo> getCostsArray() {
        return custoArray;
    }
}
