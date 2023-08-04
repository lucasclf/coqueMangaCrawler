package org.coque.coquemangacrawler.utils;

import com.google.gson.Gson;
import org.coque.coquemangacrawler.model.Manga;
import org.coque.coquemangacrawler.model.MangaList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;


@Component
public class JsonReader {
    @Autowired
    private Gson gson;

    public List<Manga> toManga(File json) {
        try{
            FileReader reader = new FileReader(json);
            Type mangaListType = new TypeToken<List<Manga>>() {}.getType();
            List<Manga> mangas = gson.fromJson(reader, mangaListType);

            return mangas;

        } catch (IOException ex){
            ex.printStackTrace();
        }

        return null;
    }
}
