// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Response to GetTaxTableRequest.
 * 
 */
@RootElement(name = "GetTaxTableResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetTaxTableResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "LastUpdateTime")
	@Order(value=0)
	public Date lastUpdateTime;	
	
	@Element(name = "TaxTable")
	@Order(value=1)
	public TaxTableType taxTable;	
	
    
}