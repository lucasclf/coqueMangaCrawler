package org.coque.coquemangacrawler.downloaders;

import org.coque.coquemangacrawler.model.Manga;

public interface Downloader {
    void baixarManga(Manga manga);
    void montarURL();
    void salvarManga();
}
