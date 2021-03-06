// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns the status of the processing for category-structure changes specified
 * with a call to SetStoreCategories.
 * 
 */
@RootElement(name = "GetStoreCategoryUpdateStatusRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreCategoryUpdateStatusRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TaskID")
	@Order(value=0)
	public Long taskID;	
	
    
}