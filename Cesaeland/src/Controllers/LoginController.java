package Controllers;

import Models.User;
import Repositories.UserReposity;

import java.io.FileNotFoundException;

public class LoginController {
    private UserReposity usersRepository;


    public LoginController() throws FileNotFoundException {
        this.usersRepository = new UserReposity();
    }

    public String validateLogin(String usernameInput, String passwordInput) {

        for (User userAtual : this.usersRepository.getLoginArray()) {

            if (userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)) {
                return userAtual.getTipoAcesso();
            }
        }
        return "ERROR";
    }
}
