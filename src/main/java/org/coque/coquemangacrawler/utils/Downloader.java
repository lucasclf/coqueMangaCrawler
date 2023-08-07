package org.coque.coquemangacrawler.utils;

import org.coque.coquemangacrawler.enums.ExtensionEnum;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Component
public class Downloader {
    public boolean chapterVerification(String urlBase){

        HttpClient httpClient = HttpClient.newHttpClient();

        for(ExtensionEnum extensionEnum : ExtensionEnum.values()){
            String url = urlBase + "01" + extensionEnum.extension;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlBase))
                    .GET()
                    .build();

            if(urlVerification(httpClient, request)){
                return true;
            };
        }

        return false;
    }

    private boolean urlVerification(HttpClient httpClient, HttpRequest request) {
        int statusCode = 0;

        try {
            HttpResponse<Void> response = httpClient.send(request, HttpResponse.BodyHandlers.discarding());
            statusCode = response.statusCode();
            System.out.println("Status code: " + statusCode);

        } catch (Exception e) {
            System.out.println("Erro ao acessar a URL: " + e.getMessage());
        }

        return statusCode == 200;
    }

    public void pageVerification(){

    }

    public void downloadManga(){

    }

    private void saveManga(){

    }
}
