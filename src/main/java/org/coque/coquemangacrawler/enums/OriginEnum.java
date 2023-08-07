package org.coque.coquemangacrawler.enums;

public enum OriginEnum {
    LER_MANGA("https://img.lermanga.org", "/capitulo-"),
    MANGA_LIVRE("", ""),
    UNION_MANGA("https://umangas.club/leitor/mangas/", "");

    public final String URL;
    public final String chapterPrefix;
    OriginEnum(String URL, String chapterPrefix){
        this.URL = URL;
        this.chapterPrefix = chapterPrefix;
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
