package br.com.carolina.bibliotecaat.model.domain;


import br.com.carolina.bibliotecaat.model.exceptions.RamoNaoPreenchidoException;

public class Cientifico extends Livro {
    private String ramo;
    private int volumes;


    public Cientifico(String titulo, String autor, float valorAluguel, boolean usado) {
        super(titulo, autor, valorAluguel, usado);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(ramo);
        stringBuilder.append(";");
        stringBuilder.append(volumes);

        return stringBuilder.toString();
    }

    @Override
    public float calcularValorBruto() throws RamoNaoPreenchidoException {
        if (ramo.isBlank()) {
            throw new RamoNaoPreenchidoException("[LIVRO CIENTÍFICO] Ramo do livro não foi preenchido!");
        }

        float valorPoucosVolumes = 2;
        if (this.volumes >= 6) {
            valorPoucosVolumes = 3;
        }

        return this.getValorAluguel() + valorPoucosVolumes;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }
}
