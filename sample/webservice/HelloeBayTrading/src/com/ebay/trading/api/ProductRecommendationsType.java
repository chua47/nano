// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A list of products returned from the Suggested Attributes engine.
 * 
 */
public class ProductRecommendationsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Product")
	@Order(value=0)
	public List<ProductInfoType> product;	
	
    
}