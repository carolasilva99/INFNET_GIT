package testes;

import dominio.*;
import exceptions.InvalidDateException;
import exceptions.InvalidGradeException;
import exceptions.InvalidIdException;
import exceptions.SchoolCapacityReachedException;

import javax.naming.InvalidNameException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final int MAX_OPTION = 4;
    private static final int INVALID_OPTION = 0;
    private static final Scanner in = new Scanner(System.in);
    private static final School school = new School();

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
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private static int getOptionFromUser() {
        try {
            return Integer.parseInt(in.next());
        }
        catch (NumberFormatException exception) {
            return INVALID_OPTION;
        }
    }

    private static void addTeacher() {
        System.out.println("---------------- ADICIONE UM PROFESSOR ----------------");
        System.out.println("Nome: ");
        in.nextLine();
        String name = in.nextLine();

        System.out.println("Data de nascimento (no formato dd/mm/aaaa): ");

        String birthDate = in.nextLine();

        List<Subject> subjects = new ArrayList<>();

        String option;

        do {
            System.out.println("Deseja adicionar as matérias que o professor dá aula? (S - sim | N - não)");
            option = in.next();
        } while (!(option.toUpperCase(Locale.ROOT).equals("S") || option.toUpperCase(Locale.ROOT).equals("N")));

        in.nextLine();

        if (option.toUpperCase(Locale.ROOT).equals("S")) {
            int i = 1;
            String subjectName;
            boolean keepGoing = true;
            while (keepGoing) {
                System.out.println("Digite o nome da matéria " + i + " que o professior leciona ou pressione <enter> para sair");
                subjectName = in.nextLine();
                if (subjectName.equals("")) {
                    keepGoing = false;
                }
                else {
                    Subject subject = new Subject(subjectName);
                    subjects.add(subject);
                }
                i++;
            }

        }

        try {
            Teacher teacher = new Teacher(name, birthDate, subjects);
            addPersonToSchool(teacher);
        } catch (InvalidNameException | InvalidDateException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void addPersonToSchool(Person person) {
        try {
            int id = school.addPerson(person);
            System.out.println(person.getName() + " foi adicionado com o id " + id);
        }
        catch(SchoolCapacityReachedException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void addStudent() {
        System.out.println("---------------- ADICIONE UM ALUNO ----------------");

        System.out.println("Nome: ");
        in.nextLine();
        String name = in.nextLine();

        System.out.println("Data de nascimento (no formato dd/mm/aaaa): ");

        String birthDate = in.nextLine();
        String option;

        do {
            System.out.println("Deseja adicionar as notas do aluno? (S - sim | N - não)");
            option = in.next();
        } while (!(option.toUpperCase(Locale.ROOT).equals("S") || option.toUpperCase(Locale.ROOT).equals("N")));

        in.nextLine();
        Student student;

        if (option.toUpperCase(Locale.ROOT).equals("S")) {
            int i = 1;
            List<Float> notas = new ArrayList<>();

            boolean keepGoing = true;
            while (keepGoing) {
                System.out.println("Digite a nota " + i + " ou pressione <enter> para sair");
                String nota = in.nextLine();
                if (nota.equals("")) {
                    keepGoing = false;
                }
                else {
                    try {
                        notas.add(Float.parseFloat(nota));
                    }
                    catch (NumberFormatException ex) {
                        System.out.println("Digite um número válido!");
                    }
                }
                i++;
            }

            try {
                ReportCard reportCard = new ReportCard(notas);
                student = new Student(name, birthDate, reportCard);
                addPersonToSchool(student);
            } catch (InvalidGradeException | InvalidNameException | InvalidDateException ex) {
                System.out.println(ex.getMessage());
            }
        }

        else {
            try {
                student = new Student(name, birthDate);
                addPersonToSchool(student);
            } catch (InvalidNameException | InvalidDateException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    private static void getSituation() {
        try {
            System.out.println("Digite o id da pessoa para ver a situação: ");
            int id = Integer.parseInt(in.next());
            school.getStatus(id);
        }
        catch (NumberFormatException | InvalidIdException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void exit() {
        System.out.println("Obrigado por utilizar nosso sistema! Volte sempre!");
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
