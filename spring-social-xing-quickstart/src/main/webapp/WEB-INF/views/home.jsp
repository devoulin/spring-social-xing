<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
	<ul>
		<li><a href="<c:url value="/signout" />">Sign Out</a></li>
	</ul>
	<h3>Your Xing Friends</h3>
	<ul>
	<c:forEach items="${friends}" var="friend">
		<li><img src="<c:out value="${friend.photoUrls.mediumThumb}"/>" align="middle"/><c:out value="${friend.displayName}"/></li>
	</c:forEach>
	</ul>	
	</body>
</html>