import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by comer on 12.06.2017.
 */
public class ServletConfigClass extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        PrintWriter printWriter=response.getWriter();
        ServletConfig config=getServletConfig();
        printWriter.write("<html><body>");
        printWriter.write(config.getInitParameter("Comert"));// initparameter key/value ile çalışır biz key verdiğimizde o da bize value gönderecek.
        printWriter.write("<br>");
        printWriter.write(config.getInitParameter("Fatih"));
        printWriter.write("<br>");
        printWriter.write("Servlet adı"+ config.getServletName());
printWriter.write("</body></html>");

    }
}
