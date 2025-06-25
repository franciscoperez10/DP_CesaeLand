package Repositories;

public class RideRepository {
    private ArrayList<Atracao> atracaoArray;

    public RideRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();

        this.atracaoArray = csvFR.AtracaoFileReader("Files/Cesaeland_atracoes.csv");
    }

    public ArrayList<Atracao> getRidesArray() {
        return atracaoArray;
    }
}
