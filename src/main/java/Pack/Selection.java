package Pack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class Selection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Thread NMap,Openssl;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Name = request.getParameter("Name"),Name1="";
        String Comp = request.getParameter("Comp");
        String IP = request.getParameter("IP");
        String select = request.getParameter("field4");
        if(select.equals("NMap")){
        	NMap NMap = new NMap();
            Name1=NMap.Map(IP);
	        request.setAttribute("Name1",Name1);
    		
        }
        else if(select.equals("table")){
        	NMap NMap = new NMap();
            NMap.Map(IP);
            Cipher_table read=new Cipher_table();
	        String s=read.reading();
	        request.setAttribute("Name1",s);
        }
        else if(select.equals("OpenSSL")){
        	Openssl = new Openssl(IP);
    		Openssl.start();
    		Name1="Message: OpenSSL SUCCESS! \n\n The process may take a while to display the text file of certificate";
    		
 	        request.setAttribute("Name1",Name1);
        }
        else if(select.equals("CVE")){
			Cve Cve = new Cve();
	        Cve.Map(Comp,IP);
	        //System.out.println(Name);
	        //System.out.println(IP);
	        //System.out.println(Comp);
	        CveSearch c= new CveSearch();
	        Name="CVE-"+Name;
	        Name1 = c.CveSearch1(Name);
	        Name1="Message: CVE SUCCESS! \n\n"+ Name1;
	        request.setAttribute("Name1",Name1);
        }
        getServletContext().getRequestDispatcher("/index1.jsp").forward(request, response);
	}

}
