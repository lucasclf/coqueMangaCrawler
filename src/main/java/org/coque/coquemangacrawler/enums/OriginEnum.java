package org.coque.coquemangacrawler.enums;

public enum OriginEnum {
    LER_MANGA("https://img.lermanga.org"),
    MANGA_LIVRE(""),
    UNION_MANGA("https://umangas.club/leitor/mangas/");

    public final String URL;
    OriginEnum(String URL){
        this.URL = URL;
    }

    public static OriginEnum findByName(String name){
        for(OriginEnum originEnum : OriginEnum.values()){
            if(originEnum.name().equals(name)){
                return originEnum;
            };
        }
        return null;
    }
}
