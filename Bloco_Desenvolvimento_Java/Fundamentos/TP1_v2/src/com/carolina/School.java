package com.carolina;

public class School {
    private static final int MAX_STUDENTS = 2;
    private static int nextIdAvailable = 0;

    private Student[] students = new Student[MAX_STUDENTS];

    public int registerStudent(String name, float grade1, float grade2) {
        if (isSchoolFull()) {
            System.out.println("A escola atingiu sua capacidade de " + MAX_STUDENTS + " estudantes!");
            return -1;
        }

        int id = nextIdAvailable;
        Student student = new Student(id, name, grade1, grade2);
        students[nextIdAvailable] = student;
        nextIdAvailable++;

        return id;
    }

    private boolean isSchoolFull() {
        return nextIdAvailable == MAX_STUDENTS;
    }

    public void printStudentReportCard(int id) {
        students[id].printReportCard();
    }

    public void printStudentsReportCards() {
        for (int i = 0; i < nextIdAvailable; i++) {
            students[i].printReportCard();
        }
    }
}
