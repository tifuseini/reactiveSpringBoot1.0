package com.springboot.socialMediaPlatform.utils;

import com.springboot.socialMediaPlatform.model.Chapter;
import com.springboot.socialMediaPlatform.repository.ChapterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ChapterRepository chapterRepository){
        return args -> {
            Flux.just(
                    new Chapter("Chapter 1"),
                    new Chapter("Chapter 2"),
                    new Chapter("Chapter 3"))
                    .flatMap(chapterRepository::save)
                    .subscribe(System.out::println);

        };
    }

}
