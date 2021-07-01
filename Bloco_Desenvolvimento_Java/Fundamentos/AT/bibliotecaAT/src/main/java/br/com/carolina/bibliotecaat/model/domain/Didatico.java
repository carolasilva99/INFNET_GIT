package br.com.carolina.bibliotecaat.model.domain;

import br.com.carolina.bibliotecaat.model.exceptions.DisciplinaNaoPreenchidaException;

public class Didatico extends Livro {
    private String disciplina;
    private String serie;
    private boolean conservado;

    public Didatico(String titulo, String autor, float valorAluguel, boolean usado) {
        super(titulo, autor, valorAluguel, usado);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(this.disciplina);
        stringBuilder.append(";");
        stringBuilder.append(this.serie);
        stringBuilder.append(";");
        stringBuilder.append(this.conservado ? "S" : "N");

        return stringBuilder.toString();
    }

    @Override
    public float calcularValorBruto() throws DisciplinaNaoPreenchidaException {
        if (disciplina.isBlank()) {
            throw new DisciplinaNaoPreenchidaException("[LIVRO DIDÁTICO] O campo disciplina não foi preenchido!");
        }

        float valorDisciplina = 2.5f;
        if (disciplina.equalsIgnoreCase("ESPANHOL")) {
            valorDisciplina = 4;
        }

        float valorConservacao = 0;
        if (this.conservado) {
            valorConservacao = 2;
        }

        return this.getValorAluguel() + valorDisciplina + valorConservacao;
    }
}
