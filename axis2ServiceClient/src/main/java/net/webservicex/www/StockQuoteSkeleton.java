
/**
 * StockQuoteSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */
    package net.webservicex.www;
    /**
     *  StockQuoteSkeleton java skeleton for the axisService
     */   
    
    
    public class StockQuoteSkeleton {
        
         
        /**
         * Auto generated method signature
         * Get Stock quote for a company Symbol
                                     * @param getQuote 
             * @return getQuoteResponse 
         */
        
                 public net.webservicex.www.GetQuoteResponse getQuote ( net.webservicex.www.GetQuote getQuote )
            {
                	 
                	 
                	 try{
                    	 GetQuote quote = new GetQuote();
                    	 GetQuoteResponse respo = new GetQuoteResponse();
                    	 StockQuoteMessageReceiverInOut stockMessage = new StockQuoteMessageReceiverInOut();
                    	 
                    	 respo.setGetQuoteResult(quote.getSymbol());
                    	 return respo;
                     }catch(UnsupportedOperationException ex){
                    	 throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getQuote");
                    	 
                     }
                
        }                 
                 
     
    }
    
    
    
    