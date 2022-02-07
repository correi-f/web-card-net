package fr.web.card.net.exposition.color;

import fr.web.card.net.application.RetrievePlayerColorsDisorderly;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ColorApiImpl implements ColorApi {

    private final RetrievePlayerColorsDisorderly retrievePlayerColorsDisorderly;

    ColorApiImpl(RetrievePlayerColorsDisorderly retrievePlayerColorsDisorderly) {
        this.retrievePlayerColorsDisorderly = retrievePlayerColorsDisorderly;
    }

    @Override
    public ResponseEntity<List<String>> colors(String playerId) {
        return ResponseEntity.ok(retrievePlayerColorsDisorderly.of(playerId).stream().map(color -> color.value).collect(Collectors.toList()));
    }
}
