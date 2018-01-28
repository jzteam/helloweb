package cn.jzteam;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class JzteamHttpSessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        final String sessionId = httpSessionBindingEvent.getSession().getId();
        final String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("放入session="+sessionId+" : "+name+" - "+value);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        final String sessionId = httpSessionBindingEvent.getSession().getId();
        final String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("从session="+sessionId+"中移除: "+name+" - "+value);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("应该不会调用"+httpSessionBindingEvent.getName()+" - "+httpSessionBindingEvent.getValue());
    }
}
