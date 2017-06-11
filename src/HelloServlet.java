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
        String message="Hello Servlet! Comert Baldemir";
        printWriter.write(message);

    }

}
