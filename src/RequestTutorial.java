import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by comer on 14.06.2017.
 */
@WebServlet(name = "RequestTutorial",urlPatterns = {"/RequestTutorial"})
public class RequestTutorial extends HttpServlet {

    @Override
    public  void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
//doGet ile işlem yaptığımızda html deki verileri url üzerinden taşır, bu da güvenli olmaz, post ile taşımak daha güvenlidir.
        PrintWriter printWriter=response.getWriter();
        printWriter.write("<html><body>");
        printWriter.write(request.getParameter("firstName"));
        printWriter.write("<br>");
        printWriter.write(request.getParameter("surName"));
        printWriter.write("<br>");
        printWriter.write(request.getParameter("marialStatus"));
        printWriter.write("<br>");
        String [] parameterlist=request.getParameterValues("proLang");
        for (int i=0;i<parameterlist.length;i++)
        {
            printWriter.write(parameterlist[i]);
            printWriter.write("<br>");
        }
    }
}
