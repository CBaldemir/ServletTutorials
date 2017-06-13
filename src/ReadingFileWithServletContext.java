import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * Created by comer on 13.06.2017.
 */

public class ReadingFileWithServletContext extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{

        ServletContext context=getServletContext();
        // InputStream de context ile txt ve propertiesin yolunu belirttik.
        InputStream txtstream=context.getResourceAsStream("/WEB-INF/comert.txt");
        InputStream propstream=context.getResourceAsStream("/WEB-INF/name.properties");
        Properties properties=new Properties();
        properties.load(propstream);

        System.out.println(properties.getProperty("name"));// Burada propertiese yazmış olduğumuz "name" karşılığını konsolda yazdırdık.
        System.out.println(properties.getProperty("surname"));// Burada propertiese yazmış olduğumuz "surname" karşılığını konsolda yazdırdık.


        int content;
        // ServletOutputStream de bir diğer ekrana yazdırmak için kullanılan sınıf, genellkle dosya okuma işlemlerinde kullanılıyor.
        ServletOutputStream servletOutputStream=response.getOutputStream();
        while ((content = txtstream.read())!=-1) {
            servletOutputStream.write(content); // Burada txt dosyasının içindekilerini ekrana yazdırdık.

        }

// PrintWriter ile ServletOutputStream i aynı anda kullanamıyoruz, PrintWriter ile context ile yapabileceklerimizi örnekledim.
/*
        PrintWriter printWriter=response.getWriter();
        printWriter.write(context.getContextPath());
        printWriter.write(context.getRealPath("/WEB-INF/comert.txt")); Burada comert.txt nin gerçek yolunu ekrana yazdırdı.
        printWriter.write(context.getServletContextName()); Contextname isimini yazdırdık
*/

    }

}
