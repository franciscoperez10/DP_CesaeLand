package Repositories;

import Models.Atracao;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RideRepository {
    private ArrayList<Atracao> atracaoArray;

    public RideRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();

        this.atracaoArray = csvFR.atracaoFileReader("Files/Cesaeland_atracoes.csv");
    }

    public ArrayList<Atracao> getRidesArray() {
        return atracaoArray;
    }
}
