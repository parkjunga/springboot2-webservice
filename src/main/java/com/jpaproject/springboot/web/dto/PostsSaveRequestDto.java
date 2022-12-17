package com.jpaproject.springboot.web.dto;

import com.jpaproject.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String anthor;

    @Builder
    public PostsSaveRequestDto(String title, String content, String anthor) {
        this.title = title;
        this.content = content;
        this.anthor = anthor;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .anthor(anthor)
                .build();
    }
}
