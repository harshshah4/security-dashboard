package Pack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Openssl extends Thread{
	String IP;
	public Openssl( String IP)
    {this.IP=IP;}

    public void run()
    {
        try
        {
        	String c="openssl s_client -connect "+IP+":443";
        	PrintWriter out = new PrintWriter("C:\\Users\\hshah\\workspace\\SecurityServers\\thread1.txt");
        	 Process p = Runtime.getRuntime().exec(c);
        	 p.waitFor();
        	 BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                 String line = null;
                 while((line=input.readLine()) != null) {
                     out.println(line);
                     //System.out.println(line); 
                 }
                out.close();
                p.destroy();
        }
                catch(Exception e){
                    e.printStackTrace();
                    //System.exit(0);
                }
    
        }
}
