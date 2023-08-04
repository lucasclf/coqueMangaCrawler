package org.coque.coquemangacrawler.downloaders;

import org.coque.coquemangacrawler.model.Manga;

public interface Downloader {
    public void baixarManga(Manga manga);
    public void montarURL();
    public void salvarManga();
}
