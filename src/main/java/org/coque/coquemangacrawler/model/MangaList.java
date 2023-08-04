package org.coque.coquemangacrawler.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class MangaList {

    public List<Manga> mangas;

    public String toString(){
        StringBuilder mangasString = new StringBuilder();
        for (Manga manga : mangas){
            mangasString.append("{")
                    .append(manga.toString())
                    .append("} ");
        }

        return mangasString.toString();
    }
}
