package com.carolina;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
	    School school = new School();

        int option = -1;

        while (option != 4) {
            System.out.println("\n\n------------BEM VINDO(A) AO SISTEMA DE CONTROLE ACADÊMICO------------");
            System.out.println("Digite o número da opção desejada: ");
            System.out.println("1- Registrar as notas de um novo aluno");
            System.out.println("2- Consultar boletim de um aluno");
            System.out.println("3- Consultar notas da turma");
            System.out.println("4- Sair");

            option = Integer.parseInt(in.nextLine());

            int id = -1;

            switch (option) {
                case 1 -> {
                    id = registerStudent(school);
                    System.out.println("\nO aluno foi adicionado com o código " + id);
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

        in.close();
    }

    private static int registerStudent(School school) {
        System.out.println("Digite o nome do aluno: ");
        String name = in.nextLine();

        System.out.println("Digite a primeira nota do aluno " + name + ": ");
        float grade1 = Float.parseFloat(in.nextLine());

        System.out.println("Digite a segunda nota do aluno " + name + ": ");
        float grade2 = Float.parseFloat(in.nextLine());

        return school.registerStudent(name, grade1, grade2);
    }

    private static int getIdFromUser() {
        System.out.println("Digite o código do aluno: ");
        return Integer.parseInt(in.nextLine());
    }

    public static void printGoodbyeMessage() {
        System.out.println("\n\nMuito obrigado por utilizar nosso sistema!");
    }

    public static void printWrongOptionMessage() {
        System.out.println("Ops... Essa não é uma opção válida, vou te mostrar as opções novamente:");
    }
}
