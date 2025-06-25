package Repositories;

import Models.Custo;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CostRepository {
    private ArrayList<Custo> custoArray;

    public CostRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();

        this.custoArray = csvFR.custoFileReader("Files/Cesaeland_custos.csv");
    }

    public ArrayList<Custo> getCostsArray() {
        return custoArray;
    }
}
