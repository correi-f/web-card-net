package fr.web.card.net.infrastructure.color;

import fr.web.card.net.domain.Color;
import fr.web.card.net.domain.ColorService;
import fr.web.card.net.infrastructure.playercolor.PlayerColorEntity;
import fr.web.card.net.infrastructure.playercolor.PlayerColorRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ColorServiceImpl implements ColorService {

    private final ColorRepository colorRepository;
    private final PlayerColorRepository playerColorRepository;

    ColorServiceImpl(ColorRepository colorRepository, PlayerColorRepository playerColorRepository) {
        this.colorRepository = colorRepository;
        this.playerColorRepository = playerColorRepository;
    }

    @Override
    public List<Color> retrieveUserColors(String playerId) {
        List<ColorEntity> entityColors = colorRepository.findAll();
        Collections.shuffle(entityColors);
        List<PlayerColorEntity> playerColorEntities = playerColorRepository.findByPlayerId(playerId);
        if (playerColorEntities.isEmpty()) {
            entityColors.forEach(color -> playerColorRepository.save(new PlayerColorEntity(color, playerId)));
        } else {
            IntStream.range(0, 4).forEach(index -> {
                PlayerColorEntity entity = playerColorEntities.get(index);
                entity.setColor(entityColors.get(index));
                playerColorRepository.save(entity);
            });
        }
        return entityColors.stream().map(colorEntity -> Color.fromValue(colorEntity.getValue())).collect(Collectors.toList());
    }
}
