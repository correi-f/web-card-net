package fr.web.card.net.domain;

import java.util.Arrays;

public enum Color {
    SPADE("Pique"),
    HEART("Coeur"),
    CLUB("Trèfle"),
    DIAMOND("Carreau");

    public final String value;

    Color(String value) {
        this.value = value;
    }

    public static Color fromValue(String value) {
        return Arrays.stream(Color.values())
                .filter(color -> color.value.equals(value))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}