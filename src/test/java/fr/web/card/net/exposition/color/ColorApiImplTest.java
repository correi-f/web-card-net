package fr.web.card.net.exposition.color;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.web.card.net.domain.Color;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ColorApiImplTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_return_400_bad_request_when_playerId_missing() throws Exception {
        this.mockMvc.perform(post("/order/colors"))
                .andExpect(status().isBadRequest())
                .andReturn();
    }

    @Test
    public void should_retrieve_color_randomly_with_200_response() throws Exception {
        MvcResult result = this.mockMvc.perform(post("/order/colors").param("playerId", "123456"))
                .andExpect(status().is2xxSuccessful())
                .andReturn();

        List<Color> colors = Arrays.stream(new ObjectMapper().readValue(result.getResponse().getContentAsString(StandardCharsets.UTF_8), String[].class)).map(Color::fromValue).collect(Collectors.toList());
        assertThat(colors).containsAll(Arrays.asList(Color.CLUB, Color.DIAMOND, Color.HEART, Color.SPADE));
    }
}