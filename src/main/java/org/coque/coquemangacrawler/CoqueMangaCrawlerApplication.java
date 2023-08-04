package org.coque.coquemangacrawler;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CoqueMangaCrawlerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CoqueMangaCrawlerApplication.class, args);

        MangaCrawler mangaCrawler = context.getBean(MangaCrawler.class);
        mangaCrawler.start();
    }

}
