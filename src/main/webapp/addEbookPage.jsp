<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>电子书分享</title>
    <style>
        div.xrequired {color: #c61c1c;}
    </style>
</head>
<body>
<!--头部-->
<div style="background-color: cornflowerblue; color: white; width: 100%;height:80px;">
    <h1 style="line-height: 80px; margin-left:30px;">电子书分享</h1>
</div>

<!--菜单-->
<table style="border:1px solid cornflowerblue ; width: 100%; ">
    <tr>
        <td width="10%"><a href="http://49.235.252.43:8080/ebookshare/index.jsp">      我要找书</a></td>
        <td width="10%"><a href="http://49.235.252.43:8080/ebookshare/addEbookPage.jsp">我要分享</a></td>
        <td></td>
        <td></td>
        <td width="50%"></td>
    </tr>
</table>

<!--增加表单-->
<form action="http://49.235.252.43:8080/ebookshare/addEbook.jsp" method="get" style="margin-left: 50px; margin-top: 30px;">
    <table>
        <tr>
            <td><div class="xrequired">书名：</div></td>
            <td><input type="text"  name="book_name"/></td>
        </tr>
        <tr>
            <td>文件格式：</td>
            <td><select style="width: 170px; height: 25px;" name="book_formate">
                <option value="PDF">.pdf</option>
                <option value="TXT">.txt</option>
                <option value="MOBI">.mobi</option>
                <option value="">其他/未知</option>
            </select>
            </td>
        </tr>
        <tr>
            <td>描述：</td>
            <td><input type="text"  name="book_descriptions"/></td>
        </tr>
        <tr>
            <td>分享来源：</td>
            <td><select style="width: 170px; height: 25px;" name="book_url_from">
                <option value="百度网盘">百度网盘</option>
                <option value="">其他</option>
            </select>
            </td>
        </tr>
        <tr>
            <td><div class="xrequired">分享链接：</div></td>
            <td><input type="text"  name="book_url"/></td>
        </tr>
        <tr>
            <td><div class="xrequired">提取码：</div></td>
            <td><input type="text"  name="book_url_code"/></td>
        </tr>
        <tr>
            <td>分享留言：</td>
            <td><input type="text"  name="user_message"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="提交" width="50%"/><input type="reset" value="取消" width="50%"/></td>
        </tr>
    </table>
</form>

</body>
</html>
