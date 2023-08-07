package org.coque.coquemangacrawler.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Manga {

    public String name;
    public String chapter;
    public String origin;
    public String prefix;

}
