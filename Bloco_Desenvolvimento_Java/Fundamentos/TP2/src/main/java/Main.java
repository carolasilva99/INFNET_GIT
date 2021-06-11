import java.util.Scanner;

public class Main {
    private static final int MAX_OPTION = 4;
    private static final int INVALID_OPTION = 0;
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 1;

        while (option != MAX_OPTION) {
            print_menu();
            option = getOptionFromUser();

            switch (option) {
                case 1 -> addTeacher();
                case 2 -> addStudent();
                case 3 -> getSituation();
                case 4 -> exit();
            }
        }
    }

    private static void exit() {
        System.out.println("Obrigado por utilizar nosso sistema! Volte sempre!");
    }

    private static void getSituation() {
        System.out.println("Consultar situação");
    }


    private static void addStudent() {
        System.out.println("Cadastrar aluno");
    }

    private static void addTeacher() {
        System.out.println("Cadastrar professor");
    }

    private static int getOptionFromUser() {
        try {
            return Integer.parseInt(in.next());
        }
        catch (NumberFormatException exception) {
            return INVALID_OPTION;
        }
    }

    public static void print_menu() {
        System.out.println("\n\n------------BEM VINDO(A) AO SISTEMA DE CONTROLE ACADÊMICO------------");
        System.out.println("Digite o número da opção desejada: ");
        System.out.println("[1] Cadastrar professor");
        System.out.println("[2] Cadastrar aluno");
        System.out.println("[3] Consultar situação de um docente/discente");
        System.out.println("[4] Sair");
    }
}
