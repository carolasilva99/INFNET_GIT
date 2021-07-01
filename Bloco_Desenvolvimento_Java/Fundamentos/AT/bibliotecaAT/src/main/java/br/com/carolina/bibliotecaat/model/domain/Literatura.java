package br.com.carolina.bibliotecaat.model.domain;

import br.com.carolina.bibliotecaat.model.exceptions.DisciplinaNaoPreenchidaException;
import br.com.carolina.bibliotecaat.model.exceptions.IdiomaNaoPreenchidoException;

public class Literatura extends Livro {
    private String genero;
    private String idioma;

    public Literatura(String titulo, String autor, float valorAluguel, boolean usado) {
        super(titulo, autor, valorAluguel, usado);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(this.genero);
        stringBuilder.append(";");
        stringBuilder.append(this.idioma);

        return stringBuilder.toString();
    }

    @Override
    public float calcularValorBruto() throws IdiomaNaoPreenchidoException {
        if(idioma.isBlank()) {
            throw new IdiomaNaoPreenchidoException("[LIVRO DE LITERATURA] O idioma não foi preenchido!");
        }

        float precoIdioma = 2;
        if (!idioma.equalsIgnoreCase("pt")) {
            precoIdioma = 4;
        }

        return this.getValorAluguel() + precoIdioma;
    }
}
