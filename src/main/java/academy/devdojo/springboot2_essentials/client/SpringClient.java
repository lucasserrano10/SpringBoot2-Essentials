package academy.devdojo.springboot2_essentials.client;

import academy.devdojo.springboot2_essentials.domain.Anime;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Log4j2
public class SpringClient {
    public static void main(String[] args) {
        ResponseEntity<Anime> entity = new RestTemplate().getForEntity("http://localhost:8080/animes/2", Anime.class);
        log.info(entity);

        Anime forObject = new RestTemplate().getForObject("http://localhost:8080/animes/2", Anime.class);
        log.info(forObject);

    }
}
