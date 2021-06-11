package com.carolina;

import java.io.IOException;
import java.util.Scanner;

public class AcademicController {

    private static final int MAX_STUDENTS = 2;
    private static final String[] names = new String[MAX_STUDENTS];
    private static final float[] firstGrades = new float[MAX_STUDENTS];
    private static final float[] secondGrades = new float[MAX_STUDENTS];
    private static final Scanner in = new Scanner(System.in);
    private static int nextIndexAvailable = 0;

    public static void main(String[] args) throws IOException {

        String option = "-1";

        while (!option.equals("4")) {
            System.out.println("------------BEM VINDO(A) AO SISTEMA DE CONTROLE ACADÊMICO------------");
            System.out.println("Digite o número da opção desejada: ");
            System.out.println("1- Registrar as notas de um novo aluno");
            System.out.println("2- Consultar boletim de um aluno");
            System.out.println("3- Consultar notas da turma");
            System.out.println("4- Sair");
            option = in.next();
            int id = -1;

            switch (option) {
                case "1" -> {
                    id = registerNewStudent();
                    if (id != -1) {
                        System.out.println("O aluno foi adicionado com o código " + id);
                    }
                }
                case "2" -> {
                    id = getIdFromUser();
                    if (isValidId(id)) {
                        printReportCard(id);
                    } else {
                        System.out.println("Código inválido!");
                    }
                }
                case "3" -> printClassGrades();
                case "4" -> printGoodbyeMessage();
                default -> printWrongOptionMessage();
            }
        }

        in.close();
    }

    private static boolean isValidId(int id) {
        return id >= 0 && id < nextIndexAvailable;
    }

    public static boolean isFullCapacityReached() {
        return nextIndexAvailable == MAX_STUDENTS;
    }

    public static int registerNewStudent() {
        if (isFullCapacityReached()) {
            System.out.println("A capacidade máxima foi atingida!");
            return -1;
        }

        System.out.println("Digite o nome do aluno: ");
        String name = in.next();

        System.out.println("Digite a primeira nota do aluno " + name + ": ");
        float firstGrade = Float.parseFloat(in.next());

        System.out.println("Digite a segunda nota do aluno " + name + ": ");
        float secondGrade = Float.parseFloat(in.next());

        return createNewRegistry(name, firstGrade, secondGrade);
    }

    private static int createNewRegistry(String name, float firstGrade, float secondGrade) {
        int id = nextIndexAvailable;

        names[id] = name;
        firstGrades[id] = firstGrade;
        secondGrades[id] = secondGrade;

        nextIndexAvailable++;

        return id;
    }

    public static void printReportCard(int id) {
        float gradesAverage = getGradesAverage(id);

        System.out.println("Nome do aluno: " + names[id]);
        System.out.println("Nota da AV1: " + firstGrades[id]);
        System.out.println("Nota da AV2: " + secondGrades[id]);
        System.out.println("Média final: " + gradesAverage);
        System.out.println("Situação: " + getSituation(gradesAverage));
    }

    private static String getSituation(float gradesAverage) {
        if (gradesAverage < 4) {
            return "Reprovado";
        }
        else if (gradesAverage >= 4 && gradesAverage < 7) {
            return "Prova final";
        }
        else {
            return "Aprovado";
        }
    }

    public static float getGradesAverage(int id) {
        return (firstGrades[id] + secondGrades[id]) / 2;
    }

    public static void printClassGrades() {
        for (int i = 0; i < nextIndexAvailable; i++) {
            printReportCard(i);
            System.out.println();
        }
    }

    public static void printGoodbyeMessage() {
        System.out.println("Muito obrigado por utilizar nosso sistema!");
    }

    public static void printWrongOptionMessage() {
        System.out.println("Ops... Essa não é uma opção válida, vou te mostrar as opções novamente:");
    }

    private static int getIdFromUser() {
        System.out.println("Digite o código do aluno: ");
        return Integer.parseInt(in.next());
    }
}
