package dominio;

public enum Status {
    NOT_FILLED ("Não preenchido"),
    PASSED ("Aprovado"),
    FAILED ("Reprovado"),
    SUMMER_SCHOOL ("Recuperação");

    private final String label;

    Status(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
