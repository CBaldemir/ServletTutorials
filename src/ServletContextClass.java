import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by comer on 13.06.2017.
 */
public class ServletContextClass extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{

        PrintWriter printWriter=response.getWriter();
        ServletContext context=getServletContext();
        printWriter.write("<html><body>");
        Enumeration <String> parameterlist=context.getInitParameterNames();
        // Enumeration ile web xml girmiş olduğumuz contextparam key lerini parameterliste aktardık.
        while (parameterlist.hasMoreElements())
        {
            printWriter.write(parameterlist.nextElement());
            // Burada da aktardığımız keyleri ekrana yazdırdık.
            printWriter.write("<br>");
        }

        printWriter.write(context.getInitParameter("Ad"));
        // Key i "Ad" olan paramname in value sini ekrana yazdırdık.
        printWriter.write("<br>");
        printWriter.write(context.getInitParameter("E-mail"));
        // Key i "E-mail" olan paramname in value sini ekrana yazdırdık.
        printWriter.write("</body></html>");
        printWriter.close();


    }
}
