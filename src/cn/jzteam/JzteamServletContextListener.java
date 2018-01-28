package cn.jzteam;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class JzteamServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("应用启动了");
        System.out.println("初始化应用jar...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("应用销毁了");
    }
}
