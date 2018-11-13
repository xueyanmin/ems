<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>emplist</title>
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
				<h1>Welcome!</h1>
				<table class="table">
					<tr class="table_header">
						<td>ID</td>
						<td>Name</td>
						<td>Salary</td>
						<td>Age</td>
						<td>Operation</td>
					</tr>
					<s:iterator value="list">
						<tr class="row1">
							<td><s:property value="id" /></td>
							<td><s:property value="name" /></td>
							<td><s:property value="salary" /></td>
							<td><s:property value="age" /></td>
							<td><a
								href='<s:url action='person_delPerson' namespace='/person'/>?person.id=<s:property value="id"/>'><input
									type="submit" value="delete"></a>&nbsp;&nbsp; <a
								href="<s:url value="../updateEmp.jsp"/>?person.id=<s:property value="id"/>&person.name=<s:property value="name"/>&person.salary=<s:property value="salary"/>&person.age=<s:property value="age"/>"><input
									type="submit" value="update"></a></td>
						</tr>
					</s:iterator>

				</table>
				<p>
					<input type="submit" class="button" value="Add Employee"
						onclick="location='<s:url value="/addEmp.jsp"/>'" />
				</p>
			</div>
		</div>
		<div id="footer">
			<div id="footer_bg">ABC@126.com</div>
		</div>
	</div>
</body>
</html>
