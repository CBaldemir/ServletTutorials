import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by comer on 11.06.2017.
 */
@WebServlet("/helloservlet")// Bu şekilde bir anotation tanımladığımızda web xmle servledimizi tanımlamak zorunda kalmıyoruz.
// İkinci yolu ise @WebServlet(urlPatterns={"/helloservlet", "merhabaservlet"}) bu sayede iki url yide kullanabiliriz.
public class ServletWithNotation extends HttpServlet{
    public  void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{

        PrintWriter printWriter=response.getWriter();
        String message="Hello Servlet!!!";
        printWriter.write(message);

    }

}
