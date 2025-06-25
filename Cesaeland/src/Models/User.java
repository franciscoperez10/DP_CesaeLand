package Models;

public class User {

    private String tipoAcesso;
    private String username;
    private String password;

    public User(String atracao, String username, String password) {
        this.tipoAcesso = atracao;
        this.username = username;
        this.password = password;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
