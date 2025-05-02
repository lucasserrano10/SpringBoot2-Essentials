package academy.devdojo.springboot2_essentials.repository;

import devdojoAcademySpringbootDomain.Anime;
import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
