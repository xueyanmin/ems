<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>regist</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<s:url value="/css/style.css"/>" />
</head>
<%
	Date date = new Date();
	SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
	String date1 = d.format(date);
%>
<body>
	<div id="wrap">
		<div id="top_content">
			<div id="header">
				<div id="rightheader">
					<p>
						<%=date1 %> <br />
					</p>
				</div>
				<div id="topheader">
					<h1 id="title">
						<a href="#">main</a>
					</h1>
				</div>
				<div id="navigation"></div>
			</div>
			<div id="content">
				<p id="whereami"></p>
				<h1>注册</h1>
				<form action="<s:url action='UserAction_regist' namespace='/user'/>"
					method="post">
					<table cellpadding="0" cellspacing="0" border="0"
						class="form_table">
						<tr>
							<td valign="middle" align="right">用户名:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="user.username" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">真实姓名:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="user.realname" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">密码:</td>
							<td valign="middle" align="left"><input type="password"
								class="inputgri" name="user.password" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">性别:</td>
							<td valign="middle" align="left">男 <input type="radio"
								class="inputgri" name="user.sex" value="m" checked="checked" />
								女 <input type="radio" class="inputgri" name="user.sex" value="f" />
							</td>
						</tr>

						<tr>
							<td valign="middle" align="right">验证码: <img id="num"
								src="<s:url action="yzm" namespace="/user"/>" /> <a
								href="<s:url value="regist.jsp"/>"
								onclick="document.getElementById('num').src = 'image?'+(new Date()).getTime()">换一张</a>
							</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="user.yzm" /></td>
						</tr>
					</table>
					<p>
						<input type="submit" class="button" value="Submit &raquo;" />
					</p>
				</form>
			</div>
		</div>
		<div id="footer">
			<div id="footer_bg">ABC@126.com</div>
		</div>
	</div>
</body>
</html>