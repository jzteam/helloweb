package cn.jzteam;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class PageTag extends SimpleTagSupport{
    private boolean test;
    // 解析器会根据setter方法为test赋值为标签中的属性值
    public void setTest(boolean test) {
        this.test = test;
    }
    @Override
    public void doTag() throws JspException, IOException {
        // 相当于pageConext
        final JspContext jspContext = this.getJspContext();
        // 表示jsp文件中，该标签的标签体
        final JspFragment jspBody = this.getJspBody();
        StringWriter dataWriter = new StringWriter();
        // jspBody只提供一个方法invoke，传入一个字符流，它会把标签体写入流中
        jspBody.invoke(dataWriter);
        // 后台打印标签体内容，包括jsp页面中的换行空格
        System.out.println(dataWriter.toString());
        // 通过jspContext获得jsp隐含对象out，并将标签体拼接额外信息后输出到out
        jspContext.getOut().write("<center>"+dataWriter.toString()+"</center>");
        // 表示标签体不再特殊处理，直接写入response中展示
        jspBody.invoke(null);
    }
}

