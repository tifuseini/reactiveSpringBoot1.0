package com.springboot.socialMediaPlatform.repository;

import com.springboot.socialMediaPlatform.model.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter,String> {
}
