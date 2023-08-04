package org.coque.coquemangacrawler.utils;

import org.coque.coquemangacrawler.enums.OriginEnum;

public class OriginConverter {

    public String toURL(String origin){
        return OriginEnum.findByName(origin).URL;
    }
}
