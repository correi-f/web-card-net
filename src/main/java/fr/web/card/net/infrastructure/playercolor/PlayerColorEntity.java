package fr.web.card.net.infrastructure.playercolor;

import fr.web.card.net.infrastructure.color.ColorEntity;

import javax.persistence.*;

@Entity
@Table(name = "player_color")
public class PlayerColorEntity {

    PlayerColorEntity() {
    }

    public PlayerColorEntity(ColorEntity color, String playerId) {
        this.color = color;
        this.playerId = playerId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "colorId")
    private ColorEntity color;

    @Column(name = "playerId")
    private String playerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ColorEntity getColor() {
        return color;
    }

    public void setColor(ColorEntity color) {
        this.color = color;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
