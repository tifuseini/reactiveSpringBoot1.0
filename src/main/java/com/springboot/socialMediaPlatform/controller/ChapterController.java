package com.springboot.socialMediaPlatform.controller;

import com.springboot.socialMediaPlatform.model.Chapter;
import com.springboot.socialMediaPlatform.repository.ChapterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

    private final ChapterRepository chapterRepository;

    public ChapterController(ChapterRepository chapterRepository){
        this.chapterRepository = chapterRepository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> listing(){
        return chapterRepository.findAll();
    }
}
