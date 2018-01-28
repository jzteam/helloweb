package cn.jzteam;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class JzteamHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        final String sessionId = httpSessionEvent.getSession().getId();
        System.out.println("session创建了 " + sessionId);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        final String sessionId = httpSessionEvent.getSession().getId();
        System.out.println("session销毁了 " + sessionId);
    }
}
