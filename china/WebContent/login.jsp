<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页</title>
</head>
<body><!-- ${pageContext.request.contextPath }/ -->
	<form action="${pageContext.request.contextPath }/loginServlet" method="post" name=form>
		用户名:<input type="text" name="name"placeholder="输入用户名"size=18><br /><br />
		密&nbsp;码:&nbsp;&nbsp; <input type="password" name="pwd"placeholder="输入密码"size=18><br />
	<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="submit" value="登录">&nbsp;&nbsp;&nbsp; 
		<a href="register.jsp"  style="text-decoration:none;">注册</a>
	</form>

</body>
</html>