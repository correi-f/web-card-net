package fr.web.card.net.exposition.color;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface ColorApi {

    @PostMapping("/order/colors")
    @ResponseBody
    ResponseEntity<List<String>> colors(@RequestParam String playerId);
}
