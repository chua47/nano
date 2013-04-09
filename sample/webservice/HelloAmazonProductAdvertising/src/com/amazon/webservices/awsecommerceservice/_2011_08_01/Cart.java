// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

@RootElement(name = "Cart", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class Cart implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Request")
	public Request request;	
	
	@Element(name = "CartId")
	public String cartId;	
	
	@Element(name = "HMAC")
	public String hmac;	
	
	@Element(name = "URLEncodedHMAC")
	public String urlEncodedHMAC;	
	
	@Element(name = "PurchaseURL")
	public String purchaseURL;	
	
	@Element(name = "MobileCartURL")
	public String mobileCartURL;	
	
	@Element(name = "SubTotal")
	public Price subTotal;	
	
	@Element(name = "CartItems")
	public CartItems cartItems;	
	
	@Element(name = "SavedForLaterItems")
	public SavedForLaterItems savedForLaterItems;	
	
	@Element(name = "SimilarProducts")
	public SimilarProducts similarProducts;	
	
	@Element(name = "TopSellers")
	public TopSellers topSellers;	
	
	@Element(name = "NewReleases")
	public NewReleases newReleases;	
	
	@Element(name = "SimilarViewedProducts")
	public SimilarViewedProducts similarViewedProducts;	
	
	@Element(name = "OtherCategoriesSimilarProducts")
	public OtherCategoriesSimilarProducts otherCategoriesSimilarProducts;	
	
    
}