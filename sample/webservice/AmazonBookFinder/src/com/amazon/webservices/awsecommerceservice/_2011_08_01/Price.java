// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;

public class Price implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Amount")
	@Order(value=0)
	public BigInteger amount;	
	
	@Element(name = "CurrencyCode")
	@Order(value=1)
	public String currencyCode;	
	
	@Element(name = "FormattedPrice")
	@Order(value=2)
	public String formattedPrice;	
	
    
}