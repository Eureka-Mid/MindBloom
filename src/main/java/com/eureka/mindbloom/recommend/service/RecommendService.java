package com.eureka.mindbloom.recommend.service;

import java.util.List;

import com.eureka.mindbloom.book.dto.BookRecommendResponse;
import com.eureka.mindbloom.recommend.eums.RecommendLikeType;

public interface RecommendService {
	List<BookRecommendResponse> getRecommendBooks(Long childId);
	void likeRecommendBook(Long childId, Long bookRecommendId, RecommendLikeType likeType);
	List<String> getPreferencesBooksByChildId(Long childId);
	List<String> getTraitBooksByChildId(Long childId);
	List<String> getTopViewedBooks();
	List<String> getSimilarTraitLikeBooks(Long childId);
	void createRecommendBooks(Long childId);
	List<String> getAllPreferencesBooks();
	List<String> getAllTraitBooks();
	List<String> getAllSimilarTraitLikeBooks();
}
