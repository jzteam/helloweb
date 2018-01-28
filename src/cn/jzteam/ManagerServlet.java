package cn.jzteam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ManagerServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入servlet");
        final HttpSession session = req.getSession();
        JzteamBean bean = (JzteamBean)session.getAttribute("testBean");
        if(bean == null){
            bean = new JzteamBean();
            bean.setPwd(System.currentTimeMillis()+"");
            session.setAttribute("testBean",bean);
        }else{
            System.out.println("获取到上次的bean，移除吧");
            session.removeAttribute("testBean");
        }
        System.out.println("打印bean:"+bean.getPwd());
        //resp.getOutputStream().write("hello web!".getBytes());

//        resp.sendRedirect("/index.html");
        req.getRequestDispatcher("/index.jsp").include(req,resp);
//        System.out.println("test redirect");
    }
}
