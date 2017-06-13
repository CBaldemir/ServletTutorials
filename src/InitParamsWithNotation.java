import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by comer on 13.06.2017.
 */

@WebServlet(name="initParamsWithNotation",urlPatterns = {"/initParamsWithNotation"},initParams = {
        @WebInitParam(name = "Comert",value = "Comert Baldemir"),@WebInitParam(name = "Fatih",value = "Fatih Baldemir")})
// Bu şekilde initparameterların web xml yazmadan annotationlarla da yapıldığını gördük.
public class InitParamsWithNotation extends HttpServlet {

    @Override
    public  void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{

        PrintWriter printWriter=response.getWriter();
        ServletConfig config=getServletConfig();
        Enumeration<String> initParameterlist =config.getInitParameterNames();
        printWriter.write("<html><body>");
        while (initParameterlist.hasMoreElements())
        {
            String string=(String)initParameterlist.nextElement();
            printWriter.write(string);// Burada initparameter ları sırasıyla key lerini yazdırdı.
            printWriter.write("<br>");

        }
        printWriter.write("Servlet adı"+ config.getServletName());
        printWriter.write("<br>");
        printWriter.write(config.getInitParameter("Comert"));
        printWriter.write("<br>");
        printWriter.write(config.getInitParameter("Fatih"));
    }

}
