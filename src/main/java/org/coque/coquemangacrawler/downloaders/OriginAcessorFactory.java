package org.coque.coquemangacrawler.downloaders;

import org.coque.coquemangacrawler.downloaders.impl.LerMangaOriginAcessor;
import org.coque.coquemangacrawler.enums.OriginEnum;

public class OriginAcessorFactory {

    public OriginAcessor createDownloader(OriginEnum origin){
        if(origin == OriginEnum.LER_MANGA){
            return new LerMangaOriginAcessor();
        }

        return null;
    }
}
