<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of User</title>
<!-- BootStrap CSS CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
<!-- BootStrap Js, Popper.js, jQuery CDN -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js" integrity="sha384-a5N7Y/aK3qNeh15eJKGWxsqtnX/wWdSZSKp+81YjTmS15nvnvxKHuzaWwXHDli+4" crossorigin="anonymous"></script>
</head>
<body>
<h1>User List</h1>
<table class="table">
	<thead>
		<tr>
			<th scope="col">이메일</th>
			<th scope="col">이름</th>
			<th scope="col">프로필 저장 장소</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${userlist}" var="userManagingVO">
		<tr>
			<td><a href='/usermanaging/read?bno=${userManagingVO.uemail}'>${userManagingVO.uemail}</td>
			<td>${userManagingVO.uname}</td>
			<td>${userManagingVO.uprofile}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

<footer>
<h4>-------------</h4>
<a href='/admin/main'>관리자 페이지로 이동</a>
</footer>
</body>
</html>