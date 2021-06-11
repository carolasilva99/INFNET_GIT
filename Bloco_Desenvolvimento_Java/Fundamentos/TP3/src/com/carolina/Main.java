package com.carolina;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            School school = new School();

            int option = -1;

            while (option != 4) {
                System.out.println("\n\n------------BEM VINDO(A) AO SISTEMA DE CONTROLE ACADÊMICO------------");
                System.out.println("Digite o número da opção desejada: ");
                System.out.println("1- Registrar as notas de um novo aluno");
                System.out.println("2- Consultar boletim de um aluno");
                System.out.println("3- Consultar notas da turma");
                System.out.println("4- Sair");

                option = getOptionFromUser();

                int id = -1;

                switch (option) {
                    case 1 -> {
                        registerStudent(school);
                    }
                    case 2 -> {
                        id = getIdFromUser();
                        school.printStudentReportCard(id);
                    }
                    case 3 -> school.printStudentsReportCards();
                    case 4 -> printGoodbyeMessage();
                    default -> printWrongOptionMessage();
                }
            }
        }
        catch (Exception exception) {
            System.out.println("Ops... Parece que encontramos um erro no sistema: " + exception.getMessage());
        }
        finally {
            in.close();
        }
    }

    private static int getOptionFromUser() {
        try {
            return Integer.parseInt(in.nextLine());
        }
        catch(NumberFormatException exception) {
            return 0;
        }
    }

    private static void registerStudent(School school) {
        try {
            String name = getStudentNameFromUser();
            float grade1 = getGradeFromUser(name);
            float grade2 = getGradeFromUser(name);

            int id = school.registerStudent(name, grade1, grade2);
            System.out.println("O aluno " + name + " foi registrado com o id " + id);
        }
        catch (InvalidGradeException | MaxStudentsReachedException | InvalidNameException e ) {
            System.out.println(e.getMessage());
        }



    }

    private static float getGradeFromUser(String name) throws InvalidGradeException {
        try {
            System.out.println("Digite a nota do aluno " + name + ": ");
            return Float.parseFloat(in.nextLine());
        }
        catch (NumberFormatException exception) {
            throw new InvalidGradeException("Formato inválido! Digite um número válido com '.' como separador!", exception);
        }

    }

    private static String getStudentNameFromUser() {
        System.out.println("Digite o nome completo do aluno: ");
        return in.nextLine();
    }

    private static int getIdFromUser() {
        try {
            System.out.println("Digite o código do aluno: ");
            return Integer.parseInt(in.nextLine());
        }
        catch(NumberFormatException exception) {
            return -1;
        }
    }

    public static void printGoodbyeMessage() {
        System.out.println("\n\nMuito obrigado por utilizar nosso sistema!");
    }

    public static void printWrongOptionMessage() {
        System.out.println("Ops... Essa não é uma opção válida, vou te mostrar as opções novamente:");
    }
}
