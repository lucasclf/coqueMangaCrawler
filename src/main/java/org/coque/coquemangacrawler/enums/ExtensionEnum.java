package org.coque.coquemangacrawler.enums;

public enum ExtensionEnum {
    JPG("jpg"),
    PNG("png"),
    JPEG("jpeg"),
    WEBP("webp");

    public final String extension;
    ExtensionEnum(String extension){
        this.extension = extension;
    }

}
