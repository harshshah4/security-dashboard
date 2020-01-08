package Pack;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CveSearch {

	public String CveSearch1(String inputSearch)
	{
	    double count = 0,countBuffer=0;
	    int countLine=0;
	    String lineNumber = "";
	    String filePath = "C:\\Users\\hshah\\workspace\\SecurityServers\\thread2.txt";
	    BufferedReader br;
	  
	    String line = "";

	    try {
	        br = new BufferedReader(new FileReader(filePath));
	        try {
	            while((line = br.readLine()) != null)
	            {
	                countLine++;
	                //System.out.println(line);
	                String[] words = line.split(" ");

	                for (String word : words) {
	                  if (word.equals(inputSearch)) {
	                    count++;
	                    countBuffer++;
	                  }
	                }

	                if(countBuffer > 0)
	                {
	                    countBuffer = 0;
	                    if(lineNumber!="")lineNumber+=",";
	                    lineNumber += countLine;
	                    
	                }

	            }
	            br.close();
	           
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	    //System.out.println("Times found at--"+count);
	    //System.out.println("Word found at--"+lineNumber);
	    line="";
	    if(count==0.0)line = "NOT Fixed CVE";
	    else line+="Fixed CVE found at line "+lineNumber;
	    //System.out.println(line);
	    return line;
	}
	
}
