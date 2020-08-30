package com.test.quote.model;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class QuoteTO {
	private String quoteId;
	private String custRefrence;
	private Long productId;
	private String productName;
	private BigDecimal price;
	private Integer quantity;
	private BigDecimal totalPrice;
}
