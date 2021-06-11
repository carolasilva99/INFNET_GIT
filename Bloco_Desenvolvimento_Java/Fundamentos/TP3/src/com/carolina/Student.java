package com.carolina;

import javax.naming.InvalidNameException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Student {
    private static final String EMPTY_SPACE = " ";
    private int id;
    private ReportCard reportCard;
    private String firstName;
    private String middleName;
    private String lastName;

    public Student(int id, String fullName, float grade1, float grade2) throws InvalidNameException {
        this.id = id;
        this.reportCard = new ReportCard(grade1, grade2);
        setNames(fullName);
    }

    private void setNames(String fullName) throws InvalidNameException {
        List<String> names = getAllNamesFromFullName(fullName);

        validateNames(names);

        this.firstName = names.get(0);
        names.remove(0);

        this.lastName = names.get(names.size() - 1);
        names.remove(names.size() - 1);

        StringBuilder middleName = getMiddleName(names);

        this.middleName = middleName.toString().trim();
    }

    private StringBuilder getMiddleName(List<String> names) {
        StringBuilder middleName = new StringBuilder();

        for (String name : names) {
            middleName.append(name);
            middleName.append(EMPTY_SPACE);
        }
        return middleName;
    }

    private void validateNames(List<String> names) throws InvalidNameException {
        if (names.size() < 2) {
            throw new InvalidNameException("É necessário fornecer o nome completo!");
        }
    }

    private List<String> getAllNamesFromFullName(String fullName) {
        List<String> allWordsSeparatedBySpace = Arrays.asList(fullName.split(EMPTY_SPACE));
        return allWordsSeparatedBySpace
                .stream()
                .filter(name -> !name.equals(EMPTY_SPACE))
                .collect(Collectors.toList());
    }

    public String getFullName() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(putFirstLetterCapitalized(firstName));
        stringBuilder.append(EMPTY_SPACE);
        stringBuilder.append(putTitleCaseOnMiddleNames());
        stringBuilder.append(EMPTY_SPACE);
        stringBuilder.append(putFirstLetterCapitalized(lastName));

        return stringBuilder.toString();
    }

    private String putTitleCaseOnMiddleNames() {
        String[] middleNames = this.middleName.split(EMPTY_SPACE);
        StringBuilder middleName = new StringBuilder();

        for (String name : middleNames) {
            middleName.append(putFirstLetterCapitalized(name)).append(" ");
        }

        return middleName.toString().trim();
    }

    private String putFirstLetterCapitalized(String word) {
        return Character.toTitleCase(word.charAt(0)) + word.toLowerCase(Locale.ROOT).substring(1);
    }

    public void printReportCard() {
        System.out.println("\n----------------BOLETIM----------------");
        System.out.println("Nome: " + this.getFullName());
        reportCard.print();
        System.out.print("\n");
    }
}
