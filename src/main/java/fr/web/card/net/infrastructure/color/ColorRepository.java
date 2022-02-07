package fr.web.card.net.infrastructure.color;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ColorRepository extends JpaRepository<ColorEntity, Integer> {

}
