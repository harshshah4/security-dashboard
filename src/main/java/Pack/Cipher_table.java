package Pack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cipher_table {
	public String reading(){
		BufferedReader br;
		try {
			int space,space2,space3,space4;
			String sCurrentLine;
			String table="<table style=\"color: blue; border: 1px solid grey\"><tr style=\" color: white; background-color: grey\"><th>TLS Version</th><th>SSL Cipher Suite</th><th>Kx</th><tr>";
	
			br = new BufferedReader(new FileReader("C:\\Users\\hshah\\workspace\\SecurityServers\\thread.txt"));
			 
			while ((sCurrentLine = br.readLine()) != null) {
				if(sCurrentLine.contains("TLSv")){
					
					String s=sCurrentLine.substring(4,11);
					//System.out.println(s);
					//Pattern p = Pattern.compile("|       TLS_");
				    //Matcher m;
					while((sCurrentLine = br.readLine()) != null){
						//m = p.matcher(sCurrentLine);
						//System.out.println(sCurrentLine);
					
						if(sCurrentLine.contains("TLS_")){
							//System.out.println(sCurrentLine);
							space=sCurrentLine.indexOf(" ",8);
							space2=sCurrentLine.indexOf(" ",space+1);
							space3=sCurrentLine.indexOf(")",space+1);
							space4=space2>space3?space3:space2;
							//System.out.println(space+"/t"+space2);
							table+="<tr><td style=\" border: 1px solid grey;border-collapse: collapse\">"+s+"</td><td style=\" border: 1px solid grey;border-collapse: collapse\">"+sCurrentLine.substring(8,space)+"</td><td style=\" border: 1px solid grey;border-collapse: collapse\">"+sCurrentLine.substring(space+2, space4)+"</td>";
							
						}
						
						else if(sCurrentLine.contains("compressors")){
							break;
						}
					}
					table+="</tr>";
				}
			}
			table+="</table>";
			br.close();
			return table;
		
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
