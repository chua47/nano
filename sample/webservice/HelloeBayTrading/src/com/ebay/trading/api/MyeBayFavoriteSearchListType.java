// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A list of favorite searches a user has saved on the My eBay page.
 * 
 */
public class MyeBayFavoriteSearchListType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TotalAvailable")
	@Order(value=0)
	public Integer totalAvailable;	
	
	@Element(name = "FavoriteSearch")
	@Order(value=1)
	public List<MyeBayFavoriteSearchType> favoriteSearch;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}