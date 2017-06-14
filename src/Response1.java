import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by comer on 14.06.2017.
 */

@WebServlet(name ="Response1", urlPatterns = {"/response1"})
public class Response1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        //response.setCharacterEncoding("ISO-8859-9");
        response.setContentType("text/html;charset=ISO-8859-9");
        PrintWriter printWriter=response.getWriter();
        printWriter.write("<html>");
        printWriter.write("<head><meta charset='ISO-8859-9'> </head>");
        printWriter.write("<body>");
        printWriter.write("Cömert,Kazım,Selçuk");
        printWriter.write("</body></html>");
    }

}
