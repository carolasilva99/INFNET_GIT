package br.com.carolina.bibliotecaat.model.tests;

import br.com.carolina.bibliotecaat.model.domain.Cientifico;
import br.com.carolina.bibliotecaat.model.domain.Didatico;
import br.com.carolina.bibliotecaat.model.domain.Literatura;
import br.com.carolina.bibliotecaat.model.exceptions.DisciplinaNaoPreenchidaException;
import br.com.carolina.bibliotecaat.model.exceptions.IdiomaNaoPreenchidoException;
import br.com.carolina.bibliotecaat.model.exceptions.RamoNaoPreenchidoException;

public class LivroTeste {
    public static void main(String[] args) {
        try {
            Literatura literatura = new Literatura("Uma longa viagem a um pequeno planeta hostil",
                    "Becky Chambers", 5f, true);

            literatura.setIdioma("pt");
            literatura.setGenero("Ficção científica");

            System.out.printf("LITERATURA >>> %s", literatura.obterLivro());
        } catch (RamoNaoPreenchidoException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Literatura literatura = new Literatura("The Long Way to a Small, Angry Planet",
                    "Becky Chambers", 5f, true);

            literatura.setIdioma("en");
            literatura.setGenero("Ficção científica");

            System.out.printf("LITERATURA >>> %s", literatura.obterLivro());
        } catch (RamoNaoPreenchidoException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Literatura literatura = new Literatura("Uma longa viagem a um pequeno planeta hostil",
                    "Becky Chambers", 5f, true);

            literatura.setIdioma("");
            literatura.setGenero("Ficção científica");

            System.out.printf("LITERATURA >>> %s", literatura.obterLivro());
        } catch (RamoNaoPreenchidoException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Didatico didatico = new Didatico("Cálculo",
                    "Um Matemático", 6f, true);

            didatico.setSerie("1o ano");
            didatico.setDisciplina("Matemática");
            didatico.setConservado(false);

            System.out.printf("DIDÁTICO >>> %s", didatico.obterLivro());
        } catch (RamoNaoPreenchidoException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Didatico didatico = new Didatico("Inglês",
                    "Um Inglês", 6f, true);

            didatico.setSerie("1o ano");
            didatico.setDisciplina("Inglês");
            didatico.setConservado(false);

            System.out.printf("DIDÁTICO >>> %s", didatico.obterLivro());
        } catch (RamoNaoPreenchidoException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Didatico didatico = new Didatico("Cálculo",
                    "Um Matemático", 6f, true);

            didatico.setSerie("1o ano");
            didatico.setDisciplina("");
            didatico.setConservado(false);

            System.out.printf("DIDÁTICO >>> %s", didatico.obterLivro());
        } catch (RamoNaoPreenchidoException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cientifico cientifico = new Cientifico("Científico Título",
                    "Einstein", 9f, true);

            cientifico.setVolumes(5);
            cientifico.setRamo("Ramo");

            System.out.printf("CIENTÍFICO >>> %s", cientifico.obterLivro());
        } catch (RamoNaoPreenchidoException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cientifico cientifico = new Cientifico("Científico Título",
                    "Einstein", 9f, true);

            cientifico.setVolumes(6);
            cientifico.setRamo("Ramo");

            System.out.printf("CIENTÍFICO >>> %s", cientifico.obterLivro());
        } catch (RamoNaoPreenchidoException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Cientifico cientifico = new Cientifico("Científico Título",
                    "Einstein", 9f, true);

            cientifico.setVolumes(6);
            cientifico.setRamo("");

            System.out.printf("CIENTÍFICO >>> %s", cientifico.obterLivro());
        } catch (RamoNaoPreenchidoException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
