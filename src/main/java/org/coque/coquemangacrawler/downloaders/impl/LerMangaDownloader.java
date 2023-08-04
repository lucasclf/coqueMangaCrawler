package org.coque.coquemangacrawler.downloaders.impl;

import org.coque.coquemangacrawler.downloaders.Downloader;
import org.coque.coquemangacrawler.model.Manga;

public class LerMangaDownloader implements Downloader {

    private Manga manga;
    LerMangaDownloader(Manga manga){
        this.manga = manga;
    }
    @Override
    public void baixarManga(Manga manga) {

    }

    @Override
    public void montarURL() {

    }

    @Override
    public void salvarManga() {

    }
}
