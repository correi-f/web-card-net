package fr.web.card.net.domain;

import java.util.List;

public interface ColorService {

    List<Color> retrieveUserColors(String playerId);
}
