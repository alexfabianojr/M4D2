import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Registro {

    private static List<String> list = new ArrayList<>();

    public static void metodoRegistraEstudante() {
        Scanner sc = new Scanner(System.in);
        Estudante estudante;

        int codigo;
        String descricao;
        String uf;
        int qtdeEstudantes;

        int codigoE;
        String nome;
        String dtNascimento;
        String email;
        String senha;
        Cidade cidade;

        int loopState = 1;
        int choose;
        int insideCounter;
        String local;

        try {
            System.out.println(" ");
            System.out.println("----------------------");
            System.out.println(" ");
            System.out.println("#...Registrando Cidade");
            System.out.println(" ");
            System.out.printf("-> Informe O Codigo (int): ");
            codigo = sc.nextInt();
            sc.nextLine();
            System.out.printf("-> Informe O Nome Da Cidade (String): ");
            descricao = sc.nextLine();
            System.out.printf("-> Informe A UF (String): ");
            uf = sc.nextLine();

            Cidade $cidade = new Cidade(codigo, descricao, uf);

            while(loopState == 1) {
                System.out.println(" ");
                System.out.println("----------------------");
                System.out.println("\nObs: para cada cidade deve-se criar no mínimo 4 estudantes." +
                        "\nPara registrar uma nova cidade entre com 0 para encerrar o cadastro" +
                        "e selecione novamente registrar cidade e seus respectivos alunos.\n");
                System.out.printf("#...Escolha [PAINEL B] \n1 - Cadastrar Novo Estudante Para A Cidade: " + descricao +
                        "\n0 - Encerrar O Cadastro: \n");
                choose = sc.nextInt();

                if (choose == 0) {
                    if ($cidade.getQtdeEstudantes() >= 4) {
                        System.out.println(" ");
                        System.out.println("#...Encerrando criacao de aluno por cidade");
                        System.out.println(" ");
                        break;
                    } else {
                        System.out.println("\nEh preciso adicionar ao menos 4 alunos por cidade\n");
                        continue;
                    }
                } else {
                    switch (choose) {
                        case 1:
                            System.out.println("\n#...Registrando Estudante Na Cidade: " + descricao);
                            System.out.printf("-> Informe o codigo (int): ");
                            codigoE = sc.nextInt();
                            sc.nextLine();
                            System.out.printf("-> Informe o nome (String): ");
                            nome = sc.nextLine();
                            System.out.printf("-> Informe a data de nascimento (String): ");
                            dtNascimento = sc.next();
                            System.out.printf("-> Informe o email (String): ");
                            email = sc.next();
                            System.out.printf("-> Informe a senha (String): ");
                            senha = sc.next();

                            estudante = new Estudante(codigoE, nome, dtNascimento, email, senha, $cidade);
                            $cidade.exibeDados();
                            estudante.exibeDados();

                            System.out.println(" ");
                            System.out.println("----------------------");
                            System.out.println(" ");
                            System.out.println("#...Deseja alterar algum dado? [PAINEL C]\n1 - Sim\nOutro numero: Nao ");
                            int $choose = sc.nextInt();
                            if ($choose == 1) {
                                    System.out.println(" ");
                                    System.out.println("----------------------");
                                    System.out.println(" ");
                                    System.out.println("#...Qual dado deseja alterar? [PAINEL D]" +
                                            "\n1 - codigo " + "\n2 - nome " +
                                            "\n3 - data de nascimento " +
                                            "\n4 - email " + "\n5 - senha");
                                    $choose = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println(" ");

                                    switch ($choose) {
                                        case 1:
                                            System.out.printf("-> Novo codigo (int): ");
                                            codigoE = sc.nextInt();
                                            break;
                                        case 2:
                                            System.out.printf("-> Novo nome (String): ");
                                            nome = sc.nextLine();

                                            break;
                                        case 3:
                                            System.out.printf("-> Nova data de nascimento (String): ");
                                            dtNascimento = sc.nextLine();
                                            break;
                                        case 4:
                                            System.out.printf("-> Novo email (String): ");
                                            email = sc.nextLine();
                                             break;
                                        case 5:
                                            while (true) {
                                                System.out.printf("-> Entre com a senha antiga (String): ");
                                                String $senha = sc.nextLine();
                                                if ($senha.compareTo(senha) == 0) {
                                                    System.out.printf("-> Nova senha (String): ");
                                                    $senha = sc.nextLine();
                                                    System.out.printf("-> Repetir nova senha (String): ");
                                                    String repetirSenha = sc.nextLine();
                                                    if ($senha.compareTo(repetirSenha) == 0) {
                                                        System.out.println("Senha Alterada Com Sucesso! \n\n");
                                                        senha = $senha;
                                                        break;
                                                    } else {System.out.println("-> Senha repetida errada, tente novamente");}
                                                } else {System.out.println("-> Senha errada, tente novamente");}
                                            }
                                            break;
                                    }
                                } else {System.out.println("-> Nenhum dado alerado");}
                            estudante = new Estudante(codigoE, nome, dtNascimento, email, senha, $cidade);
                            local = "Cod-Cidade: " + codigo + " | Nome-Cidade: " + descricao
                                    + " | UF: " + uf + " | Cod-Estudante: " + codigoE + " | Nome-Estudante: " + nome + " | dtN:  " + dtNascimento
                                    + " | Email: " + email + " | Senha: " + senha;
                            list.add(local);
                            System.out.println("\n#...ESTUDANTE REGISTRADO COM SUCESSO\n");
                            $cidade.exibeDados();
                            estudante.exibeDados();
                            break;

                        default:
                            throw new IllegalStateException("#...Unexpected value: " + loopState);
                    }
                }
            }
        }
        catch (IndexOutOfBoundsException e) {System.out.println("Error: "+ e.getMessage());}
        catch (InputMismatchException e) {System.out.println("Error: "+ e.getMessage());}
        catch (Exception e) {System.out.println("Error: "+ e.getMessage());}
    }

    public static void mostrarTudo() {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
