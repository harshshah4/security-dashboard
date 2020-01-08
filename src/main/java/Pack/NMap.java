package Pack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class NMap {
	
	public NMap()
	{}

   public String Map(String IP)
   {
     
       try
       {
    	   String c="nmap --script ssl-cert,ssl-enum-ciphers --unprivileged -p 443  "+IP;
       	PrintWriter out = new PrintWriter("C:\\Users\\hshah\\workspace\\SecurityServers\\thread.txt");
       	 Process p = Runtime.getRuntime().exec(c);
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = null,q="<br>";
                while((line=input.readLine()) != null) {
                    out.println(line);
                    q+="<br>"+line;
                }
               out.close();
               return "Message: NMAP SUCCESS!!<br><br>"+q;
       }
               catch(Exception e){
                   e.printStackTrace();
                   
               }
       return "Message: error in fetching NMAP results";
       }
}

