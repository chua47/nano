// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

@RootElement(name = "SearchBinSet", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class SearchBinSet implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Bin")
	public List<Bin> bin;	
	
	@Attribute(name = "NarrowBy")
	public String narrowBy;	
	
    
}