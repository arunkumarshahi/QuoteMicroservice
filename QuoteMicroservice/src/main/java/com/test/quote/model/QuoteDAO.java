package com.test.quote.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class QuoteDAO {
@Id
private String quoteId;
private String custRefrence;
private Long productId;
private String productName;
private BigDecimal price;
private Integer quantity;
private BigDecimal totalPrice;
}
