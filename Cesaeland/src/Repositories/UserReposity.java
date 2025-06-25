package Repositories;

public class UserReposity {
    private ArrayList<Login> loginArray;

    public LoginRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();

        this.loginArray = csvFR.LoginFileReader("Files/Cesaeland_logins.csv");
    }

    public ArrayList<Login> getLoginArray() {
        return loginArray;
    }
}
