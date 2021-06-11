package com.carolina;

import javax.naming.InvalidNameException;

public class School {
    private static final int MAX_STUDENTS = 2;
    private static int nextIdAvailable = 0;

    private Student[] students = new Student[MAX_STUDENTS];

    public int registerStudent(String name, float grade1, float grade2) throws MaxStudentsReachedException, InvalidNameException {
        if (isSchoolFull()) {
            throw new MaxStudentsReachedException("A escola está cheia! Desmatricule um aluno para matricular um novo!");
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
        if (isValidId(id)) {
            students[id].printReportCard();
        }
        else {
            System.out.println("O id digitado é inválido!");
        }

    }

    private boolean isValidId(int id) {
        return id >= 0 && id < nextIdAvailable;
    }

    public void printStudentsReportCards() {
        for (int i = 0; i < nextIdAvailable; i++) {
            students[i].printReportCard();
        }
    }
}
