<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>update Emp</title>
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
						<a href="#">Main</a>
					</h1>
				</div>
				<div id="navigation"></div>
			</div>
			<div id="content">
				<p id="whereami"></p>
				<h1>update Emp info:</h1>
				<form action="<s:url action="person_update" namespace="/person"/>"
					method="post">
					<table cellpadding="0" cellspacing="0" border="0"
						class="form_table">
						<tr>
							<td valign="middle" align="right">id:</td>
							<td valign="middle" align="left">
								<h1>d壥功看到凌丰咖啡；</h1>
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">name:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="person.name"
								value="111<s:property value="#parameters.name"/>" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">salary:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="person.salary"
								value="<s:property value="#parameters.salary"/>" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">age:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="person.age"
								value="<s:property value="#parameters.age"/>" /></td>
						</tr>
					</table>
					<p>
						<input type="submit" class="button" value="Confirm" />
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
