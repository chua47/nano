// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type for the shipping-related details for an item or transaction.
 * 
 */
public class ShippingCostSummaryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingServiceName")
	public String shippingServiceName;	
	
	@Element(name = "ShippingServiceCost")
	public AmountType shippingServiceCost;	
	
	@Element(name = "InsuranceCost")
	public AmountType insuranceCost;	
	
	@Element(name = "ShippingType")
	public ShippingTypeCodeType shippingType;	
	
	@Element(name = "LocalPickup")
	public Boolean localPickup;	
	
	@Element(name = "InsuranceOption")
	public InsuranceOptionCodeType insuranceOption;	
	
	@Element(name = "ListedShippingServiceCost")
	public AmountType listedShippingServiceCost;	
	
	@Element(name = "ImportCharge")
	public AmountType importCharge;	
	
	@AnyElement
	public List<Object> any;	
	
    
}