<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="java.util.Date" pageEncoding="utf-8" %>
<%@ taglib prefix="page" uri="http://www.jzteam.com" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title></title>
  </head>
  <body>

    <fmt:formatDate value="<%=new Date() %>" dateStyle="FULL" type="both"></fmt:formatDate><br/>
    <fmt:formatDate value="<%=new Date() %>" dateStyle="LONG" type="both"></fmt:formatDate><br/>
    <fmt:formatDate value="<%=new Date() %>" dateStyle="SHORT" type="both"></fmt:formatDate><br/>
    <fmt:formatDate value="<%=new Date() %>" dateStyle="full" type="both"></fmt:formatDate><br/>
    <c:if test="${1 == 2}"><h1>哈哈</h1></c:if>

    <fmt:formatNumber  type="number"  value="${8/7}"  maxFractionDigits="0"/><br/>

    <page:MyTag test="${not empty '   '}">
      <h1>come on ${not empty '   '}</h1>
    </page:MyTag>

    <hr/>

    <form action="/upload" method="post" enctype="multipart/form-data">
      名称：<input type="text" name = "name" /><br/>
      文件：<input type="file" name="file" placeholder="select file" /><br/>
      <input type="submit" value="提交"><br/>
    </form>

  </body>
</html>