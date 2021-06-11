package com.carolina;

public class Student {
    private int id;
    private ReportCard reportCard;
    private String name;

    public Student(int id, String name, float grade1, float grade2) {
        this.id = id;
        this.name = name;
        this.reportCard = new ReportCard(grade1, grade2);
    }

    public void printReportCard() {
        System.out.println("\n----------------BOLETIM----------------");
        System.out.println("Nome: " + this.name);
        reportCard.print();
        System.out.printf("\n");
    }
}
