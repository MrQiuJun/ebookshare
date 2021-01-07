<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.wuwang.ebookshare.service.EbookService" %>
<%@ page import="com.wuwang.ebookshare.utils.EbooksFindCondition" %>
<%@ page import="com.wuwang.ebookshare.pojo.Ebook" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>电子书分享-找书</title>
</head>
<body>
	<%
		EbookService es = new EbookService();
		String nameCondition = request.getParameter("bookName");
		EbooksFindCondition ebooksfd = new EbooksFindCondition(nameCondition);
		ArrayList<Ebook> ebooks = es.findEbooks(ebooksfd);
		request.setAttribute("ebooks", ebooks);
	%>
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
		
	<!--条件查询-->
	<br /><form action="http://49.235.252.43:8080/ebookshare/index.jsp" method="get" style="width: 100%;">
		条件查询： 书名  <input type="text"  style="width: 100px;" name="bookName"/>
		<input type="submit" value="查询"/>
	</form><br />
		
	<!--数据显示-->
	<table border="1px" style="width:100%">
		<tr>
				<td>序号</td>
				<td>书名</td>
				<td>文件格式</td>
				<td>描述</td>
				<td>分享来源</td>
				<td>分享链接</td>
				<td>提取码</td>
				<td>分享留言</td>
		</tr>
		
		<c:forEach items="${requestScope.ebooks}" var="ebook">
			<tr>
				<td>${ebook.book_id}</td>
				<td>${ebook.book_name}</td>
				<td>${ebook.book_formate}</td>
				<td>${ebook.book_descriptions}</td>
				<td>${ebook.book_url_from}</td>
				<td><a href="${ebook.book_url}" target="_blank"/>${ebook.book_url}</td>
				<td>${ebook.book_url_code}</td>
				<td>${ebook.user_message}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>