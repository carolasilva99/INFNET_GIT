package com.carolina;

public enum Situation {
    REPROVADO("Reprovado"),
    PROVA_FINAL("Prova final"),
    APROVADO("Aprovado");

    private final String label;

    Situation(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
