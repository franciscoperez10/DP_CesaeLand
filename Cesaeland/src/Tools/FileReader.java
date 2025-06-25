package Tools;

import Models.Atracao;
import Models.Custo;
import Models.User;
import Models.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    public ArrayList<Venda> vendaFileReader(String filePath) throws FileNotFoundException {

        File salesFile = new File(filePath);
        Scanner vendaScanner = new Scanner(salesFile);

        ArrayList<Venda> vendaArray = new ArrayList<>();

        vendaScanner.nextLine();

        while (vendaScanner.hasNextLine()) {

            String linha = vendaScanner.nextLine();

            String[] linhaSeparada = linha.split(";");

            String atracaoID = linhaSeparada[0];
            String data = linhaSeparada[1];
            String tipoCliente = linhaSeparada[2];

            Venda newVenda = new Venda(atracaoID, data, tipoCliente);

            vendaArray.add(newVenda);
        }
        return vendaArray;
    }

    public ArrayList<Custo> custoFileReader(String filePath) throws FileNotFoundException {

        File salesFile = new File(filePath);
        Scanner custoScanner = new Scanner(salesFile);

        ArrayList<Custo> custoArray = new ArrayList<>();

        custoScanner.nextLine();

        while (custoScanner.hasNextLine()) {

            String linha = custoScanner.nextLine();

            String[] linhaSeparada = linha.split(";");

            String atracaoID = linhaSeparada[0];
            Double custoManutencaoBilhete = Double.parseDouble(linhaSeparada[1]);
            Double custoFixoMes = Double.parseDouble(linhaSeparada[2]);

            Custo newCusto = new Custo(atracaoID, custoManutencaoBilhete, custoFixoMes);

            custoArray.add(newCusto);
        }
        return custoArray;
    }

    public ArrayList<User> loginFileReader(String filePath) throws FileNotFoundException {

        File salesFile = new File(filePath);
        Scanner loginScanner = new Scanner(salesFile);

        ArrayList<User> userArray = new ArrayList<>();

        loginScanner.nextLine();

        while (loginScanner.hasNextLine()) {

            String linha = loginScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String tipoAcesso = linhaSeparada[0];
            String username = linhaSeparada[1];
            String password = linhaSeparada[2];

            User newUser = new User(tipoAcesso, username, password);

            userArray.add(newUser);
        }
        return userArray;
    }

    public ArrayList<Atracao> atracaoFileReader(String filePath) throws FileNotFoundException {

        File salesFile = new File(filePath);
        Scanner atracaoScanner = new Scanner(salesFile);

        ArrayList<Atracao> atracaoArray = new ArrayList<>();

        atracaoScanner.nextLine();

        while (atracaoScanner.hasNextLine()) {

            String linha = atracaoScanner.nextLine();

            String[] linhaSeparada = linha.split(";");

            String ID = linhaSeparada[0];
            String atracao = linhaSeparada[1];
            Double precoAdulto = Double.parseDouble(linhaSeparada[2]);
            Double precoCrianca = Double.parseDouble(linhaSeparada[3]);
            Integer duracaoSegundos = Integer.parseInt(linhaSeparada[4]);

            Atracao newAtracao = new Atracao(ID, atracao, precoAdulto, precoCrianca, duracaoSegundos);

            atracaoArray.add(newAtracao);
        }
        return atracaoArray;
    }

}
