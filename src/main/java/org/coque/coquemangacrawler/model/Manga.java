package org.coque.coquemangacrawler.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Manga {

    public String nome;
    public String capitulo;
    public String origem;
    public String prefixo;

}
