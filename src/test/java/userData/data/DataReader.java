package userData.data;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {

	 
		public  List<HashMap<String, String>> getJSONData() throws IOException 
		{		
			String jsonContent=FileUtils.readFileToString(new File("C:\\Project\\Eclipse\\eclipse\\ExcelDriven\\src\\test\\java\\userData\\data\\data.json"),StandardCharsets.UTF_8
					);
		
		    ObjectMapper mapper = new ObjectMapper();
		
		 List<HashMap<String, String>>data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>(){});
				
		
		  return data;
		}
   
	

}

