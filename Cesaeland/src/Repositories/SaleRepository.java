package Repositories;

import Models.Venda;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SaleRepository {
    private ArrayList<Venda> vendaArray;

    public SaleRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();

        this.vendaArray = csvFR.vendaFileReader("Files/Cesaeland_vendas.csv");
    }

    public ArrayList<Venda> getSalesArray() {
        return vendaArray;
    }
}
