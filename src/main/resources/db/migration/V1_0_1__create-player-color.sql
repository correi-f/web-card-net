CREATE TABLE IF NOT EXISTS player_color (
    id INT NOT NULL AUTO_INCREMENT,
    color_id INT NOT NULL,
    player_id VARCHAR(50) NOT NULL ,
    PRIMARY KEY (id),
    FOREIGN KEY (color_id) REFERENCES color(id)
);