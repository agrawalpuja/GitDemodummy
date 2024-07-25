package userData.data;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class ReadfilefromURL {

	public static void main(String[] args) throws  MalformedURLException {
		// TODO Auto-generated method stub

	/*	URL url = new URL("https://www.baeldung.com/domain");
		String host = url.getHost();
		System.out.println(host);
		
		System.out.println(url.getDefaultPort());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		
		System.out.println(url.toString());  */

String url = "https://gorest.co.in/public/v2/users";
     String[] substrings = url.split("/" ,4);


   
   /*  for ( int i=0 ;i<url1.length ;i++)
     {
    	 System.out.println(url1[i]+ " ");
     }
     
    // String url2 = url.concat("?name=Puja");
    // System.out.println(url2); */

      System.out.println(Arrays.toString(substrings));
      
     // System.out.println(substrings[3]);
	} 

}
