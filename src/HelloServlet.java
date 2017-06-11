import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * Created by comer on 11.06.2017.
 */
public class HelloServlet extends HttpServlet{
    @Override
    public  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter printWriter=response.getWriter();
        printWriter.write("<html><body>"); // Burada html body etiketlerini açıyoruz.
        String message="<h2> Hello Servlet! Comert Baldemir </h2>";
        printWriter.write(message);
printWriter.write("</body></html>");// Burada da kapatıyoruz etiketleri.

    }

}
