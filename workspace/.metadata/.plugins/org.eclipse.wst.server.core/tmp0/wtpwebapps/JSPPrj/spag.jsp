<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
pageContext.setAttribute("result", "hello");

%>

<body>
	<%=request.getAttribute("result") %> 입니다.	<br >
	${result} 입니다.<br >
	${names[1]} <br>
	${noticce.title }<br>
	${result} <br>
	${requestScope.result } <br>
	${param.n } <br>
	${param.n ge 3 } <br>
	${empty param.n? '값이 비어 있습니다':param.n} <br>
	${param.n/2 }<br>
	${header.Host } <br>
	${cookie} <br>
	${pageContext.request.method}
</body>
</html>