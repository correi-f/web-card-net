package fr.web.card.net.infrastructure.playercolor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerColorRepository extends JpaRepository<PlayerColorEntity, Integer> {

    List<PlayerColorEntity> findByPlayerId(String playerId);
}
