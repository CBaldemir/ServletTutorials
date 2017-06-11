import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by comer on 11.06.2017.
 */
@WebServlet("/lifecycle")
public class lifeCycle extends HttpServlet{

    @Override
    public void init()
    {
        System.out.println("Init methodu çağrıldı");
        //Servlet istek attığımızda konsolda çıktımızı görebiliyouz.
    }
    @Override
    public  void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{

        PrintWriter printWriter=response.getWriter();
        String message="LifeCycle";
        printWriter.write(message);

    }
@Override
    public void destroy()
{
    System.out.println("Servlet destroy edildi");
    // Servlet sonlandırdığımızda konsolda "Servlet destroy edildi çıktısını göreüyoruz.

}
}
