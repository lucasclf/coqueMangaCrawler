package org.coque.coquemangacrawler.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yaml")
@Getter
public class ConfigMangaCrawler {

    @Value("${config.destiny.path}")
    String destino;

    @Value("${config.json.name}")
    String json;

}
