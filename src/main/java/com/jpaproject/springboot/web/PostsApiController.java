package com.jpaproject.springboot.web;

import com.jpaproject.springboot.domain.posts.PostsRepository;
import com.jpaproject.springboot.service.PostsService;
import com.jpaproject.springboot.web.dto.PostsResponseDto;
import com.jpaproject.springboot.web.dto.PostsSaveRequestDto;
import com.jpaproject.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long seve(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto resquestDto) {
        return postsService.update(id, resquestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

}
