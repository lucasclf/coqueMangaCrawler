package org.coque.coquemangacrawler;

import org.coque.coquemangacrawler.config.ConfigMangaCrawler;
import org.coque.coquemangacrawler.enums.ExtensionEnum;
import org.coque.coquemangacrawler.model.Manga;
import org.coque.coquemangacrawler.utils.JsonReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Component
public class MangaCrawler {
    @Autowired
    private ConfigMangaCrawler config;
    @Autowired
    private JsonReader jsonReader;
    private String JSON_PATH;
    private String PASTA_DESTINO;

    public void start() {
        JSON_PATH = config.getJson();
        PASTA_DESTINO = config.getDestino();

        var mangas = jsonReader.toManga(new File(JSON_PATH));
        for(Manga manga : mangas){

        }
    }
/*
    private static void baixarManga(Manga manga) {
        String nome = manga.getNome();
        String capitulo = calcularCapituloFormatado(manga.getCapitulo());
        String urlManga = montarUrlBase(manga);

        while (verificarCapituloExistente(urlManga, capitulo)) {
            System.out.println("Baixando capitulo " + capitulo + " de " + nome + " em " + PASTA_DESTINO + "/" + nome + "/" + capitulo);
            criarPasta(PASTA_DESTINO + "/" + nome + "/" + capitulo);
            baixarCapitulo(urlManga, nome, capitulo);
            capitulo = calcularCapituloFormatado(Integer.parseInt(capitulo) + 1);
        }

        Config data = null; // Substitua esta variável pelo objeto de leitura e gravação dos dados em JSON
        int index = data.getMangas().indexOf(manga);
        data.getMangas().get(index).setCapitulo(Integer.parseInt(capitulo) - 1);
        gravarJson(data);
        System.out.println("Encerrado o download de " + nome + " no capitulo " + (Integer.parseInt(capitulo) - 1));
    }

    private static String calcularCapituloFormatado(int capitulo) {
        return String.format("%02d", capitulo);
    }

    private static String montarUrlBase(Manga manga) {
        String url = Origem.findEnum(manga.getOrigem()); // Substitua Origem pela classe ou enum correspondente
        return url + manga.getPrefixo() + manga.getNome();
    }

    private static boolean verificarCapituloExistente(String urlManga, String capitulo) {
        for (String sufixo : SUFIXOS_EXTENSOES) {
            try {
                String urlString = urlManga + "/capitulo-" + capitulo + "/1" + sufixo;
                URL url = new URL(urlString);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("HEAD");
                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    SUFIXO = sufixo;
                    return true;
                }
            } catch (IOException e) {
                // Tratar exceções, caso necessário
            }
        }
        return false;
    }

    private static void baixarCapitulo(String urlManga, String nome, String capitulo) {
        int pagina = 1;
        boolean paginaExiste = true;
        while (paginaExiste) {
            try {
                String urlString = urlManga + "/capitulo-" + capitulo + "/" + pagina + SUFIXO;
                URL url = new URL(urlString);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    String caminhoArquivo = PASTA_DESTINO + "/" + nome + "/" + capitulo + "/" + String.format("%02d", pagina) + SUFIXO;
                    System.out.println(caminhoArquivo);
                    Files.copy(connection.getInputStream(), Paths.get(caminhoArquivo));
                } else {
                    paginaExiste = false;
                }
                pagina++;
            } catch (IOException e) {
                paginaExiste = false;
            }
        }
    }

    private static void criarPasta(String caminho) {
        try {
            Files.createDirectories(Paths.get(caminho));
        } catch (IOException e) {
            System.err.println("A pasta " + caminho + " já existe.");
        }
    }

    private static void gravarJson(Config data) {
        try (FileWriter file = new FileWriter(JSON_PATH)) {
            file.write(data.toJson());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}

