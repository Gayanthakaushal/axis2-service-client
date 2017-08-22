package net.webservicex.www;

import java.rmi.RemoteException;
import org.apache.axis2.AxisFault;
import net.webservicex.www.StockQuoteStub;


public class Client {

	public static void main(String[] args) throws RemoteException {
		StockQuoteStub stub;
		try{
			String symbol = "WSO2";
			stub = new StockQuoteStub("http://10.100.7.53:9763/services/StockQuote/");
			
			StockQuoteStub.GetQuote request = new StockQuoteStub.GetQuote();
			
			request.setSymbol(symbol);
			System.out.println("Hello");
			
			StockQuoteStub.GetQuoteResponse res= stub.getQuote(request);
			
			 String result=res.getGetQuoteResult();
	         
	           System.out.println(result);
		}catch (AxisFault ex){
			ex.printStackTrace();
		}

	}

}
