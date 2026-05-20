import java.util.HashMap;
import java.util.Scanner;

public class POO4 {
    public static void main(String[] args) {
        HashMap<Integer, String> alunos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Remover");
            System.out.println("4 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    alunos.put(matricula, nome);
                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:
                    System.out.print("Matrícula para buscar: ");
                    int busca = sc.nextInt();
                    String encontrado = alunos.get(busca);
                    if (encontrado != null) {
                        System.out.println("Aluno: " + encontrado);
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("Matrícula para remover: ");
                    int remover = sc.nextInt();
                    if (alunos.remove(remover) != null) {
                        System.out.println("Aluno removido!");
                    } else {
                        System.out.println("Matrícula não encontrada!");
                    }
                    break;

                case 4:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado!");
                    } else {
                        for (HashMap.Entry<Integer, String> entry : alunos.entrySet()) {
                            System.out.println("Matrícula: " + entry.getKey() + " | Nome: " + entry.getValue());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}