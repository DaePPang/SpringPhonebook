<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body>
<form action="/home" method="post">
<lable for="name">이름:</lable>
<input type="text" id="name" name="name">
<br>
<lable for="hp">전화번호:</lable>
<input type="text" id="hp" name="hp">
<br>
<lable for="memo">메모:</lable>
<input type="text" id="memo" name="memo">
<br>
<input type="button" value="전송" onclick="tran()">
</form>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function tran(){
	var data={											// 제이슨을 만들어주는 형태
			name : $('#formname').val(),
			hp   : $('#formhp').val(),
			memo : $('#formmemo').val(),
	}
	$.ajax({
		url : "/formProc",
		type : "post",
		data: JSON.stringify(data),					//JSON.Stringify(data) 자주 사용한대
		contentType :"application/json; charset=utf-8",
    //이렇게 안하면 제이슨 형식이 안됨
		dataType : "JSON",			//이렇게 안하면 제이슨 형식이 안됨
		success : function(data)
		{
			alert(data.name+":"+data.hp+":"+data.memo)//Json으로 
		}
	});
}
</script>
</body>
</html>