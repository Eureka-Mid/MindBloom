package com.eureka.mindbloom.book.dto;

import com.eureka.mindbloom.book.domain.BookLikeStats;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class BookDetailResponse {

    private String isbn;
    private String title;
    private String author;
    private String plot;
    private String publisher;
    private String recommendedAge;
    private String coverImage;
    private String category;
    private String keyword;
    private String viewCount;
    private String likeCount;
    private String createdAt;

    public BookDetailResponse(String isbn, String title, String author, String plot, String publisher, String recommendedAge, String coverImage, String categoryName, String keywords, Long viewCount, List<BookLikeStats> likeCountByIsbn, LocalDateTime createdAt) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.plot = plot;
        this.publisher = publisher;
        this.recommendedAge = recommendedAge;
        this.coverImage = coverImage;
        this.category = categoryName;
        this.keyword = keywords;
        this.viewCount = String.valueOf(viewCount);
        this.likeCount = String.valueOf(likeCountByIsbn);
        this.createdAt = createdAt.toString();
    }
}
