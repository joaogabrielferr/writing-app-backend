package com._verso._verso.articles.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record ArticlePostDTO(
        @NotBlank(message = "title cannot be empty")
        @NotNull(message = "title is required")
        String title,
        String subtitle,
        @NotBlank(message = "content cannot be empty")
        @NotNull(message = "content is required")
        String content,
        String thumbnailUrl,
        @NotNull(message = "author id is required")
        @NotBlank(message = "author id cannot be empty")
        UUID authorId) {
}
