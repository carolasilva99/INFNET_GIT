package br.com.carolina.bibliotecaat.model.tests;

import br.com.carolina.bibliotecaat.model.domain.*;
import br.com.carolina.bibliotecaat.model.domain.exceptions.SolicitanteNaoInformadoException;
import br.com.carolina.bibliotecaat.model.exceptions.DisciplinaNaoPreenchidaException;
import br.com.carolina.bibliotecaat.model.exceptions.IdiomaNaoPreenchidoException;
import br.com.carolina.bibliotecaat.model.exceptions.RamoNaoPreenchidoException;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AppTeste {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        String arq = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))+".txt";

        try {
            try {
                InputStream resource = new ClassPathResource("static/reservas.txt").getInputStream();

                FileWriter fileWriter = new FileWriter(dir + arq);
                BufferedWriter escrita = new BufferedWriter(fileWriter);

                BufferedReader leitura = new BufferedReader(new InputStreamReader(resource));

                String linha = leitura.readLine();

                while (linha != null) {
                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()) {
                        case "0":
                            Solicitante solicitanteP1 = new Solicitante(campos[2], campos[3], campos[4]);

                            Reserva reserva = new Reserva();
                            reserva.setObservacao(campos[1]);
                            reserva.setSolicitante(solicitanteP1);

                            escrita.write(reserva.obterReserva()+"\r\n");

                            break;

                        case "C":
                            Cientifico cientifico = new Cientifico(campos[1], campos[2], Float.parseFloat(campos[3]),
                                    "S".equalsIgnoreCase(campos[4]));

                            cientifico.setRamo(campos[5]);
                            cientifico.setVolumes(Integer.parseInt(campos[6]));

                            escrita.write(cientifico.obterLivro());

                            break;

                        case "L":
                            Literatura literatura = new Literatura(campos[1], campos[2], Float.parseFloat(campos[3]),
                                    "S".equalsIgnoreCase(campos[4]));

                            literatura.setGenero(campos[5]);
                            literatura.setIdioma(campos[6]);

                            escrita.write(literatura.obterLivro());

                            break;

                        case "D":
                            Didatico didatico = new Didatico(campos[1], campos[2], Float.parseFloat(campos[3]),
                                    "S".equalsIgnoreCase(campos[4]));

                            didatico.setDisciplina(campos[5]);
                            didatico.setSerie(campos[6]);
                            didatico.setConservado("S".equalsIgnoreCase(campos[7]));

                            escrita.write(didatico.obterLivro());

                            break;

                        default:
                            System.out.println("Entrada inválida!");
                            break;
                    }

                    linha = leitura.readLine();
                }

                leitura.close();
                escrita.close();
                fileWriter.close();
            }
            catch (IOException | DisciplinaNaoPreenchidaException | IdiomaNaoPreenchidoException | RamoNaoPreenchidoException | SolicitanteNaoInformadoException e) {
                System.out.println(e.getMessage());
            }
        }
        finally {
            System.out.println("Processamento finalizado: " + (dir + arq) + "!!!");
        }
    }
}
