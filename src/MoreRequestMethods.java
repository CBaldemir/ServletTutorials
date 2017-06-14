import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by comer on 14.06.2017.
 */
@WebServlet(name = "MoreRequestMethods",urlPatterns = {"/MoreRequestMethods"})
public class MoreRequestMethods extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
            PrintWriter printWriter=response.getWriter();
            printWriter.write("<html><body>");
            printWriter.write(request.getServerName());
            printWriter.write("<br>");
            printWriter.write(request.getHeader("host"));
            printWriter.write("<br>");
            printWriter.write(request.getServerPort());
            printWriter.write("<br>");
            printWriter.write(request.getLocalPort());
            printWriter.write("<br>");
            printWriter.write(request.getRemotePort());
            printWriter.write("<br>");
            printWriter.write(request.getMethod());
            printWriter.write("<br>");
            printWriter.write(request.getContextPath());
            printWriter.write("<br>");
            Enumeration <String> headerNames=request.getHeaderNames();
            while (headerNames.hasMoreElements())
            {
                printWriter.write(headerNames.nextElement());
                printWriter.write("<br>");
            }
            printWriter.write("</body></html>");
        }
}
