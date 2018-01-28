package cn.jzteam;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UploadServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println("获取到name="+name);
        String ct = req.getHeader("Content-Disposition");
        System.out.println("getParamer="+req.getParameter("name"));
        System.out.println("请求头ct="+ct);
        final ServletInputStream in = req.getInputStream();
        byte[] b = new byte[1024000];
        in.read(b);
        System.out.println(new String(b));
    }
}
