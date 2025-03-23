import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int opcao;
        Scanner op = new Scanner(System.in);
        Scanner user_input = new Scanner(System.in);
        do{
            System.out.println("-MENU-");
            System.out.println("1-Cadastrar");
            System.out.println("2-Editar");
            System.out.println("3-Apresentar");
            System.out.println("4-Excluir");
            System.out.println("0-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = op.nextInt();

            switch (opcao) {
                case 0:
                break;

                case 1:
                    Pessoa p1 = new Pessoa();
                    System.out.println("Digite o nome da pessoa: ");
                    p1.setNome(user_input.nextLine());
                    System.out.println("Digite a idade da pessoa: ");
                    p1.setIdade(user_input.nextInt());
                    System.out.println("Digite o email da pessoa: ");
                    p1.setEmail(user_input.nextLine());
                    System.out.println("As informações digitadas foram essas");
                    p1.status();
                break;

                // case 2:
                // break;

                // case 3:
                //         p1.status();
                // break;

                // case 4:
                // break;

                default:
                    System.out.println("Opção inválida");
                break;
            }
        }while(opcao != 0);
            System.out.println("Programa encerrado.");
            op.close();
            user_input.close();
    }
}
