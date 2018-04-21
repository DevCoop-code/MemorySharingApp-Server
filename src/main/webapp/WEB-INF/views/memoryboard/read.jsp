<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- BootStrap CSS CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
<!-- BootStrap Js, Popper.js, jQuery CDN -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js" integrity="sha384-a5N7Y/aK3qNeh15eJKGWxsqtnX/wWdSZSKp+81YjTmS15nvnvxKHuzaWwXHDli+4" crossorigin="anonymous"></script>
<title>Read Page</title>
<script>
$(document).ready(function(){
	var formObj = $("form[role='form']");
	
	//삭제
	$(".btn-danger").on("click", function(){
		formObj.attr("action", "/memoryboard/remove");
		formObj.submit();
	});
	//목록
	$(".btn-primary").on("click", function(){
		self.location = "/memoryboard/listAll";
	});
});
</script>
</head>
<body>
<h1>Read Memory</h1>
<form role="form" method="post">
	<input type='hidden' name='bno' value='${memoryBoardVO.bno}'/>
</form>

<div class="box-body">
	<div class="form-group">
		<p>이메일 : ${memoryBoardVO.uemail}</p>
		<p>이미지 저장 위치 : ${memoryBoardVO.imagepath}</p>
		<p>추억 : ${memoryBoardVO.description}</p>
		<p>위도 : ${memoryBoardVO.latitude}</p>
		<p>경도 : ${memoryBoardVO.longitude}</p>
	</div>
</div>

<div class="box-footer">
	<button type="submit" class="btn btn-danger">삭제</button>
	<button type="submit" class="btn btn-primary">목록</button>
</div>
</body>
</html>