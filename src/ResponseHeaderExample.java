import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by comer on 14.06.2017.
 */
@WebServlet(name = "ResponseHeaderExample",urlPatterns = "/ResponseHeaderExample")
public class ResponseHeaderExample extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{

        response.setHeader("arkadas","Emre Sahin");
        response.setHeader("arkadas","Ozgur Bircan");
// set header ile tanımladığımızda aynı key olduğunda son yazdığımızı kabul edecektir. Emre'yi silip yerine Özgür yazacaktır.

        boolean isArkadasAbsent=response.containsHeader("arkadas");
        System.out.println("Arkadas header i var mı?" + isArkadasAbsent);
        String arkadas=response.getHeader("arkadas");
        System.out.println(arkadas);

        response.addHeader("arkadas","Umit Arslan");
        response.addHeader("arkadas","Samet Aslan");
// Addheader ile SetHeader arasındaki fark addheader da aynı isimle birden fazla key tanımlayabiliyoruz.

        Collection <String> arkadasheader=response.getHeaders("arkadas");
        for (String string:arkadasheader)
        {
            System.out.println(string);
        }
        response.setIntHeader("yas",22);
        response.addIntHeader("yil",2017);
        response.addDateHeader("today",System.currentTimeMillis());


    }
}
