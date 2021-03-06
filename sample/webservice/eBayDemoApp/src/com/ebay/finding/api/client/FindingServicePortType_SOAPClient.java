// Generated by wsdl compiler for android/java
// DO NOT CHANGE!
package com.ebay.finding.api.client;


import com.leansoft.nano.ws.SOAPServiceCallback;
import com.leansoft.nano.ws.NanoSOAPClient;
import com.ebay.finding.api.GetHistogramsResponse;
import com.ebay.finding.api.GetSearchKeywordsRecommendationResponse;
import com.ebay.finding.api.FindItemsForFavoriteSearchResponse;
import com.ebay.finding.api.FindItemsAdvancedRequest;
import com.ebay.finding.api.FindItemsByImageResponse;
import com.ebay.finding.api.FindItemsAdvancedResponse;
import com.ebay.finding.api.GetHistogramsRequest;
import com.ebay.finding.api.FindItemsIneBayStoresRequest;
import com.ebay.finding.api.FindItemsForFavoriteSearchRequest;
import com.ebay.finding.api.FindCompletedItemsResponse;
import com.ebay.finding.api.FindItemsByKeywordsResponse;
import com.ebay.finding.api.FindItemsByProductRequest;
import com.ebay.finding.api.FindItemsByCategoryRequest;
import com.ebay.finding.api.FindItemsByImageRequest;
import com.ebay.finding.api.GetVersionResponse;
import com.ebay.finding.api.FindItemsIneBayStoresResponse;
import com.ebay.finding.api.FindItemsByProductResponse;
import com.ebay.finding.api.FindItemsByCategoryResponse;
import com.ebay.finding.api.GetVersionRequest;
import com.ebay.finding.api.GetSearchKeywordsRecommendationRequest;
import com.ebay.finding.api.FindCompletedItemsRequest;
import com.ebay.finding.api.FindItemsByKeywordsRequest;


/**
 This class is the SOAP client to the FindingServicePortType Web Service.
*/ 
public class FindingServicePortType_SOAPClient extends NanoSOAPClient {


    /**
     public method
    */
    public void getSearchKeywordsRecommendation(GetSearchKeywordsRecommendationRequest requestObject, SOAPServiceCallback<GetSearchKeywordsRecommendationResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "getSearchKeywordsRecommendation");       
        
        super.invoke(requestObject, serviceCallback, GetSearchKeywordsRecommendationResponse.class);
    }

    /**
     public method
    */
    public void findItemsByKeywords(FindItemsByKeywordsRequest requestObject, SOAPServiceCallback<FindItemsByKeywordsResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "findItemsByKeywords");       
        
        super.invoke(requestObject, serviceCallback, FindItemsByKeywordsResponse.class);
    }

    /**
     public method
    */
    public void findItemsByCategory(FindItemsByCategoryRequest requestObject, SOAPServiceCallback<FindItemsByCategoryResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "findItemsByCategory");       
        
        super.invoke(requestObject, serviceCallback, FindItemsByCategoryResponse.class);
    }

    /**
     public method
    */
    public void findItemsAdvanced(FindItemsAdvancedRequest requestObject, SOAPServiceCallback<FindItemsAdvancedResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "findItemsAdvanced");       
        
        super.invoke(requestObject, serviceCallback, FindItemsAdvancedResponse.class);
    }

    /**
     public method
    */
    public void findItemsByProduct(FindItemsByProductRequest requestObject, SOAPServiceCallback<FindItemsByProductResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "findItemsByProduct");       
        
        super.invoke(requestObject, serviceCallback, FindItemsByProductResponse.class);
    }

    /**
     public method
    */
    public void findItemsIneBayStores(FindItemsIneBayStoresRequest requestObject, SOAPServiceCallback<FindItemsIneBayStoresResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "findItemsIneBayStores");       
        
        super.invoke(requestObject, serviceCallback, FindItemsIneBayStoresResponse.class);
    }

    /**
     public method
    */
    public void findItemsByImage(FindItemsByImageRequest requestObject, SOAPServiceCallback<FindItemsByImageResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "findItemsByImage");       
        
        super.invoke(requestObject, serviceCallback, FindItemsByImageResponse.class);
    }

    /**
     public method
    */
    public void getHistograms(GetHistogramsRequest requestObject, SOAPServiceCallback<GetHistogramsResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "getHistograms");       
        
        super.invoke(requestObject, serviceCallback, GetHistogramsResponse.class);
    }

    /**
     public method
    */
    public void findCompletedItems(FindCompletedItemsRequest requestObject, SOAPServiceCallback<FindCompletedItemsResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "findCompletedItems");       
        
        super.invoke(requestObject, serviceCallback, FindCompletedItemsResponse.class);
    }

    /**
     public method
    */
    public void getVersion(GetVersionRequest requestObject, SOAPServiceCallback<GetVersionResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "getVersion");       
        
        super.invoke(requestObject, serviceCallback, GetVersionResponse.class);
    }

    /**
     public method
    */
    public void findItemsForFavoriteSearch(FindItemsForFavoriteSearchRequest requestObject, SOAPServiceCallback<FindItemsForFavoriteSearchResponse> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-SOA-OPERATION-NAME", "findItemsForFavoriteSearch");       
        
        super.invoke(requestObject, serviceCallback, FindItemsForFavoriteSearchResponse.class);
    }


}