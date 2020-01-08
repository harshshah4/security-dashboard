package Pack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class Cve {
	
	public Cve( )
	{
		
	}

   
   public void Map(String component, String IP)
   {
     
       try
       {PrintWriter out1 = new PrintWriter("command.txt");
    	component="rpm -q --changelog "+component;
    	out1.println(component);
    	out1.close();
    	//System.out.println(IP);
    	String c="plink root@"+IP+" -pw hpvse1 -m command.txt";
       	PrintWriter out = new PrintWriter("C:\\Users\\hshah\\workspace\\SecurityServers\\thread2.txt");
       	 Process p = Runtime.getRuntime().exec(c);
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = null;
                while((line=input.readLine()) != null) {
                    out.println(line);
              
                }
               p.destroy();
               out.close();
               
   			
       }
               catch(Exception e){
                   e.printStackTrace();
                   System.exit(0);
               }
       
       }
}

