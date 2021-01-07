package learnServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到get请求");
        Enumeration<String> headNames = req.getHeaderNames();
        while (headNames.hasMoreElements()){
            String element = headNames.nextElement();
            System.out.println(element + ":" + req.getHeader(element));
        }
        System.out.println(req.getParameter("usr_name"));
        System.out.println(req.getParameter("usr_passwd"));
        System.out.println("----------------------------------");
        Enumeration<String> requestParameter = req.getParameterNames();
        while (requestParameter.hasMoreElements()){
            String element = headNames.nextElement();
            System.out.println(requestParameter + req.getParameter(element));
        }
        System.out.println("----------------------------------");
//        Map<String, String[]> reqParas = req.getParameterMap();
//        System.out.println(reqParas);*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到post请求");
    }
}
