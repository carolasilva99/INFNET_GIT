package dominio;

import auxiliar.Constant;
import exceptions.InvalidGradeException;

import java.util.ArrayList;
import java.util.List;

public class ReportCard {
    private List<Float> grades = new ArrayList<>();
    private Double average;
    private Status status;

    public ReportCard() {
        this.average = 0.0;
        this.status = Status.NOT_FILLED;
    }

    public ReportCard(List<Float> grades) throws InvalidGradeException {
        setGrades(grades);
        setAverage();
        setStatus();
    }

    private void setGrades(List<Float> grades) throws InvalidGradeException {
        if (grades.isEmpty()) {
            throw new InvalidGradeException("É necessário informar ao menos uma nota!");
        }

        boolean areAllGradesValid =  grades.stream().allMatch(this::isGradeValid);
        if (!areAllGradesValid) {
            throw new InvalidGradeException("As notas informadas devem estar entre " + Constant.MIN_GRADE + " e "
                    + Constant.MAX_GRADE + "!");
        }
        this.grades = grades;
    }

    private boolean isGradeValid(float grade) {
        return grade >= Constant.MIN_GRADE && grade <= Constant.MAX_GRADE;
    }

    private void setAverage() {
        this.average = this.grades.stream().mapToDouble(Float::doubleValue).average().orElse(0);
    }

    private void setStatus() {
        if (average >= 6.0) {
            this.status = Status.PASSED;
        }
        else if (average >= 5.0) {
            this.status = Status.SUMMER_SCHOOL;
        }
        else {
            this.status = Status.FAILED;
        }
    }

    public void print() {
        System.out.println("-------- BOLETIM --------");
        if (status == Status.NOT_FILLED) {
            System.out.println("As notas desse aluno ainda não foram cadastradas!");
        }
        else {
            this.printGrades();
            System.out.println("Média: " + average);
            System.out.println("Situação: " + status.getLabel());
        }
    }

    private void printGrades() {
        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Nota " + (i + 1) + ": " + grades.get(i));
        }
    }
}
