package fr.web.card.net.application;

import fr.web.card.net.domain.Color;
import fr.web.card.net.domain.ColorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetrievePlayerColorsDisorderly {

    private final ColorService colorService;

    RetrievePlayerColorsDisorderly(ColorService colorService) {
        this.colorService = colorService;
    }

    public List<Color> of(String playerId) {
        return colorService.retrieveUserColors(playerId);
    }
}
