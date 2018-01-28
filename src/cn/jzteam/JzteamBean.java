package cn.jzteam;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

public class JzteamBean implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {

    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
        final Object source = httpSessionEvent.getSource();
        System.out.println("sessionEvent.getSource="+source.getClass().getSimpleName());
        System.out.println(httpSessionEvent.getSession().getId()+"钝化。。。");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        System.out.println(httpSessionEvent.getSession().getId()+"活化。。。");
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {

        System.out.println("放入[javabean]session"+httpSessionBindingEvent.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println(httpSessionBindingEvent.getName()+"移出[javabean]session");
    }
}
