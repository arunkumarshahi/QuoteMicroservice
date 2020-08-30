package com.test.quote.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.quote.model.QuoteDAO;

public interface QuoteRepository extends MongoRepository<QuoteDAO, String> {

}
