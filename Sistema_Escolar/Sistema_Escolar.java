import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Sistema_Escolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        List<Materia> materiasCadastradas = new ArrayList<>();
        List<Professor> professoresCadastrados = new ArrayList<>();
        List<Aluno> alunosCadastrados = new ArrayList<>();

        int opcao = -1; // Inicializado com -1 para garantir a entrada no loop

        // CORREÇÃO: O menu diz que '0 para Sair', então o while deve checar se opcao != 0
        while (opcao != 0) {
            System.out.println("\n--- SISTEMA ESCOLAR ---");
            System.out.println("1 para Cadastrar Matéria");
            System.out.println("2 para Cadastrar Professor (e associar Matéria)");
            System.out.println("3 para Cadastrar Aluno");
            System.out.println("4 para Lançar Nota para Aluno");
            System.out.println("5 para Ver Boletim do Aluno");
            System.out.println("0 para Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    int esc1;
                    do {
                        System.out.print("Digite o nome da matéria (ex: Matematica): ");
                        String nomeMat = scanner.nextLine();
                        materiasCadastradas.add(new Materia(nomeMat));
                        System.out.println("Matéria cadastrada com sucesso!");

                        System.out.println("Digite 0 Para sair ou 1 para adicionar outra matéria");
                        esc1 = scanner.nextInt();
                        scanner.nextLine();
                    } while (esc1 != 0);
                    break;

                case 2:
                    int esc2;
                    do {
                        if (materiasCadastradas.isEmpty()) {
                            System.out.println("Erro: Cadastre pelo menos uma matéria antes!");
                            break;
                        }
                        System.out.print("Nome do Professor: ");
                        String nomeProf = scanner.nextLine();
                        Professor prof = new Professor(nomeProf);

                        System.out.println("Escolha a matéria para este professor:");
                        for (int i = 0; i < materiasCadastradas.size(); i++) {
                            System.out.println(i + " - " + materiasCadastradas.get(i).getNome());
                        }
                        System.out.print("Digite o número da matéria: ");
                        int indiceMat = scanner.nextInt();
                        scanner.nextLine();

                        Materia matSelecionada = materiasCadastradas.get(indiceMat);
                        prof.AdicionarMateria(matSelecionada);


                        matSelecionada.setProfessor(prof);

                        professoresCadastrados.add(prof);
                        System.out.println("Professor cadastrado e associado à matéria!");

                        System.out.println("Selecione 1 para cadastrar mais um professor ou 0 para sair ");
                        esc2 = scanner.nextInt();
                        scanner.nextLine();
                    } while (esc2 != 0);
                    break;

                case 3:
                    int esc3;
                    do {
                        System.out.print("Nome do Aluno: ");
                        String nomeAluno = scanner.nextLine();
                        alunosCadastrados.add(new Aluno(nomeAluno));
                        System.out.println("Aluno cadastrado com sucesso!");

                        System.out.println("Selecione 1 para cadastrar mais um Aluno ou 0 para sair ");
                        esc3 = scanner.nextInt();
                        scanner.nextLine();
                    } while (esc3 != 0);
                    break;

                case 4:
                    int esc4;
                    do {
                        if (alunosCadastrados.isEmpty() || materiasCadastradas.isEmpty()) {
                            System.out.println("Erro: É necessário ter alunos e matérias cadastrados!");
                            break;
                        }

                        System.out.println("Escolha o Aluno:");
                        for (int i = 0; i < alunosCadastrados.size(); i++) {
                            System.out.println(i + " - " + alunosCadastrados.get(i).Nome);
                        }
                        int indAluno = scanner.nextInt();

                        System.out.println("Escolha a Matéria:");
                        for (int i = 0; i < materiasCadastradas.size(); i++) {
                            System.out.println(i + " - " + materiasCadastradas.get(i).getNome());
                        }
                        int indMateria = scanner.nextInt();

                        System.out.print("Digite a nota (use ponto, ex: 8.5): ");
                        double nota = scanner.nextDouble();

                        Aluno alunoSelecionado = alunosCadastrados.get(indAluno);
                        Materia materiaSelecionada = materiasCadastradas.get(indMateria);
                        alunoSelecionado.AdicionarNota(materiaSelecionada, nota);
                        System.out.println("Nota lançada com sucesso!");

                        System.out.println("Selecione 1 para lançar mais notas ou 0 para sair ");
                        esc4 = scanner.nextInt();
                        scanner.nextLine();
                    } while (esc4 != 0);
                    break;

                case 5:
                    if (alunosCadastrados.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }
                    System.out.println("Escolha o Aluno para ver o Boletim:");
                    for (int i = 0; i < alunosCadastrados.size(); i++) {
                        System.out.println(i + " - " + alunosCadastrados.get(i).Nome);
                    }
                    int idxAlu = scanner.nextInt();
                    Aluno alu = alunosCadastrados.get(idxAlu);

                    System.out.println("\n--- BOLETIM DO ALUNO: " + alu.Nome + " ---");
                    if (materiasCadastradas.isEmpty()) {
                        System.out.println("Nenhuma matéria cadastrada.");
                    } else {
                        for (Materia m : materiasCadastradas) {
                            String nomeDoProf = (m.getProfessor() != null) ? m.getProfessor().getNome() : "Sem Professor";

                            if (alu.GetMediaDaMateria(m) >= 5) {

                                System.out.println(m.getNome() + " | Média: " + alu.GetMediaDaMateria(m) + " | Professor: " + nomeDoProf + " | Status: Aprovado");

                            } else {

                                System.out.println(m.getNome() + " | Média: " + alu.GetMediaDaMateria(m) + " | Professor: " + nomeDoProf + " | Status: Reprovado");

                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scanner.close();
    }
}