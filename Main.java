import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int opcao;
        Scanner op = new Scanner(System.in);
        Scanner user_input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        do{
            System.out.println("-MENU-");
            System.out.println("1-Cadastrar");
            System.out.println("2-Editar");
            System.out.println("3-Apresentar");
            System.out.println("4-Excluir");
            System.out.println("0-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = op.nextInt();
            op.nextLine();

            switch (opcao) {
                case 0:
                break;
                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    p1.setNome(user_input.next());
                    System.out.println("Digite a idade da pessoa: ");
                    p1.setIdade(user_input.nextInt());
                    user_input.nextLine();
                    System.out.println("Digite o email da pessoa: ");
                    p1.setEmail(user_input.next());
                    System.out.println("As informações digitadas foram essas");
                    p1.exibirInformações();
                break;
                case 2:
                    System.out.println("Digite o novo nome da pessoa: ");
                    p1.setNome(user_input.next());
                    System.out.println("Digite a nova idade da pessoa: ");
                    p1.setIdade(user_input.nextInt());
                    user_input.nextLine();
                    System.out.println("Digite o novo email da pessoa: ");
                    p1.setEmail(user_input.next());
                    System.out.println("As informações digitadas foram essas");
                    p1.exibirInformações();
                break;
                case 3:
                    p1.exibirInformações();
                break;
                case 4:
                    p1 = null;
                    System.out.println("Pessoa excluida com sucesso!");
                break;

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
