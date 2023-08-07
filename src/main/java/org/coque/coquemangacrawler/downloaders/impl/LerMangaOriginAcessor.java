package org.coque.coquemangacrawler.downloaders.impl;

import lombok.extern.slf4j.Slf4j;
import org.coque.coquemangacrawler.downloaders.OriginAcessor;
import org.coque.coquemangacrawler.enums.OriginEnum;
import org.coque.coquemangacrawler.model.Manga;
import org.coque.coquemangacrawler.utils.Downloader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LerMangaOriginAcessor implements OriginAcessor {
    private Manga manga;
    @Autowired
    private Downloader downloader;

    @Override
    public void downloadManga(Manga manga) {
        log.info("Download started for {} manga, starting at chapter {} atraves da plataforma {}.",
                manga.name,
                manga.chapter,
                manga.origin);

        this.manga = manga;
        String urlBase = mountURL();
        boolean chapterExists = downloader.chapterVerification(urlBase);
    }

    private String mountURL() {
        StringBuilder url = new StringBuilder();
        url.append(OriginEnum.LER_MANGA.URL)
                .append(manga.prefix)
                .append(manga.name)
                .append(OriginEnum.LER_MANGA.chapterPrefix)
                .append(String.format("%2s", manga.chapter));

        log.info("Mounted URL: {}", url.toString());
        return url.toString();
    }

}
