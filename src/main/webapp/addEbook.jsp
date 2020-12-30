<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.wuwang.ebookshare.service.EbookService" %>
<%@ page import="com.wuwang.ebookshare.pojo.Ebook" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>电子书分享-分享</title>
</head>
<body>
        <!--头部-->
        <div style="background-color: cornflowerblue; color: white; width: 100%;height:80px;">
            <h1 style="line-height: 80px; margin-left:30px;">电子书分享</h1>
        </div>

        <!--菜单-->
        <table style="border:1px solid cornflowerblue ; width: 100%; ">
            <tr>
                <td width="10%"><a href="http://49.235.252.43:8080/ebookshare/index.jsp">我要找书</a></td>
                <td width="10%"><a href="http://49.235.252.43:8080/ebookshare/addEbookPage.jsp">我要分享</a></td>
                <td></td>
                <td></td>
                <td width="50%"></td>
            </tr>
        </table>
<%
    EbookService es = new EbookService();
    String book_name = request.getParameter("book_name");
    String book_descriptions = request.getParameter("book_descriptions");
    String book_formate = request.getParameter("book_formate");
    String book_url_from=request.getParameter("book_url_from");
    String book_url=request.getParameter("book_url");
    int book_url_status = 1;
    String user_message = request.getParameter("user_message");
    String book_url_code=request.getParameter("book_url_code");

    Ebook ebook = new Ebook();
    ebook.setBook_name(book_name);
    ebook.setBook_descriptions(book_descriptions);
    ebook.setBook_formate(book_formate);
    ebook.setBook_url_from(book_url_from);
    ebook.setBook_url(book_url);
    ebook.setBook_url_status(book_url_status);
    ebook.setUser_message(user_message);
    ebook.setBook_url_code(book_url_code);

    es.addEbook(ebook);
    out.print("<h2>感谢你的分享！提交成功，待审核确认</h1>");
%>

</body>
</html>
