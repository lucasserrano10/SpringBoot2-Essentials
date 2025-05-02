package academy.devdojo.springboot2_essentials.controller;

import academy.devdojo.springboot2_essentials.domain.Anime;
import academy.devdojo.springboot2_essentials.domain.Anime;
import academy.devdojo.springboot2_essentials.service.AnimeService;
import academy.devdojo.springboot2_essentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@RequiredArgsConstructor
public class AnimeController {
    private final AnimeService animeService;

    @GetMapping
    public List<Anime> list() {
        return animeService.listAll();
    }
}