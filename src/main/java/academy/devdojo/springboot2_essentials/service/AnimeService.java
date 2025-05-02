package academy.devdojo.springboot2_essentials.service;

import academy.devdojo.springboot2_essentials.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    // private final AnimeRepository  animeRepository;
    public List<Anime> listAll(){
        return List.of(new Anime(1L,"Pokemon"),new Anime(2L,"Goku"));
    }
}