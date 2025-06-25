package Repositories;

import Models.User;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserReposity {
    private ArrayList<User> loginArray;

    public UserReposity() throws FileNotFoundException {
        FileReader csvFR = new FileReader();

        this.loginArray = csvFR.loginFileReader("Files/Cesaeland_logins.csv");
    }

    public ArrayList<User> getLoginArray() {
        return loginArray;
    }
}
