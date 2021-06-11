package com.carolina;

public class ReportCard {
    private float grade1;
    private float grade2;
    private float average;
    private Situation situation;

    public ReportCard(float grade1, float grade2) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.average = getGradesAverage();
        setSituation();
    }

    private void setSituation() {
        if (this.average < 4) {
            this.situation = Situation.REPROVADO;
        }
        else if (this.average < 7) {
            this.situation = Situation.PROVA_FINAL;
        }
        else {
            this.situation = Situation.APROVADO;
        }
    }

    public void print() {
        System.out.println("Nota da AV1: " + this.grade1);
        System.out.println("Nota da AV2: " + this.grade2);
        System.out.println("Média final: " + this.average);
        System.out.println("Situação: " + this.situation.getLabel());
    }

    private float getGradesAverage() {
        return (this.grade1 + this.grade2) / 2;
    }
}
