package main.java.InterviewPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaAPIRequest {
	
	final static ObjectMapper g_ObjectMapper = new ObjectMapper();
	
	public static void main(String[] args) {
		HttpURLConnection conn = null;
		try {
			
			URL url = new URL("https://catfact.ninja/fact");
			StringBuilder result = new StringBuilder();
		    conn = (HttpURLConnection) url.openConnection();
		    conn.setRequestMethod("GET");
		    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		    for (String line; (line = reader.readLine()) != null; ) {
		              result.append(line);
		    }
		    
		    TypeReference<CatFact> cf_TypeReference = new TypeReference<CatFact>() {};
		    
		    CatFact bid_list = g_ObjectMapper.readValue(result.toString(),cf_TypeReference);
		    
		    System.out.println(bid_list);
		    
		    System.out.println(result.toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conn.disconnect();
		}
		
		try {
			URL obj = new URL("https://httpbin.org/json");
			HttpURLConnection con =  (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			//con.setRequestProperty("motherfucking", "motherfucker");
			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				// print result
				System.out.println(response.toString());
			} else {
				System.out.println("GET request did not work.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			//URL obj = new URL("https://httpbin.org/anything");
			URL obj = new URL("https://httpbin.org/response-headers");
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			//String andysCatFact = "I hate cats!";
			
			con.setRequestProperty("Accept", "application/json");
			
			con.setRequestProperty("Content-Type", "application/json");
			
			/*con.setRequestProperty("fact", andysCatFact);
			con.setRequestProperty("length", String.valueOf(andysCatFact.length()));
			con.setRequestProperty("motherfucking", "motherfucker");*/
			
			con.setRequestProperty("freeform", "fuck");
			
			System.out.println(con.getRequestProperties());

			// For POST only - START
			con.setDoOutput(true);
			OutputStream os = con.getOutputStream();
			//os.write(POST_PARAMS.getBytes());
			os.flush();
			os.close();
			// For POST only - END

			int responseCode = con.getResponseCode();
			System.out.println("POST Response Code :: " + responseCode);

			if (responseCode == HttpURLConnection.HTTP_OK) { //success
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				// print result
				System.out.println(response.toString());
			} else {
				System.out.println("POST request did not work.");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
