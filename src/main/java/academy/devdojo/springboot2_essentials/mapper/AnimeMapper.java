package academy.devdojo.springboot2_essentials.mapper;

import academy.devdojo.springboot2_essentials.Requests.AnimePostRequestBody;
import academy.devdojo.springboot2_essentials.Requests.AnimePutRequestBody;
import academy.devdojo.springboot2_essentials.domain.Anime;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
