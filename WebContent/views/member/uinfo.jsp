<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import= "com.sds.icto.mysite.vo.*" %>
<%
	MemberVo authMember = (MemberVo)session.getAttribute("authMember");
%>
<!doctype html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/mysite/assets/css/main.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<div id="header">
			<jsp:include page="/views/include/header.jsp" flush="false"/>
		</div>
		<div id="wrapper">
			<div id="content">
				<div id="site-introduction">
					<h2>회원 정보</h2>
					<p>
						아이디 : <%=authMember.getName() %><br>
						이메일 : <%=authMember.getEmail() %><br>
						성  별 : <%=authMember.getGender() %><br><br>
								
						<a href="/mysite/member?a=">메인</a>으로 돌아가기<br>				
					</p>
				</div>
			</div>
		</div>
		<div id="navigation">
			<jsp:include page="/views/include/navigation.jsp"/>
		</div>
		<div id="footer">
			<jsp:include page="/views/include/footer.jsp"/>
		</div>
	</div>
</body>
</html>