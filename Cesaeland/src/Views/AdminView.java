package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {
    private AdminController adminController;


    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void adminMenu(){
        Scanner input = new Scanner(System.in);
        int opcaoAdmin;

        do {

            System.out.println("\n\n********** MENU ADMIN **********");
            System.out.println("1. Consultar o total de Vendas.");
            System.out.println("2. Consultar o total de lucro");
            System.out.println("3. Consultar o total de vendas e lucro por mês");
            System.out.println("4. Consultar a atração mais procurada por adultos");
            System.out.println("5.  Consultar a atração mais procurada por crianças");
            System.out.println("6. Consultar a atração mais procurada");
            System.out.println("7. Consultar a atração mais lucrativa");
            System.out.println("8. Consultar a atração menos lucrativa");
            System.out.println("9. Consultar a atração com melhor preço/tempo");
            System.out.println("10. Adicionar novo login");

            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoAdmin= input.nextInt();

            switch (opcaoAdmin){
                case 1:
                    System.out.println("Total de vendas: " + adminController.totalVendas());
                    break;

                case 2:
                    System.out.println("Total de vendas: " + adminController.lucro());
                    break;

                case 3:

                    break;


                case 4: //venda com maior valor
                    break;

                case 5: // Total Vendas

                    break;

                case 6: // media todas as vendas
                    break;

                case 7: // media todas as vendas
                    break;

                case 8: // media todas as vendas
                    break;

                case 9: // media todas as vendas
                    break;

                case 10: // media todas as vendas
                    break;

                case 0: //sair
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        }while (opcaoAdmin!=0);
    }
}
