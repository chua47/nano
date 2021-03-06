// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Specified whether returns are accepted.
 * 
 */
public enum ReturnsAcceptedOptionsCodeType {

    /**
     * 
   * The seller accepts returns, subject to other details
   * specified in the policy.
   * 
     */
    RETURNS_ACCEPTED("ReturnsAccepted"),
  

    /**
     * 
   * The seller does not accept returns.
   * 
     */
    RETURNS_NOT_ACCEPTED("ReturnsNotAccepted"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    ReturnsAcceptedOptionsCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ReturnsAcceptedOptionsCodeType fromValue(String v) {
        if (v != null) {
            for (ReturnsAcceptedOptionsCodeType c: ReturnsAcceptedOptionsCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}