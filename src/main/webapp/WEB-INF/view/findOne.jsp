<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function fix(){
	$(function(){
		$("#findOnename").removeAttr("readonly");
		$("#findOneHp").removeAttr("readonly");
		$("#findOneMemo").removeAttr("readonly");
		$("#fix").css("display", "none");
		$("#update").css("display", "block");
	});
}
function update(){
	$(function(){
		$("#fix").css("display", "block");
		$("#update").css("display", "none");
	})
	var name=document.getElementById("findOnename").value
	var hp=document.getElementById("findOneHp").value
	var memo=document.getElementById("findOneMemo").value
	//document.querySelector("#name");
	console.log(findOnename);
	console.log(findOneHp);
	console.log(findOneMemo);
	//전화번호부를 입력하면 DB입력이되고 리스트에 출력
	//(DB입력 후 결과는 리스트를 가지고오라)
	$.ajax({
		url:"/update?name="+name+"&hp="+hp+"&memo="+memo+"&idx="+${phonebook.idx },
		success:function(result){$("#list").html(result);}
	});
	

}
function deletelist(idx){
	$.ajax({
		url:"/delete?idx="+idx,
		success:function(result){$("#list").html(result);
		alert("삭제 완료");

		document.querySelector("#findOnename").value="";
		document.querySelector("#findOneHp").value="";
		document.querySelector("#findOneMemo").value="";
		}
		
	});
};
</script>
    
    
<lable for="name">이름:</lable>
<input type="text" id="findOnename" name="name" readonly value="${phonebook.name }">
<br>
<lable for="hp">전화번호:</lable>
<input type="text" id="findOneHp" name="hp" readonly value="${phonebook.hp }">
<br>
<lable for="memo">메모:</lable>
<input type="text" id="findOneMemo" name="memo" readonly value="${phonebook.memo }">
<br>
<input type="button" id="fix" value="잠금해제" onclick="fix()"style= "display:block" >
<br>
<input type="button" id="update" value="수정하기" onclick="update()" style ="display:none" >
<br>

 <input type="button" value="삭제하기" onclick="deletelist(${phonebook.idx } )">
<br>
